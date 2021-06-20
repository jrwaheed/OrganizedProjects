package at.jamal.jukebox;

import java.util.Scanner;

public class JukeBox {
    private Player player;
    private Magazine magazine;
    private Library library;

    public JukeBox(Player player, Magazine magazine, Library library) {
        this.player = player;
        this.magazine = magazine;
        this.library = library;
    }

//BROKEN HERE
    public void playRecord(){
        if(this.player.getLoaded()) {
            System.out.println("\nPlaying: " + player.getSongOnDeck().getSongTitle());
        }
    }

    public void loadRecordToPlayer(){
        int loadRecordNumber = 0;

        Scanner loadObj  = new Scanner(System.in);
        System.out.println("\nPlease enter the number of the album you would like to place in player.");

        for (RecordsInterface loadrecord : magazine.getRecordList()) {
            loadRecordNumber++;
            System.out.println("\t" + loadRecordNumber + ". " + loadrecord.getTitle());
        }

        Integer loadSelection = loadObj.nextInt();
        this.player.setRecordOnDeck(magazine.getRecordList().get(loadSelection-1));
        System.out.println(magazine.getRecordList().get(loadSelection-1).getTitle() + " has been added to the player.");
        this.player.setIsLoaded(true);
        player.loadSongToPlayer(magazine.getRecordList().get(loadSelection-1));

    }

    public void addRecord() {
        int addRecordNumber = 0;
        if (magazine.getRecordList().size() == 3) {
            System.out.println("Please remove a record from the magazine first.");
        } else {
            System.out.println("Please choose a record to add.");
            for (RecordsInterface addrecord : library.getLibraryList()) {
                addRecordNumber++;
                System.out.println("\t" + addRecordNumber + ". " + addrecord.getTitle());
            }
        }

        Scanner recordObj = new Scanner(System.in);
        System.out.println("\nPlease enter the number of the record you would like to add to playlist.");
        Integer recordSelection = recordObj.nextInt();

        magazine.getRecordList().add(library.getLibraryList().get(recordSelection-1));
        library.getLibraryList().remove(recordSelection-1);

        System.out.println("Magazine List");
        System.out.println(magazine.getRecordList());

        System.out.println("Library List");
        System.out.println(library.getLibraryList());
    }


    public void removeRecord(){
        int removeRecordNumber = 0;
        if (magazine.getRecordList().size() == 0){
            System.out.println("Magazine is already empty. Please add a record.");
        } else {
            System.out.println("Please choose a record to remove.");
            for (RecordsInterface removerecord : magazine.getRecordList()) {
                removeRecordNumber++;
                System.out.println("\t" + removeRecordNumber + ". " + removerecord.getTitle());
            }
        }

        Scanner removeObj = new Scanner(System.in);
        System.out.println("\nPlease enter the number of the record you would like to remove.");
        Integer removeSelection = removeObj.nextInt();

        library.getLibraryList().add(magazine.getRecordList().get(removeSelection-1));
        magazine.getRecordList().remove(removeSelection-1);
        ;

        System.out.println("Magazine List");
        System.out.println(magazine.getRecordList());

        System.out.println("Library List");
        System.out.println(library.getLibraryList());
    }


    public void getTotalPlayTime(){
        magazine.getSumOfMusic();
    }

    public void recordSearch() {
        int recordAvailable = 0;
        Scanner searchObj = new Scanner(System.in);
        System.out.println("Enter the name of the record.");
        String searchRecord = searchObj.nextLine();

        for (RecordsInterface record : this.magazine.getRecordList()) {
            if (record.getTitle().equals(searchRecord)) {
                recordAvailable++;
            }
        }

        if (recordAvailable == 1) {
            System.out.println("Record " + searchRecord + " is available on deck.");
        } else {
            System.out.println("Record " + searchRecord + " is not available currently.");
        }
    }
}


