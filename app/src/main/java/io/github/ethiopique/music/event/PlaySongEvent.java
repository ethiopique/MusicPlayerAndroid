package io.github.ethiopique.music.event;

import io.github.ethiopique.music.data.model.Song;

/**
 * Created with Android Studio.
 * User: ethiopique@gmail.com
 * Date: 9/5/16
 * Time: 6:32 PM
 * Desc: PlaySongEvent
 */
public class PlaySongEvent {

    public Song song;

    public PlaySongEvent(Song song) {
        this.song = song;
    }
}
