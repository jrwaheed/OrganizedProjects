package at.jamal.jukebox;


import java.util.ArrayList;
import java.util.List;

public class BillieEilish implements RecordsInterface {
    private final String title = "The Best of Billie Eilish";
    private final String titleID = "AQ45";
    private List<SongTitle> albumList;
    private SongTitle song13 = new SongTitle("Your Power", 500);
    private SongTitle song14 = new SongTitle("Lost Cause", 550);
    private SongTitle song15 = new SongTitle("everything i wanted", 450);

    public BillieEilish(){
        this.albumList = new ArrayList<>();
        albumList.add(song13);
        albumList.add(song14);
        albumList.add(song15);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public List getAlbumList() {
        return albumList;
    }


}
