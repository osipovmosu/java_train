package ru.stqa.pft.addressbook;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MemberCreationTests {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMemberCreationTests() throws Exception {
    driver.get("http://localhost/addressbook/");
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.xpath("//input[@value='Login']")).click();
    driver.findElement(By.linkText("groups")).click();
    driver.findElement(By.name("new")).click();
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).clear();
    driver.findElement(By.name("group_name")).sendKeys("test1");
    driver.findElement(By.name("group_header")).click();
    driver.findElement(By.name("group_header")).clear();
    driver.findElement(By.name("group_header")).sendKeys("test2");
    driver.findElement(By.name("group_footer")).click();
    driver.findElement(By.name("group_footer")).clear();
    driver.findElement(By.name("group_footer")).sendKeys("test3");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.xpath("//div[@id='content']/div")).click();
    driver.findElement(By.xpath("//div[@id='content']/div")).click();
    driver.findElement(By.linkText("group page")).click();
    driver.findElement(By.linkText("Logout")).click();
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.id("LoginForm")).submit();
    driver.findElement(By.linkText("add new")).click();
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys("Dmitriy");
    driver.findElement(By.name("middlename")).click();
    driver.findElement(By.name("middlename")).click();
    driver.findElement(By.name("middlename")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | name=middlename | ]]
    driver.findElement(By.name("middlename")).clear();
    driver.findElement(By.name("middlename")).sendKeys("Osipov");
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("middlename")).click();
    driver.findElement(By.name("middlename")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | name=middlename | ]]
    driver.findElement(By.name("middlename")).clear();
    driver.findElement(By.name("middlename")).sendKeys("Yurievich");
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys("Osipov");
    driver.findElement(By.name("nickname")).click();
    driver.findElement(By.name("title")).click();
    driver.findElement(By.name("nickname")).click();
    driver.findElement(By.name("nickname")).clear();
    driver.findElement(By.name("nickname")).sendKeys("Nick");
    driver.findElement(By.name("title")).click();
    driver.findElement(By.name("title")).clear();
    driver.findElement(By.name("title")).sendKeys("Title1");
    driver.findElement(By.name("company")).click();
    driver.findElement(By.name("company")).clear();
    driver.findElement(By.name("company")).sendKeys("RB");
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys("Andropova");
    driver.findElement(By.name("home")).click();
    driver.findElement(By.name("home")).click();
    driver.findElement(By.name("home")).clear();
    driver.findElement(By.name("home")).sendKeys("2223322");
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).clear();
    driver.findElement(By.name("mobile")).sendKeys("89022223322");
    driver.findElement(By.name("work")).click();
    driver.findElement(By.name("work")).clear();
    driver.findElement(By.name("work")).sendKeys("3334455");
    driver.findElement(By.name("fax")).click();
    driver.findElement(By.name("fax")).clear();
    driver.findElement(By.name("fax")).sendKeys("555677");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | name=email | ]]
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("rabota@rabota.ru");
    driver.findElement(By.name("email2")).click();
    driver.findElement(By.name("email2")).click();
    driver.findElement(By.name("email2")).click();
    driver.findElement(By.name("email2")).clear();
    driver.findElement(By.name("email2")).sendKeys("rabota1@rabota.ru");
    driver.findElement(By.name("email3")).click();
    driver.findElement(By.name("email3")).clear();
    driver.findElement(By.name("email3")).sendKeys("rabota@rabota.ru");
    driver.findElement(By.name("email2")).click();
    driver.findElement(By.name("email2")).clear();
    driver.findElement(By.name("email2")).sendKeys("rabota2@rabota.ru");
    driver.findElement(By.name("email3")).click();
    driver.findElement(By.name("email3")).clear();
    driver.findElement(By.name("email3")).sendKeys("rabota3@rabota.ru");
    driver.findElement(By.name("homepage")).click();
    driver.findElement(By.name("homepage")).clear();
    driver.findElement(By.name("homepage")).sendKeys("www.raif.ru");
    driver.findElement(By.name("bday")).click();
    new Select(driver.findElement(By.name("bday"))).selectByVisibleText("1");
    driver.findElement(By.name("bday")).click();
    driver.findElement(By.name("bmonth")).click();
    new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText("January");
    driver.findElement(By.name("bmonth")).click();
    driver.findElement(By.name("byear")).click();
    driver.findElement(By.name("byear")).clear();
    driver.findElement(By.name("byear")).sendKeys("1980");
    driver.findElement(By.name("theform")).click();
    driver.findElement(By.name("aday")).click();
    new Select(driver.findElement(By.name("aday"))).selectByVisibleText("2");
    driver.findElement(By.name("aday")).click();
    driver.findElement(By.name("amonth")).click();
    new Select(driver.findElement(By.name("amonth"))).selectByVisibleText("February");
    driver.findElement(By.name("amonth")).click();
    driver.findElement(By.name("ayear")).click();
    driver.findElement(By.name("ayear")).clear();
    driver.findElement(By.name("ayear")).sendKeys("1990");
    driver.findElement(By.name("new_group")).click();
    driver.findElement(By.name("theform")).click();
    driver.findElement(By.name("new_group")).click();
    driver.findElement(By.name("theform")).click();
    driver.findElement(By.name("address2")).click();
    driver.findElement(By.name("address2")).clear();
    driver.findElement(By.name("address2")).sendKeys("Address note");
    driver.findElement(By.name("phone2")).click();
    driver.findElement(By.name("theform")).click();
    driver.findElement(By.name("notes")).click();
    driver.findElement(By.name("notes")).clear();
    driver.findElement(By.name("notes")).sendKeys("Notes1");
    driver.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    driver.findElement(By.linkText("home")).click();
    driver.findElement(By.linkText("Logout")).click();
  }

  @AfterClass(alwaysRun = true)
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
