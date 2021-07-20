package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MemberDeletionTests extends TestBase {

    @Test
    public void testMemberDeletion() {
        app.getMemberHelper().selectMember();
        app.getMemberHelper().deleteSelectedMembers();
        app.getMemberHelper().acceptMemberDeletion();
        app.getMemberHelper().returnToHomePage();
    }


}
