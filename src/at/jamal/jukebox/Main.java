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


        //magazine.getRecordListInfo();

        //jukeBox.getTotalPlayTime();

        //jukeBox.recordSearch();
        //jukeBox.loadRecord(billieEilishRecord);
        //player.getLoaded();

        //jukeBox.playRecord();

        jukeBox.addRecord();


    }
}
