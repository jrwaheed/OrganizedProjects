package at.jamal.jukebox;


import java.util.Scanner;

public class Player {
    private RecordsInterface recordOnDeck;
    private SongTitle songOnDeck;
    private Boolean isLoaded;

    public Player() {
        this.recordOnDeck = null;
        this.songOnDeck = null;
        this.isLoaded = false;
    }


    public RecordsInterface getRecordOnDeck() {
        return recordOnDeck;
    }

    public void setRecordOnDeck(RecordsInterface recordOnDeck) {
        this.recordOnDeck = recordOnDeck;
    }

    public Boolean loadRecord(RecordsInterface record) {
        this.isLoaded = true;
        int songNumber =0;
        this.recordOnDeck = record;
        System.out.println("\n" + record.getTitle() + " is currently loaded \n");
        System.out.println("Available songs:");

        for (SongTitle song : record.getAlbumList()) {
            songNumber++;
            System.out.println("\t" + songNumber +". " + song.getSongTitle() );
        }

        Scanner songObj = new Scanner(System.in);
        System.out.println("\nPlease enter the number of the song you would like to play.");
        Integer songSelection = songObj.nextInt();

        this.songOnDeck = recordOnDeck.getAlbumList().get(songSelection - 1);
        System.out.println("Selected song is " + recordOnDeck.getAlbumList().get(songSelection - 1).getSongTitle());

        return isLoaded;
    }

    public SongTitle getSongOnDeck() {
        return songOnDeck;
    }

    public  Boolean getLoaded() {
        //System.out.println(isLoaded);
        return isLoaded;
    }

    public void setIsLoaded(Boolean loaded) {
        isLoaded = loaded;
    }
}

