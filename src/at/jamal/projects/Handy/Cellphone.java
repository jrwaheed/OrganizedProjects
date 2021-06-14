package at.jamal.projects.Handy;

import java.util.List;

public class Cellphone {
    private String color;
    private SIM sim;
    private Camera camera;
    private Memory memory;

    public Cellphone(String color, SIM sim, Camera camera, Memory memory) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.memory = memory;
    }

    public void takePhoto(){
        File file = this.camera.takePhoto();
        this.memory.saveFile(file);
    }

    public Camera getCamera() {
        return camera;
    }

    public void printAllFilesOfSDCard(){
        List<File> files = this.memory.getFiles();
        for (File file : files) {
            System.out.println(file.toString());
        }
        
    }

    public Memory getMemory() {
        return memory;
    }

    public SIM getSim() {
        return sim;
    }
}

