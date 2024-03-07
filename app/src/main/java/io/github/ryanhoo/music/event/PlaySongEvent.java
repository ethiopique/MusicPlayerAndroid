package io.github.ryanhoo.music.event;

import io.github.ryanhoo.music.data.model.Song;

public class PlaySongEvent {

    public Song song;

    public PlaySongEvent(Song song) {
        this.song = song;
    }
}
