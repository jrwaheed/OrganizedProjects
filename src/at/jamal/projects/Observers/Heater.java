package at.jamal.projects.Observers;

import at.jamal.projects.Interfaces.ActionTaker;

public class Heater implements ActionTaker {
    @Override
    public void info(int temperature) {
        System.out.println("The windows are recording a temperature of " + temperature);
    }


    @Override
    public void Action(int temperature) {
        if (temperature < 25 && temperature > 19){
            System.out.println("Maintaining temperature");
        }
        else if (temperature >= 25){
            System.out.println("Heater off.");
        } else {
            System.out.println("Heater activated.");
        }
    }
}
