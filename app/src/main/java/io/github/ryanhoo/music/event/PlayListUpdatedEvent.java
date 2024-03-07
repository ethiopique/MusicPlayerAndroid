package io.github.ethiopique.music.event;

import io.github.ethiopique.music.data.model.PlayList;


public class PlayListUpdatedEvent {

    PlayList playList;

    public PlayListUpdatedEvent(PlayList playList) {
        this.playList = playList;
    }
}
