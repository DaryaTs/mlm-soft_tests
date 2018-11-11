package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationByReferralLink {
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
  public void testRegistrationByReferralLink() throws Exception {
    driver.get("https://drupal.mlm-soft.com/site/login");
    driver.findElement(By.id("adminuserloginform-email")).click();
    driver.findElement(By.id("adminuserloginform-email")).clear();
    driver.findElement(By.id("adminuserloginform-email")).sendKeys("admin@mlm-soft.com");
    driver.findElement(By.id("adminuserloginform-password")).clear();
    driver.findElement(By.id("adminuserloginform-password")).sendKeys("password_0");
    driver.findElement(By.name("login-button")).click();
    driver.findElement(By.linkText("Entire Network")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Riynolds S.'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Riynolds S.'])[1]/following::a[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Activity'])[1]/following::td[1]")).click();
    try {
      assertEquals("Active", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Activity'])[1]/following::td[1]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jump'])[5]/following::span[2]")).click();
    driver.findElement(By.linkText("Logout")).click();
    driver.get("https://unigold.drupal.mlm-soft.com/");
    driver.findElement(By.linkText("Log in")).click();
    driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).clear();
    driver.findElement(By.id("edit-name")).sendKeys("user33@example.com");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).clear();
    driver.findElement(By.id("edit-pass")).sendKeys("password_0");
    driver.findElement(By.id("user-login")).submit();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.linkText("View")).click();
    driver.findElement(By.name("op")).click();
    driver.findElement(By.linkText("Log out")).click();
    driver.get("https://unigold.drupal.mlm-soft.com/user/register?ref=409");
    driver.findElement(By.id("edit-mlm-sponsor-id")).click();
    try {
      assertEquals("33", driver.findElement(By.id("edit-mlm-sponsor-id")).getAttribute("value"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // ERROR: Caught exception [ERROR: Unsupported command [isEditable | id=edit-mlm-sponsor-id | ]]
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
