package io.github.ethiopique.music.ui.details;

import io.github.ethiopique.music.data.model.PlayList;
import io.github.ethiopique.music.data.model.Song;
import io.github.ethiopique.music.ui.base.BasePresenter;
import io.github.ethiopique.music.ui.base.BaseView;


public interface PlayListDetailsContract {

    interface View extends BaseView<Presenter> {

        void showLoading();

        void hideLoading();

        void handleError(Throwable e);

        void onSongDeleted(Song song);
    }

    interface Presenter extends BasePresenter {

        void addSongToPlayList(Song song, PlayList playList);

        void delete(Song song, PlayList playList);
    }
}
