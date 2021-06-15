package at.jamal.jukebox;


public class SongTitle {
    private String songTitle;
    private int songTitleLength;

    public SongTitle(String songTitle, int songTitleLength) {
        this.songTitle = songTitle;
        this.songTitleLength = getSongTitleLength();
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getSongTitleLength() {
        return songTitleLength;
    }


}
