package com.ppm.retrofit2demo;

import android.app.Application;

import com.ppm.retrofit2demo.net.NetworkManager;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        NetworkManager.getInstance().init();
    }
}
