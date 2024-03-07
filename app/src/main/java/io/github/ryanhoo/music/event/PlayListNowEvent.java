package io.github.ethiopique.music.event;

import io.github.ethiopique.music.data.model.PlayList;


public class PlayListNowEvent {

    public PlayList playList;
    public int playIndex;

    public PlayListNowEvent(PlayList playList, int playIndex) {
        this.playList = playList;
        this.playIndex = playIndex;
    }
}
