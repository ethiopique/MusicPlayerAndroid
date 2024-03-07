package io.github.ryanhoo.music.event;

import io.github.ryanhoo.music.data.model.PlayList;

public class PlayListCreatedEvent {

    public PlayList playList;

    public PlayListCreatedEvent(PlayList playList) {
        this.playList = playList;
    }
}
