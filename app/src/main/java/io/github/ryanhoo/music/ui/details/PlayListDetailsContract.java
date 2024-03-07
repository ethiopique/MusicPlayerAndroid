package io.github.ryanhoo.music.ui.details;

import io.github.ryanhoo.music.data.model.PlayList;
import io.github.ryanhoo.music.data.model.Song;
import io.github.ryanhoo.music.ui.base.BasePresenter;
import io.github.ryanhoo.music.ui.base.BaseView;


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
