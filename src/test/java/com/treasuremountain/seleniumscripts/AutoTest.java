package com.treasuremountain.seleniumscripts;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "H:\\开发工具\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAuto() throws Exception {
    driver.get("http://microproject-ui.jx-staging.treasuremountain.cn/#/index");
    Thread.sleep(TimeUnit.SECONDS.toMillis(10));
    driver.findElement(By.xpath("//*[@id=\"id1\"]/span")).click();
    Thread.sleep(TimeUnit.SECONDS.toMillis(10));
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='名称'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='名称'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='名称'])[1]/following::input[1]")).sendKeys("aaaa");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='信息'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='信息'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='信息'])[1]/following::input[1]")).sendKeys("bbbbbb");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='信息'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div[2]/table/tbody/tr[13]/td[4]/div/button[2]/span")).click();
    Thread.sleep(TimeUnit.SECONDS.toMillis(10));
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='信息'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='信息'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='信息'])[1]/following::input[1]")).sendKeys("bbbbbb22");
    driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[3]/div/button[1]/span")).click();
    Thread.sleep(TimeUnit.SECONDS.toMillis(10));
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div[2]/table/tbody/tr[13]/td[4]/div/button[1]/span")).click();
    Thread.sleep(TimeUnit.SECONDS.toMillis(10));
    driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[2]/span")).click();
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
