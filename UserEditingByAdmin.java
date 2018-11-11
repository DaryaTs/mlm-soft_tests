package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UserEditingByAdmin {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUserEditingByAdmin() throws Exception {
    driver.get("https://unigold.drupal.mlm-soft.com/");
    driver.findElement(By.linkText("Log in")).click();
    driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).clear();
    driver.findElement(By.id("edit-name")).sendKeys("support@mlm-soft.com");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).clear();
    driver.findElement(By.id("edit-pass")).sendKeys("password_0");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.id("toolbar-link-admin-people")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=1 | ]]
    driver.findElement(By.linkText("daria90_58@mail.ru")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    driver.findElement(By.linkText("Edit")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=1 | ]]
    driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).clear();
    driver.findElement(By.id("edit-name")).sendKeys("daria90_5@mail.ru");
    driver.findElement(By.id("edit-mail")).click();
    driver.findElement(By.id("edit-mail")).clear();
    driver.findElement(By.id("edit-mail")).sendKeys("daria90_5@mail.ru");
    driver.findElement(By.id("edit-mail")).sendKeys(Keys.DOWN);
    driver.findElement(By.id("edit-mail")).sendKeys(Keys.DOWN);
    driver.findElement(By.id("edit-mail")).sendKeys(Keys.DOWN);
    driver.findElement(By.id("edit-mail")).sendKeys(Keys.DOWN);
    driver.findElement(By.id("edit-mail")).sendKeys(Keys.DOWN);
    driver.findElement(By.id("edit-mail")).clear();
    driver.findElement(By.id("edit-mail")).sendKeys("daria90_5@mail.ru");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='daria90_5@mail.ru'])[3]/following::div[6]")).click();
    try {
      assertEquals("Status message\nThe changes have been saved.", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='daria90_5@mail.ru'])[3]/following::div[6]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).clear();
    driver.findElement(By.id("edit-name")).sendKeys("daria90_58@mail.ru");
    driver.findElement(By.id("edit-mail")).click();
    driver.findElement(By.id("edit-mail")).clear();
    driver.findElement(By.id("edit-mail")).sendKeys("daria90_58@mail.ru");
    driver.findElement(By.id("edit-mail")).sendKeys(Keys.DOWN);
    driver.findElement(By.id("edit-mail")).clear();
    driver.findElement(By.id("edit-mail")).sendKeys("daria90_58@mail.ru");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.id("overlay-close")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    driver.findElement(By.linkText("Log out")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
