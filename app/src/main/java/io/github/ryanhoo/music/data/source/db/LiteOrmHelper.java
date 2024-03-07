package io.github.ryanhoo.music.data.source.db;

import com.litesuits.orm.LiteOrm;
import io.github.ryanhoo.music.BuildConfig;
import io.github.ryanhoo.music.Injection;


public class LiteOrmHelper {

    private static final String DB_NAME = "music-player.db";

    private static volatile LiteOrm sInstance;

    private LiteOrmHelper() {
        // Avoid direct instantiate
    }

    public static LiteOrm getInstance() {
        if (sInstance == null) {
            synchronized (LiteOrmHelper.class) {
                if (sInstance == null) {
                    sInstance = LiteOrm.newCascadeInstance(Injection.provideContext(), DB_NAME);
                    sInstance.setDebugged(BuildConfig.DEBUG);
                }
            }
        }
        return sInstance;
    }
}
