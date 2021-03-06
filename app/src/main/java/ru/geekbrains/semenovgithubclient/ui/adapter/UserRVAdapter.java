package ru.geekbrains.semenovgithubclient.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import ru.geekbrains.semenovgithubclient.R;
import ru.geekbrains.semenovgithubclient.mvp.presenter.list.IListPresenter;
import ru.geekbrains.semenovgithubclient.mvp.presenter.list.IUserListPresenter;
import ru.geekbrains.semenovgithubclient.mvp.view.UserItemView;

public class UserRVAdapter extends RecyclerView.Adapter<UserRVAdapter.ViewHolder> {

    IUserListPresenter presenter;

    public UserRVAdapter(IUserListPresenter presenter) {
        this.presenter = presenter;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View userView = inflater.inflate(R.layout.item_user, parent, false);

        ViewHolder viewHolder = new ViewHolder(userView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.position = position;

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                presenter.onItemClick(holder);
            }
        });

        presenter.bindView(holder);
    }

    @Override
    public int getItemCount() {
        return presenter.getCount();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements UserItemView {
        TextView textView;
        int position;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = (TextView)itemView.findViewById(R.id.tv_login);
        }

        @Override
        public void setLogin(String text) {
            textView.setText(text);
        }

        @Override
        public int getPos() {
            return position;
        }
    }
}