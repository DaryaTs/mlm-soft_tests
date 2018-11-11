package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CorrectDashboardOpening {
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
  public void testCorrectDashboardOpening() throws Exception {
    driver.get("https://unigold.drupal.mlm-soft.com/");
    driver.findElement(By.linkText("Log in")).click();
    driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).clear();
    driver.findElement(By.id("edit-name")).sendKeys("user2@example.com");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).clear();
    driver.findElement(By.id("edit-pass")).sendKeys("Password_0");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("Online office")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Dashboard'])[2]/following::h3[1]")).click();
    try {
      assertEquals("Account Status", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Dashboard'])[2]/following::h3[1]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Downline'])[1]/following::h3[1]")).click();
    try {
      assertEquals("My team", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Downline'])[1]/following::h3[1]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Spill Leg'])[1]/following::h3[1]")).click();
    try {
      assertEquals("Career", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Spill Leg'])[1]/following::h3[1]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Matching Bonus'])[1]/following::div[5]")).click();
    try {
      assertEquals("Virtual Wallet", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Matching Bonus'])[1]/following::div[5]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Virtual Wallet'])[1]/following::div[7]")).click();
    try {
      assertEquals("Gold", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Virtual Wallet'])[1]/following::div[7]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Gold'])[1]/following::div[7]")).click();
    try {
      assertEquals("Unigoldcoin", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Gold'])[1]/following::div[7]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Unigoldcoin'])[2]/following::span[1]")).click();
    try {
      assertEquals("Group Volume", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Unigoldcoin'])[2]/following::span[1]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nov 11'])[2]/following::span[1]")).click();
    try {
      assertEquals("Team bonus", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nov 11'])[2]/following::span[1]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No data'])[1]/following::span[1]")).click();
    try {
      assertEquals("Matching bonus", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No data'])[1]/following::span[1]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nov 11'])[3]/following::span[1]")).click();
    try {
      assertEquals("My network", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nov 11'])[3]/following::span[1]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nov 11'])[4]/following::span[1]")).click();
    try {
      assertEquals("Left team", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nov 11'])[4]/following::span[1]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No data'])[2]/following::span[1]")).click();
    try {
      assertEquals("Right team", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No data'])[2]/following::span[1]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Log out")).click();
    driver.findElement(By.linkText("Log in")).click();
    driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).clear();
    driver.findElement(By.id("edit-name")).sendKeys("admin");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).clear();
    driver.findElement(By.id("edit-pass")).sendKeys("f9RpuyBlMk1piFAl");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.id("toolbar-link-admin-reports")).click();
    driver.findElement(By.linkText("Recent log messages")).click();
    try {
      assertEquals("execPost code: 200, data: {\"errorCode\":0,...", driver.findElement(By.linkText("execPost code: 200, data: {\"errorCode\":0,...")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
