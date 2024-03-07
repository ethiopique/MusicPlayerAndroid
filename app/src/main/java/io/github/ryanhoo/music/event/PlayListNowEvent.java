package io.github.ryanhoo.music.event;

import io.github.ryanhoo.music.data.model.PlayList;


public class PlayListNowEvent {

    public PlayList playList;
    public int playIndex;

    public PlayListNowEvent(PlayList playList, int playIndex) {
        this.playList = playList;
        this.playIndex = playIndex;
    }
}
