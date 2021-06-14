package at.jamal.jukebox;

import java.util.ArrayList;
import java.util.List;

public class MilesDavis implements Records{
    private final String title = "The Best of Miles Davis";
    private List<SongTitle> albumList;
    private SongTitle song1 = new SongTitle("Blue in Green");
    private SongTitle song2 = new SongTitle("So What");
    private SongTitle song3 = new SongTitle("Round Midnight");

    public MilesDavis() {
        this.albumList = new ArrayList<>();

        albumList.add(song1);
        albumList.add(song2);
        albumList.add(song3);
    }

    public List<SongTitle> getMilesDavisList() {
        return albumList;
    }

    @Override
    public String info(String title) {
        return title;
    }
}
