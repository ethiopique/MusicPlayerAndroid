package io.github.ryanhoo.music.ui.local.all;

import android.content.Context;
import android.support.v4.app.LoaderManager;
import io.github.ryanhoo.music.data.model.Song;
import io.github.ryanhoo.music.ui.base.BasePresenter;
import io.github.ryanhoo.music.ui.base.BaseView;

import java.util.List;


/* package */ interface LocalMusicContract {

    interface View extends BaseView<Presenter> {

        LoaderManager getLoaderManager();

        Context getContext();

        void showProgress();

        void hideProgress();

        void emptyView(boolean visible);

        void handleError(Throwable error);

        void onLocalMusicLoaded(List<Song> songs);
    }

    interface Presenter extends BasePresenter {

        void loadLocalMusic();
    }
}
