package ru.stqa.pft.addressbook.model;

public class MemberData {
    private final String name;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String title;

    public MemberData(String name, String middlename, String lastname, String nickname, String title) {
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }
}
