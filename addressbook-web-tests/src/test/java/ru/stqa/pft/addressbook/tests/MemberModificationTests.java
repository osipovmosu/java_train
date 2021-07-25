package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.MemberData;

public class MemberModificationTests extends TestBase {

    @Test
    public void testMemberModification() {
        if (! app.getMemberHelper().isThereAMember()) {
            app.getMemberHelper().createMember(new MemberData("Dmitriy", "Yurievich", "Osipov", "Nick", "Title1"));
        }
        app.getMemberHelper().selectMember();
        app.getMemberHelper().initMemberModification(); //karandashik
        app.getMemberHelper().fillMemberForm(new MemberData("Dmitriy", "Yurievich", "Osipov", "Nick", "Title2"));
        app.getMemberHelper().submitMemberModification();
        app.getMemberHelper().returnToHomePage();
    }
}
