package at.jamal.projects.Handy;

import java.util.ArrayList;
import java.util.List;

public class Memory {
    private int capacity;
    private List<File> files;


    public Memory(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();

    }

    public void saveFile(File file){
        this.files.add(file);
    }

    public void deleteFiles(){
        this.files.clear();
    }
    
    public void printFiles(){
        for (File file: files) {
            System.out.println(file.getExtension());
            System.out.println(file.getSize());
            System.out.println(file.getName());
            System.out.println(file.getTimeStamp());
            System.out.println(file.getResolution() + "\n");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFile(List<File> files) {
        this.files = files;
    }
}

