package com.padcmyanmer.ted.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padcmyanmer.ted.delegates.NewsDelegate;

public class NewsViewHolder extends RecyclerView.ViewHolder {

   private NewsDelegate mnewsDelegate;

    public NewsViewHolder(View itemView, NewsDelegate newsDelegate) {
        super(itemView);

        mnewsDelegate = newsDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mnewsDelegate.onTapNews();
            }
        });
    }

}
