package io.github.ryanhoo.music.event;

import io.github.ryanhoo.music.data.model.Song;


public class FavoriteChangeEvent {

    public Song song;

    public FavoriteChangeEvent(Song song) {
        this.song = song;
    }
}
