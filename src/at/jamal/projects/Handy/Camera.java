package at.jamal.projects.Handy;

public class Camera {
    public enum CAMERARESOLUTION {LOW, MEDIUM, HIGH}
    private CAMERARESOLUTION resolution;


    public Camera() {
        this.resolution = resolution;
    }

    public void setResolution(CAMERARESOLUTION resolution) {
        this.resolution = resolution;
    }

    public CAMERARESOLUTION getResolution() {
        return resolution;
    }

    public File takePhoto(){
        System.out.println("SNAP..");

        File file = new File("jpg",4000,"dcs_000_1",CAMERARESOLUTION.HIGH);
        /// file zusammenbauen
        return file;
    }

    
}
