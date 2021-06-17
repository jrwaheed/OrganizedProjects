package at.jamal.jukebox;


import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private List<RecordsInterface> recordList;
    private List<SongTitle> songList;
    private int totalRunTime;

    public Magazine() {
        this.recordList = new ArrayList<>();
        this.songList = new ArrayList<>();
        this.totalRunTime = totalRunTime;
    }

    public void addRecords(RecordsInterface record) {
        this.recordList.add(record);
    }


    public List<RecordsInterface> getRecordList() {
        return recordList;
    }

    public void getRecordsOnDeck() {
        System.out.println("The albums currently on deck are:");
        for (RecordsInterface record : this.recordList) {
            System.out.println("\t" + record.getTitle());
        }
    }

    public void getSongsOnDeck() {
        for (RecordsInterface record : this.recordList) {
            for (SongTitle song: record.getAlbumList()) {
                //System.out.println(song.getSongTitle());
                songList.add(song);
            }
        }
    }

    public void getSumOfMusic(){
        totalRunTime = 0;
        getSongsOnDeck();
        for (SongTitle song: this.songList) {
            totalRunTime += song.getSongTitleLength();
        }
        System.out.println("Total runtime in the magazine is " + (int) totalRunTime/60 + " minutes.");
    }
}



