package at.jamal.jukebox;


import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private List<RecordsInterface> recordList;

    public Magazine() {
        this.recordList = new ArrayList<>();
    }

    public void addRecords(RecordsInterface record) {
        this.recordList.add(record);
    }


    public void getRecordList() {
        for (RecordsInterface record : this.recordList) {
            System.out.println(record.info());
        }
    }

    public void getSongList(){
        for (RecordsInterface record : this.recordList) {
            for (SongTitle song: record.getAlbumList()
                 ) {

            }
        }
    }
}


