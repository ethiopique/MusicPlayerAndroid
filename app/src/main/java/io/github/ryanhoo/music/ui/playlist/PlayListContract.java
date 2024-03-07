package io.github.ethiopique.music.ui.playlist;

import io.github.ethiopique.music.data.model.PlayList;
import io.github.ethiopique.music.ui.base.BasePresenter;
import io.github.ethiopique.music.ui.base.BaseView;

import java.util.List;


/* package */ interface PlayListContract {

    interface View extends BaseView<Presenter> {

        void showLoading();

        void hideLoading();

        void handleError(Throwable error);

        void onPlayListsLoaded(List<PlayList> playLists);

        void onPlayListCreated(PlayList playList);

        void onPlayListEdited(PlayList playList);

        void onPlayListDeleted(PlayList playList);
    }

    interface Presenter extends BasePresenter {

        void loadPlayLists();

        void createPlayList(PlayList playList);

        void editPlayList(PlayList playList);

        void deletePlayList(PlayList playList);
    }
}
