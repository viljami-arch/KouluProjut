package Data; 

public class lasta extends tyokalu {
    private int leveys;

    public int getleveys() {
        return leveys;
    }

    public void setleveys(int leveys) {
        this.leveys = leveys;
    }

    @Override
    public String toString() {
        return this.hinta + " " + this.materiaali + " " + this.leveys;
    }

}