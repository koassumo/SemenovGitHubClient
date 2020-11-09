package ru.geekbrains.semenovgithubclient.mvp.view;

import moxy.MvpView;
import moxy.viewstate.strategy.alias.AddToEndSingle;

@AddToEndSingle
public interface UsersView extends MvpView {
    void init();
    void updateList();
}
