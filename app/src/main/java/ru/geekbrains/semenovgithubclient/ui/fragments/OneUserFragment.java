package ru.geekbrains.semenovgithubclient.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import moxy.MvpAppCompatFragment;
import moxy.presenter.InjectPresenter;
import ru.geekbrains.semenovgithubclient.R;
import ru.geekbrains.semenovgithubclient.mvp.presenter.OneUserPresenter;
import ru.geekbrains.semenovgithubclient.mvp.presenter.UsersPresenter;
import ru.geekbrains.semenovgithubclient.mvp.view.UsersView;
import ru.geekbrains.semenovgithubclient.ui.BackButtonListener;
import ru.geekbrains.semenovgithubclient.ui.adapter.UserRVAdapter;

public class OneUserFragment extends MvpAppCompatFragment implements UsersView, BackButtonListener {

    private View view;

    @InjectPresenter
    OneUserPresenter oneUserPresenter;

    public static OneUserPresenter getInstance(int data) { // недефолтный конструктор фрагмента создавать нельзя!!!
        OneUserFragment fragment = new OneUserFragment();

        Bundle bundle = new Bundle();
        bundle.putInt("key", data);

        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getArguments();

        if (bundle != null) {
            // запоминаем
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_one_user, container, false);

        return view;
    }

    @Override
    public void init() {
        //layoutManager = new LinearLayoutManager(view.getContext());
    }

    @Override
    public void updateList() {

    }

    @Override
    public boolean backPressed() {
        return oneUserPresenter.backPressed();
    }
}