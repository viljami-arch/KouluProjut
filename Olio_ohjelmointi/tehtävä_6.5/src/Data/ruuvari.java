package Data; 
public class ruuvari extends tyokalu {
    private String tyyppi;

    public String gettyyppi() {
        return tyyppi;
    }

    public void settyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    @Override
    public String toString() {
        return this.hinta+" " + this.materiaali + " " + this.tyyppi;
    }
    }


