package at.jamal.projects.Handy;

public class SIM {
    private int IDnumber;
    private String number;


    public SIM(int IDnumber, String number) {
        this.IDnumber = IDnumber;
        this.number = number;

    }

    public void makeCall(String phoneNumber) {
        System.out.println("Dialing " + phoneNumber);
        System.out.println("ring... ring...\n");
        System.out.println("Hallo?");
    }
}