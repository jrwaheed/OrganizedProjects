package at.jamal.jukebox;


import java.util.ArrayList;
import java.util.List;

public class IsaacHayes implements RecordsInterface {
    private final String title = "The Best of Isaac Hayes";
    private List<SongTitle> albumList;
    private SongTitle song10 = new SongTitle("Hung Up On My Baby");
    private SongTitle song11 = new SongTitle("Walk on By");
    private SongTitle song12 = new SongTitle("Theme of Shaft");

    public IsaacHayes() {
        this.albumList = new ArrayList<>();

        albumList.add(song10);
        albumList.add(song11);
        albumList.add(song12);
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
