package at.jamal.jukebox;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    MilesDavis milesDavisRecord = new MilesDavis();
    JohnColtrane johnColtraneRecord = new JohnColtrane();
    EllaFitzgerald ellaFitzgeraldRecord = new EllaFitzgerald();
    IsaacHayes isaacHayesRecord = new IsaacHayes();

    Magazine magazine = new Magazine();

    magazine.addRecords(milesDavisRecord);
    magazine.addRecords(johnColtraneRecord);
    magazine.addRecords(ellaFitzgeraldRecord);
    magazine.addRecords(isaacHayesRecord);

    magazine.getRecordList();
    magazine.getSongList();


    }
}
