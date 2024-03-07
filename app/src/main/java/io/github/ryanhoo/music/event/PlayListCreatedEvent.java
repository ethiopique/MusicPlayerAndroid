package io.github.ethiopique.music.event;

import io.github.ethiopique.music.data.model.PlayList;


public class PlayListCreatedEvent {

    public PlayList playList;

    public PlayListCreatedEvent(PlayList playList) {
        this.playList = playList;
    }
}
