package at.jamal.projects.Observers;

import at.jamal.projects.Interfaces.ActionTaker;

public class Mobile implements ActionTaker {

    @Override
    public void info(int temperature) {
        System.out.println("The mobile phone is recording a temperature of " + temperature);
    }

    @Override
    public void Action(int temperature) {
        if (temperature < 25 && temperature > 19){
            System.out.println("Temp is fine.");
        }
        else if (temperature >= 25){
            System.out.println("Elevated temps");
        } else {
            System.out.println("Falling temps.");
        }
    }
}
