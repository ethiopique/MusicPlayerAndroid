package io.github.ryanhoo.music.event;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class AddFolderEvent {

    public List<File> folders = new ArrayList<>();

    public AddFolderEvent(File file) {
        folders.add(file);
    }

    public AddFolderEvent(List<File> files) {
        if (files != null) {
            folders = files;
        }
    }
}
