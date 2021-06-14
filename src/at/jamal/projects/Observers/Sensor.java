package at.jamal.projects.Observers;

import at.jamal.projects.Interfaces.ActionTaker;
import at.jamal.projects.Interfaces.Observers;

import java.util.ArrayList;
import java.util.List;

public class Sensor {

    private int temperature;
    private List<Observers> observerList;
    private List<ActionTaker>actionTakerList;


    public Sensor(int temperature) {
        this.temperature = temperature;
        this.observerList = new ArrayList<Observers>();
        this.actionTakerList = new ArrayList<>();
    }


    public void addObserver(Observers observers, ActionTaker actionTaker){
        this.observerList.add(observers);
        this.actionTakerList.add(actionTaker);
    }

    public void sendSignal(){
        informAll();
    }

    public void informAll(){
        for (Observers observer:this.observerList) {
            observer.info(this.temperature);
        }
        for (ActionTaker actiontaker: this.actionTakerList) {
            actiontaker.Action(this.temperature);
            }
        }
}

