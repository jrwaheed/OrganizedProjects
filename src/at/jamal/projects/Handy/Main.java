package at.jamal.projects.Handy;

public class Main {
   
    public static void main(String[] args) {
        SIM sim1 = new SIM(10001, "43 660 712 6564");
        Memory memory1 = new Memory(512);
        Camera cameraFront = new Camera();
        Cellphone phone = new Cellphone("black",sim1,cameraFront,memory1);
    
        phone.takePhoto();
        phone.takePhoto();
        phone.takePhoto();
        phone.printAllFilesOfSDCard();


    }
}





