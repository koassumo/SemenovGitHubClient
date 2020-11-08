package ru.geekbrains.semenovgithubclient.mvp.presenter;

import moxy.MvpPresenter;
import ru.geekbrains.semenovgithubclient.R;
import ru.geekbrains.semenovgithubclient.mvp.model.Model;
import ru.geekbrains.semenovgithubclient.mvp.view.MainView;

public class Presenter extends MvpPresenter<MainView> {
    private Model model = new Model();

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();

        // TODO: nothing to do
    }

    public void counterOneClick () {
        getViewState().setButtonOneText(String.valueOf(model.next(0)));
    }
    public void counterTwoClick () {
        getViewState().setButtonTwoText(String.valueOf(model.next(1)));
    }
    public void counterThreeClick () {
        getViewState().setButtonThreeText(String.valueOf(model.next(2)));
    }

}
