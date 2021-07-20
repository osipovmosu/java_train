package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
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
