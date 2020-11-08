package ru.geekbrains.semenovgithubclient.mvp.view;


import moxy.MvpView;
import moxy.viewstate.strategy.alias.AddToEndSingle;

@AddToEndSingle
public interface MainView extends MvpView {

    void setButtonOneText (String text);
    void setButtonTwoText (String text);
    void setButtonThreeText (String text);

}
