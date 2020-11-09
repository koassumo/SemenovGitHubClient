package ru.geekbrains.semenovgithubclient.mvp.presenter;

import moxy.MvpPresenter;
import ru.geekbrains.semenovgithubclient.GithubApplication;
import ru.geekbrains.semenovgithubclient.R;
import ru.geekbrains.semenovgithubclient.mvp.model.Model;
import ru.geekbrains.semenovgithubclient.mvp.view.MainView;
import ru.geekbrains.semenovgithubclient.navigation.Screens;
import ru.terrakok.cicerone.Router;

public class MainPresenter extends MvpPresenter<MainView> {
    private Router router = GithubApplication.getApplication().getRouter();

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();

        // TODO: Nothing to do

        router.replaceScreen(new Screens.UsersScreen());
    }

    public void backClicked() {
        router.exit();
    }

}

