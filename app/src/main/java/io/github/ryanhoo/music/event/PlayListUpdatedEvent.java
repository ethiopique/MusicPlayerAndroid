package io.github.ethiopique.music.event;

import io.github.ethiopique.music.data.model.PlayList;

/**
 * Created with Android Studio.
 * User: ethiopique@gmail.com
 * Date: 9/14/16
 * Time: 1:08 AM
 * Desc: PlayListUpdatedEvent
 */
public class PlayListUpdatedEvent {

    PlayList playList;

    public PlayListUpdatedEvent(PlayList playList) {
        this.playList = playList;
    }
}
