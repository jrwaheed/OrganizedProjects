package at.jamal.jukebox;


import java.util.ArrayList;
import java.util.List;

public class EllaFitzgerald implements RecordsInterface {
    private final String title = "The Best of Ella Fitzgerald";
    private final String titleID = "AQ45";
    private List<SongTitle> albumList;
    private SongTitle song7 = new SongTitle("Dream a Little Dream of Me", 400);
    private SongTitle song8 = new SongTitle("Cheek to Cheek", 350);
    private SongTitle song9 = new SongTitle("Summertime", 425);

    public EllaFitzgerald(){
        this.albumList = new ArrayList<>();
        albumList.add(song7);
        albumList.add(song8);
        albumList.add(song9);
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public List getAlbumList() {
        return albumList;
    }


}
