package at.jamal.jukebox;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private List<Records> recordList;

    public Magazine(List<Records> recordList) {
        this.recordList = new ArrayList<>();
    }

    public void addRecords(Records record) {
        this.recordList.add(record);
    }



}


