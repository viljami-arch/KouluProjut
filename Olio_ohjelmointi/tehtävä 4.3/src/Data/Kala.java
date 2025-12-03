package Data;

public class Kala {

    private double Paino;
    private String Laji;

    public Kala(){

    }
    public Kala(String Laji, double Paino){
        this.Laji=Laji;
        this.Paino=Paino;
    }

    public String getLaji() {
        return Laji;
    }

    public boolean setLaji(String Laji) {
        if (Laji!=null && Laji.length()>0){
            this.Laji=Laji;
            return true;
        }
        return false;
    }


    public double getPaino() {
        return Paino;
    }

    public boolean setPaino(double Paino) {
        if(Paino > 0) {
            this.Paino=Paino;
            return true;
        }
        return false;
    }

}