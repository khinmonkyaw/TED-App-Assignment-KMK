package com.padcmyanmer.ted.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.padcmyanmer.ted.R;
import com.padcmyanmer.ted.delegates.TalksDelegate;
import com.padcmyanmer.ted.viewholders.NewsViewHolder;

public class NewsAdapter extends RecyclerView.Adapter {

    private TalksDelegate mnewsDelegate;

    public NewsAdapter(TalksDelegate mnewsDelegate) {
        this.mnewsDelegate = mnewsDelegate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.view_holder_news1,parent,false);
        return new NewsViewHolder(view,mnewsDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
