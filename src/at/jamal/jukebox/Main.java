package at.jamal.jukebox;


public class Main {
    public static void main(String[] args) {

        MilesDavis milesDavisRecord = new MilesDavis();
        JohnColtrane johnColtraneRecord = new JohnColtrane();
        EllaFitzgerald ellaFitzgeraldRecord = new EllaFitzgerald();
        IsaacHayes isaacHayesRecord = new IsaacHayes();
        BillieEilish billieEilishRecord = new BillieEilish();

        Player player = new Player();

        Magazine magazine = new Magazine();

        Library library = new Library();

        JukeBox jukeBox = new JukeBox(player, magazine, library);

        magazine.addRecords(milesDavisRecord);
        magazine.addRecords(johnColtraneRecord);

        library.addRecords(ellaFitzgeraldRecord);
        library.addRecords(isaacHayesRecord);
        library.addRecords(billieEilishRecord);

        System.out.println("Welcome to the JukeBox. Please make your selection.\n" +
                "\n 1. See what is currently on deck." +
                "\n 2. Play what is currently on deck." +
                "\n 3. Search for record." +
                "\n 4. Load an album to the current playlist" +
                "\n 5. Remove an album from the current playlist." +
                "\n 6. Get total playtime on deck.\n");


        //magazine.getRecordsOnDeck();

        //jukeBox.getTotalPlayTime();

        //jukeBox.recordSearch();
        jukeBox.loadRecordToPlayer();
        player.statusPlayerLoaded();

        jukeBox.playRecord();

        //jukeBox.addRecord();
        //jukeBox.removeRecord();



    }
}
