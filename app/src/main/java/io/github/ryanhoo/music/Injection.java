package io.github.ryanhoo.music;

import android.content.Context;


public class Injection {

    public static Context provideContext() {
        return MusicPlayerApplication.getInstance();
    }
}
