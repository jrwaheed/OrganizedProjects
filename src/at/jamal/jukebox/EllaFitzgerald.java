package at.jamal.jukebox;


import java.util.ArrayList;
import java.util.List;

public class EllaFitzgerald implements RecordsInterface {
    private final String title = "The Best of Ella Fitzgerald";
    private List<SongTitle> albumList;
    private SongTitle song7 = new SongTitle("Dream a Little Dream of Me");
    private SongTitle song8 = new SongTitle("Cheek to Cheek");
    private SongTitle song9 = new SongTitle("Summertime");

    public EllaFitzgerald(){
        this.albumList = new ArrayList<>();

        albumList.add(song7);
        albumList.add(song8);
        albumList.add(song9);
    }

    @Override
    public String info() {
        return this.title;
    }

    @Override
    public List getAlbumList() {
        return albumList;
    }


}
