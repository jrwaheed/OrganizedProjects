package at.jamal.jukebox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JukeBox {
    private Player player;
    private Magazine magazine;



    public JukeBox(Player player, Magazine magazine) {
        this.player = player;
        this.magazine = magazine;

    }

    public void loadRecord(){

    }

    public void addRecord(){

    }

    public void removeRecord(){

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
            System.out.println("Record " + searchRecord + " is available.");
        } else {
            System.out.println("Record " + searchRecord + " is not available.");
        }
    }
}


