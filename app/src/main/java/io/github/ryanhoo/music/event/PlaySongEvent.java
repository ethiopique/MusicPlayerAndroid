package io.github.ethiopique.music.event;

import io.github.ethiopique.music.data.model.Song;

public class PlaySongEvent {

    public Song song;

    public PlaySongEvent(Song song) {
        this.song = song;
    }
}
