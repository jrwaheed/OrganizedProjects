package at.jamal.jukebox;

public class SongTitle {
    private String songTitle;
    private int songTitleLength;

    public SongTitle(String songTitle) {
        this.songTitle = songTitle;
        this.songTitleLength = this.songTitle.length();
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getSongTitleLength() {
        return songTitleLength;
    }


}
