package at.jamal.projects.Band_package;

public class Gitarist extends Singer{
    private String instrument;
    public Gitarist(String firstName, int performerAge, int performerSalary, TYPE voiceType, String instrument) {
        super(firstName, performerAge, performerSalary, voiceType);
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }
}
