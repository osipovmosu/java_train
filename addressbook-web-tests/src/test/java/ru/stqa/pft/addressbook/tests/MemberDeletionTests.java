package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.MemberData;

public class MemberDeletionTests extends TestBase {

    @Test
    public void testMemberDeletion() {
        if (! app.getMemberHelper().isThereAMember()) {
            app.getMemberHelper().createMember(new MemberData("Dmitriy", "Yurievich", "Osipov", "Nick", "Title1"));
        }
        app.getMemberHelper().selectMember();
        app.getMemberHelper().deleteSelectedMembers();
        app.getMemberHelper().acceptMemberDeletion();
        app.getMemberHelper().returnToHomePage();
    }
}
