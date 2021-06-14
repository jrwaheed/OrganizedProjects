package at.jamal.jukebox;

import java.util.ArrayList;
import java.util.List;

public class JohnColtrane implements Records{
    private final String title = "The Best of John Coltrane";
    private List<SongTitle> albumList;
    private SongTitle song4 = new SongTitle("In a Sentimental Mood");
    private SongTitle song5 = new SongTitle("My Little Brown Book");
    private SongTitle song6 = new SongTitle("My One and Only Love");

    public JohnColtrane() {
        this.albumList = new ArrayList<>();

        albumList.add(song4);
        albumList.add(song5);
        albumList.add(song6);
    }

    public List<SongTitle> getJohnColtraneList() {
        return albumList;
    }

    @Override
    public String info(String title) {
        return title;
    }
}


