package at.jamal.projects.Observers;

import at.jamal.projects.Interfaces.ActionTaker;

public class Windows implements ActionTaker {
    @Override
    public void info(int temperature) {
        System.out.println("The heater is recording a temperature of " + temperature);
    }

    @Override
    public void Action(int temperature ) {
        if (temperature < 25 && temperature > 19){
            System.out.println("at.jamal.projects.Observers.Windows stay where they are");
        }
        else if (temperature >= 25){
            System.out.println("Windows up.");
        } else {
            System.out.println("Windows down.");
        }
    }
}
