package at.jamal.jukebox;


import java.util.Scanner;

public class Player {
    private RecordsInterface recordOnDeck;
    private Boolean isLoaded;

    public Player() {
        this.recordOnDeck = null;
        this.isLoaded = false;
    }


    public RecordsInterface getRecordOnDeck() {
        return recordOnDeck;
    }

    public void setRecordOnDeck(RecordsInterface recordOnDeck) {
        this.recordOnDeck = recordOnDeck;
    }

    public Boolean loadRecord(RecordsInterface record) {
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

        return isLoaded;
    }

    public void setLoaded(Boolean loaded) {
        isLoaded = loaded;
    }
}

