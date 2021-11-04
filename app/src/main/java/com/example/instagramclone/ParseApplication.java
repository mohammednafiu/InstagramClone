package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tj80zyjMRP3YQFNSwiLEatpBg4mUKLWlUGfI5lHO")
                .clientKey("aaSzGlbk3kgxmAwUABANCKUC1NIZtosffvHm5Yxt")
                .server("https://parseapi.back4app.com").build());
    }
}
