package io.github.ethiopique.music;

import android.content.Context;


public class Injection {

    public static Context provideContext() {
        return MusicPlayerApplication.getInstance();
    }
}
