package io.github.ethiopique.music.player;

/**
 * Created with Android Studio.
 * User: ethiopique@gmail.com
 * Date: 9/5/16
 * Time: 5:48 PM
 * Desc: PlayMode
 */
public enum PlayMode {
    SINGLE,
    LOOP,
    LIST,
    SHUFFLE;

    public static PlayMode getDefault() {
        return LOOP;
    }

    public static PlayMode switchNextMode(PlayMode current) {
        if (current == null) return getDefault();

        switch (current) {
            case LOOP:
                return LIST;
            case LIST:
                return SHUFFLE;
            case SHUFFLE:
                return SINGLE;
            case SINGLE:
                return LOOP;
        }
        return getDefault();
    }
}
