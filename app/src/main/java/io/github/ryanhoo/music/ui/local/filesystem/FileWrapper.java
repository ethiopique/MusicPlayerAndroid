package io.github.ethiopique.music.ui.local.filesystem;

import java.io.File;


public class FileWrapper {

    public File file;
    public boolean selected;

    public FileWrapper() {
        // Empty
    }

    public FileWrapper(File file) {
        this.file = file;
    }

    public FileWrapper(File file, boolean selected) {
        this.file = file;
        this.selected = selected;
    }
}
