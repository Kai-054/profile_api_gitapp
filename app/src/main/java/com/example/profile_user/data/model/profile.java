package com.example.profile_user.data.model;

public class profile {
    private String login;
    private String name;
    private String avatar_url;
    private int following;


    public profile(String login, String name, String avatar_url, int following) {
        this.login = login;
        this.name = name;
        this.avatar_url = avatar_url;
        this.following = following;
    }

    public String getLogin() {

        return login;
    }

    public void setLogin(String login) {

        this.login = login;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAvatar_url() {

        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {

        this.avatar_url = avatar_url;
    }

    public int getFollowing() {

        return following;
    }

    public void setFollowing(int following) {

        this.following = following;
    }

}
