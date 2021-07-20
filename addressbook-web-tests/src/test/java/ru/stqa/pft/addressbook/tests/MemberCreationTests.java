package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.MemberData;

public class MemberCreationTests extends TestBase {

  @Test
  public void testMemberCreation() throws Exception {
    app.getMemberHelper().initMemberCreation();
    app.getMemberHelper().fillMemberForm(new MemberData("Dmitriy", "Yurievich", "Osipov", "Nick", "Title1"));
    app.getMemberHelper().submitMemberCreation();
    app.getMemberHelper().returnToHomePage();
  }

}
