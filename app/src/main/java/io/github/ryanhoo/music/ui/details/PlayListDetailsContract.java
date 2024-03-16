package io.github.ethiopique.music.ui.details;

import io.github.ethiopique.music.data.model.PlayList;
import io.github.ethiopique.music.data.model.Song;
import io.github.ethiopique.music.ui.base.BasePresenter;
import io.github.ethiopique.music.ui.base.BaseView;

/**
 * Created with Android Studio.
 * User: ethiopique@gmail.com
 * Date: 9/14/16
 * Time: 2:32 AM
 * Desc: PlayListDetailsContract
 */
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
