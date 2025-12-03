package Data;
public class sarmio extends suorakaide {
private int syvyys;

    public int getSyvyys() {
        return syvyys;
    }
    public void setSyvyys(int syvyys) {
        this.syvyys = syvyys;
    }

    public int getTilavuus() {
        return this.getPintaAla()*this.syvyys;
    }
    }