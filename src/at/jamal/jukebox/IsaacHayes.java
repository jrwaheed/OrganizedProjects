package at.jamal.jukebox;

import java.util.ArrayList;
import java.util.List;

public class IsaacHayes implements Records{
    private final String title = "The Best of Isaac Hayes";
    private List<SongTitle> albumList;
    SongTitle song10 = new SongTitle("Hung Up On My Baby");
    SongTitle song11 = new SongTitle("Walk on By");
    SongTitle song12 = new SongTitle("Theme of Shaft");

    public IsaacHayes() {
        this.albumList = new ArrayList<>();

        albumList.add(song10);
        albumList.add(song11);
        albumList.add(song12);
    }

    public List<SongTitle> getIsaacHayesList() {
        return albumList;
    }

    @Override
    public String info(String title) {
        return title;
    }
}
