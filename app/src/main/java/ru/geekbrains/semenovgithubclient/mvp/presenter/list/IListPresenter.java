package ru.geekbrains.semenovgithubclient.mvp.presenter.list;

import ru.geekbrains.semenovgithubclient.mvp.view.IItemView;

public interface IListPresenter<V extends IItemView> {
    void onItemClick(V view);
    void bindView(V view);
    int getCount();
}

