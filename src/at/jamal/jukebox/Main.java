package at.jamal.jukebox;


public class Main {
    public static void main(String[] args) {

    MilesDavis milesDavisRecord = new MilesDavis();
    JohnColtrane johnColtraneRecord = new JohnColtrane();
    EllaFitzgerald ellaFitzgeraldRecord = new EllaFitzgerald();
    IsaacHayes isaacHayesRecord = new IsaacHayes();

    Player player = new Player();

    Magazine magazine = new Magazine();

    JukeBox jukeBox = new JukeBox(player, magazine);

    magazine.addRecords(milesDavisRecord);
    magazine.addRecords(johnColtraneRecord);
    magazine.addRecords(ellaFitzgeraldRecord);
    magazine.addRecords(isaacHayesRecord);

    //magazine.getRecordListInfo();

    //jukeBox.getTotalPlayTime();

    jukeBox.recordSearch();


    }
}
