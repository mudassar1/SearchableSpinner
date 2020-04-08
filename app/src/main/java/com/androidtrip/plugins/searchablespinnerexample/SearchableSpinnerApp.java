package com.androidtrip.plugins.searchablespinnerexample;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by mudassar on 6/4/20.
 */

public class SearchableSpinnerApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
