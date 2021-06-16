package at.jamal.jukebox;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<RecordsInterface> libraryList;

    public Library() {
        this.libraryList = new ArrayList<>();
    }


    public List<RecordsInterface> getLibraryList() {
        return libraryList;
    }

    public void addRecords(RecordsInterface record) {
        this.libraryList.add(record);
    }
}
