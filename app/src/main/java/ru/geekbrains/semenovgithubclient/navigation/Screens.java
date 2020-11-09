package ru.geekbrains.semenovgithubclient.navigation;

import androidx.fragment.app.Fragment;

import ru.geekbrains.semenovgithubclient.ui.fragments.UsersFragment;
import ru.terrakok.cicerone.android.support.SupportAppScreen;

public class Screens {
    public static class UsersScreen extends SupportAppScreen {
        @Override
        public Fragment getFragment() {
            return UsersFragment.getInstance(0);
        }
    }
}
