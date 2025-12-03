package Data;

public class Tuomari {

    private int id;
    private String nimi;
    private String maa;

    public Tuomari() {
    }

    public Tuomari(int id, String nimi, String maa){
        this.id=id;
        this.nimi=nimi;
        this.maa=maa;

    }

    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public String getnimi() {
        return nimi;
    }
    public void setnimi(String nimi) {
        this.nimi = nimi;
    }
    public String getmaa() {
        return maa;
    }
    public void setmaa(String maa) {
        this.maa = maa;

}
}