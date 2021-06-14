package at.jamal.jukebox;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    MilesDavis milesDavisRecord = new MilesDavis();
    JohnColtrane johnColtraneRecord = new JohnColtrane();
    EllaFitzgerald ellaFitzgeraldRecord = new EllaFitzgerald();
    IsaacHayes isaacHayesRecord = new IsaacHayes();






        System.out.println(milesDavisRecord.getMilesDavisList().get(1).getSongTitle());
        System.out.println(milesDavisRecord.getMilesDavisList().get(1).getSongTitleLength());

        System.out.println(ellaFitzgeraldRecord.getEllaFitzgeraldList().get(2).getSongTitle());


    }
}
