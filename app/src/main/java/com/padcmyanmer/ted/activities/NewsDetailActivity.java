package com.padcmyanmer.ted.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.padcmyanmer.ted.R;
import com.padcmyanmer.ted.adapters.WatchNextAdapter;

public class NewsDetailActivity extends BaseActivity {

    private RecyclerView rvWatchNext;
    private WatchNextAdapter watchNextAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        rvWatchNext=findViewById(R.id.rv_watch_next_list);
        watchNextAdapter=new WatchNextAdapter();

        rvWatchNext.setAdapter(watchNextAdapter);
        rvWatchNext.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL,
                false));

    }
}
