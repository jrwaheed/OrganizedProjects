package at.jamal.jukebox;


import java.util.ArrayList;
import java.util.List;

public class JohnColtrane implements RecordsInterface {
    private final String title = "The Best of John Coltrane";
    private final String titleID = "AQ44";
    private List<SongTitle> albumList;
    private SongTitle song4 = new SongTitle("In a Sentimental Mood", 600);
    private SongTitle song5 = new SongTitle("My Little Brown Book", 500);
    private SongTitle song6 = new SongTitle("My One and Only Love", 440);

    public JohnColtrane() {
        this.albumList = new ArrayList<>();
        albumList.add(song4);
        albumList.add(song5);
        albumList.add(song6);
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


