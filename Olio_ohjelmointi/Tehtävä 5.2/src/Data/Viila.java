package Data;
public class Viila {
    private int id;
    private int karkeus;
    private String valmistaja;

    public Viila() {
    }

    public Viila(int id, int karkeus, String valmistaja){
        this.id=id;
        this.karkeus=karkeus;
        this.valmistaja=valmistaja;

    }


    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public void setid(String id) {
        try {
            this.id = Integer.parseInt(id);
        }
        catch(NumberFormatException e) {
        }
    }


    public int getkarkeus() {
        return karkeus;
    }
    public void setkarkeus(int karkeus) {
        this.karkeus = karkeus;
        }
    public void setkarkeus(String karkeus) {
        try {
            this.karkeus = Integer.parseInt(karkeus);
        }
        catch(NumberFormatException e) {
        }
    }


        public String getvalmistaja() {
            return valmistaja;
        }
        public void setvalmistaja(String valmistaja) {
            this.valmistaja = valmistaja;
            }


        @Override
        public String toString() {
        return this.id+", "+this.karkeus+", "+this.valmistaja;
        }
    }

