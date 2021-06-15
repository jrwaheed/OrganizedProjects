package at.jamal.jukebox;


import java.util.ArrayList;
import java.util.List;

public class MilesDavis implements RecordsInterface {
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


    @Override
    public String info() {
        return this.title;
    }

    @Override
    public List getAlbumList() {
        return albumList;
    }


}

