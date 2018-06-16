package com.padcmyanmer.ted.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padcmyanmer.ted.delegates.TalksDelegate;

public class NewsViewHolder extends RecyclerView.ViewHolder {

   private TalksDelegate mnewsDelegate;

    public NewsViewHolder(View itemView, TalksDelegate talksDelegate) {
        super(itemView);

        mnewsDelegate = talksDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mnewsDelegate.onTapTalks();
            }
        });
    }

}
