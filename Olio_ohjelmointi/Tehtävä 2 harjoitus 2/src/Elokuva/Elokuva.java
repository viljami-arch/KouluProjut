package Elokuva;
public class Elokuva {
    private String genre;
    private int kesto; 
    private String Tuottaja;

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }       
    public int getKesto() {
        return kesto;
    }   
    public void setKesto(int kesto) {
        this.kesto = kesto;
    }   
    public String getTuottaja() {
        return Tuottaja;
    }
    public void setTuottaja(String tuottaja) {
        Tuottaja = tuottaja;
    }

    public static void tulosta (Elokuva e) {
        System.out.println(e.getGenre());
        System.out.println(e.getKesto());
        System.out.println(e.getTuottaja());
    }

}
