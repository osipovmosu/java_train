package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.MemberData;

public class MemberHelper extends HelperBase {

    public MemberHelper(WebDriver wd) { super(wd); }

    public void initMemberCreation() { click(By.linkText("add new")); }

    public void returnToHomePage() { click(By.linkText("home"));}

    public void submitMemberCreation() { click(By.name("submit")); }

    public void fillMemberForm(MemberData memberData) {
        type(By.name("firstname"), memberData.getFirstname());
        type(By.name("middlename"), memberData.getMiddlename());
        type(By.name("lastname"), memberData.getLastname());
        type(By.name("nickname"), memberData.getNickname());
        type(By.name("title"), memberData.getTitle());
    }

    public void initMemberModification() {click(By.xpath("//table[@id='maintable']/tbody/tr[4]/td[8]/a/img")); }

    public void submitMemberModification() { click(By.name("update")); }

    public void selectMember() { click(By.name("selected[]")); }

    public void deleteSelectedMembers() { click(By.xpath("//input[@value='Delete']"));}

    public void acceptMemberDeletion() {
        wd.switchTo().alert().accept();
    }
}

