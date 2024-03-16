package io.github.ethiopique.music.event;

import io.github.ethiopique.music.data.model.Song;

/**
 * Created with Android Studio.
 * User: ethiopique@gmail.com
 * Date: 9/12/16
 * Time: 9:15 AM
 * Desc: FavoriteChangeEvent
 */
public class FavoriteChangeEvent {

    public Song song;

    public FavoriteChangeEvent(Song song) {
        this.song = song;
    }
}
