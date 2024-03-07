package io.github.ryanhoo.music.event;

import io.github.ryanhoo.music.data.model.PlayList;


public class PlayListUpdatedEvent {

    PlayList playList;

    public PlayListUpdatedEvent(PlayList playList) {
        this.playList = playList;
    }
}
