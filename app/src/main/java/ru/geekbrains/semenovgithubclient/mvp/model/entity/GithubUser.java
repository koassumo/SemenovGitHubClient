package ru.geekbrains.semenovgithubclient.mvp.model.entity;

public class GithubUser {
    private String login;

    public GithubUser(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
