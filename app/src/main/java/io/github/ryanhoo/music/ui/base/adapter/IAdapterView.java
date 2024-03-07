package io.github.ryanhoo.music.ui.base.adapter;


public interface IAdapterView<T> {

    void bind(T item, int position);
}
