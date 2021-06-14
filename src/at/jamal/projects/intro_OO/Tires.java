package at.jamal.projects.intro_OO;

public class Tires {
    public enum QUALITY {low, medium, high}
    public QUALITY rubberQuality;
    private double innerDiameter;
    private double outDiameter;

    public Tires(QUALITY rubberQuality, double innerDiameter, double outDiameter) {
        this.rubberQuality = rubberQuality;
        this.innerDiameter = innerDiameter;
        this.outDiameter = outDiameter;
    }

    public QUALITY getRubberQuality() {
        return rubberQuality;
    }

    public double getInnerDiameter() {
        return innerDiameter;
    }

    public double getOutDiameter() {
        return outDiameter;
    }
}
