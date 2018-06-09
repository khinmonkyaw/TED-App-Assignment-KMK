package com.padcmyanmer.ted.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.padcmyanmer.ted.R;
import com.padcmyanmer.ted.adapters.WatchNextAdapter;

public class NewsDetailActivity extends AppCompatActivity {

    private RecyclerView rv_watch_next;
    private WatchNextAdapter watchNextAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        rv_watch_next=findViewById(R.id.rv_watch_next_list);
        watchNextAdapter=new WatchNextAdapter();

        rv_watch_next.setAdapter(watchNextAdapter);
        rv_watch_next.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL,
                false));

    }
}
