package com.example.android.reddit;

/**
 * Created by Tabs on 26. 02. 2017.
 */

public class Thread {

    private String mThreadName;
    private String mUrl;

    public Thread(String mThreadName,String mUrl) {
        this.mThreadName = mThreadName;
        this.mUrl = mUrl;
    }

    public String getThreadName() {
        return this.mThreadName;
    }
    public String getUrl(){
        return this.mUrl;
    }
}
