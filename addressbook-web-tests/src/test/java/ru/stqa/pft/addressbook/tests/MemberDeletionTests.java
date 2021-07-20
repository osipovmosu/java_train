package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class MemberDeletionTests extends TestBase {

    @Test
    public void testMemberDeletion() {
        app.getNavigationHelper().gotoGroupPage();
        //app.getGroupHelper().selectMember();
        //app.getGroupHelper().deleteSelectedMembers();
        app.getGroupHelper().returnToGroupPage();
    }


}
