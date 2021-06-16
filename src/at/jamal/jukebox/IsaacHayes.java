package at.jamal.jukebox;


import java.util.ArrayList;
import java.util.List;

public class IsaacHayes implements RecordsInterface {
    private final String title = "The Best of Isaac Hayes";
    private final String titleID = "AQ47";
    private List<SongTitle> albumList;
    private SongTitle song10 = new SongTitle("Hung Up On My Baby", 600);
    private SongTitle song11 = new SongTitle("Walk on By", 500);
    private SongTitle song12 = new SongTitle("Theme of Shaft", 400);

    public IsaacHayes() {
        this.albumList = new ArrayList<SongTitle>();
        albumList.add(song10);
        albumList.add(song11);
        albumList.add(song12);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String info() {
        return this.title;
    }

    @Override
    public List<SongTitle> getAlbumList() {
        return this.albumList;
    }
}
