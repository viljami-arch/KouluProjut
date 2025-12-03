package Data;
public class suorakaide {


    protected int leveys;
    protected int korkeus;

    public suorakaide(){

    }


    public int getLeveys() {
        return leveys;
    }
    public void setLeveys(int leveys) {
        this.leveys = leveys;
    }
    public int getKorkeus() {
        return korkeus;
    }
    public void setKorkeus(int korkeus) {
        this.korkeus = korkeus;
    }
    public int getPintaAla() {
        return this.leveys*this.korkeus;
    }
}