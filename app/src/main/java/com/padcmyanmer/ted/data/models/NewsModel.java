package com.padcmyanmer.ted.data.models;

import com.padcmyanmer.ted.network.HttpUrlConnectionDataAgentImpl;
import com.padcmyanmer.ted.network.TalksDataAgent;


////// Singleton pattern///////////////
public class NewsModel {

    private static final String DUMMY_ACCESS_TOKEN="b002c7e1a528b7cb460933fc2875e916";
    private static NewsModel objInstance;

    private TalksDataAgent mDataAgent;

    private NewsModel() {
            mDataAgent= HttpUrlConnectionDataAgentImpl.getObjInstance();
    }

    public static NewsModel getObjInstance() {

        if (objInstance == null) {
            objInstance = new NewsModel(); //not save for thread

        }// factory logic

        return objInstance;
    }

    public  void loadTalksList(){
        mDataAgent.loadTalksList(1,DUMMY_ACCESS_TOKEN);
    }
}