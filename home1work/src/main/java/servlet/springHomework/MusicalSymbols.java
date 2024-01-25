package servlet.springHomework;

public class MusicalSymbols implements MyMusicalSymbols{

    private String timeSignatures;
    private String clef;
    private String dynamics;

    public String getTimeSignatures() {
        return timeSignatures;
    }

    public void setTimeSignatures(String timeSignatures) {
        this.timeSignatures = timeSignatures;
    }

    public String getClef() {
        return clef;
    }

    public void setClef(String clef) {
        this.clef = clef;
    }

    public String getDynamics() {
        return dynamics;
    }

    public void setDynamics(String dynamics) {
        this.dynamics = dynamics;
    }
}
