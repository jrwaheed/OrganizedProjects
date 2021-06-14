package at.jamal.projects.Handy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class File {
    private String extension;
    private int size;
    private String name;
    private String timeStamp;
    private Camera.CAMERARESOLUTION resolution;


    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public File(String extension, int size, String name, Camera.CAMERARESOLUTION resolution) {
        this.extension = extension;
        this.size = size;
        this.name = name;
        this.timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        this.resolution = resolution;
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Camera.CAMERARESOLUTION getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        
        return this.extension + ":" + this.name + ":" + this.size;
    }
}
