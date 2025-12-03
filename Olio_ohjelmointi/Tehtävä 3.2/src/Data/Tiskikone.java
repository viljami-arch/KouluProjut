// Aliohjelmassa
        //     private static Tiskikone LueTiedotNappaimistolta(Scanner sc) {
        //     Tiskikone t = new Tiskikone();

        //     System.out.println("Anna Id");
        //      t.setId(Integer.parseInt(sc.nextLine()));

        //     System.out.println("Anna Merkki");
        //      t.setMerkki((sc.nextLine()));

        //      System.out.println("Anna Malli");
        //      t.setMalli((sc.nextLine()));

        //      System.out.println("Anna Pesuohjelma");
        //      t.setPesuohjelma((sc.nextLine()));

        //      return t;
        // }
// Tiskikone t=new Tiskikone();
        // Tiskikone t2=new Tiskikone();

        // System.out.print("Anna Id: ");
        // String Id=sc.nextLine();
        // try{
        // int tId=Integer.parseInt(Id);
        // t.setId(tId);
        // }
        // catch(NumberFormatException e){}


        // System.out.print("Anna Merkki: ");
        // String Merkki=sc.nextLine();
        // t.setMerkki(Merkki);

        // System.out.print("Anna Malli: ");
        // String Malli=sc.nextLine();
        // t.setMalli(Malli);

        // System.out.print("Anna Pesuohjelma: ");
        // String Pesuohjelma=sc.nextLine();
        // t.setPesuohjelma(Pesuohjelma);

        // private static void tulosta(Tiskikone t){
        // System.out.println(t.getId()+" "+t.getMerkki()+" "+t.getMalli()+" "+t.getPesuohjelma());

        // 
package Data;

public class Tiskikone {

    private int Id;
    private String Merkki;
    private String Malli;
    private String Pesuohjelma;

    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getMerkki() {
        return Merkki;
    }
    public void setMerkki(String Merkki) {
        this.Merkki = Merkki;
    }
    public String getMalli() {
        return Malli;
    }
    public void setMalli(String Malli) {
        this.Malli = Malli;
    }
    public String getPesuohjelma() {
        return Pesuohjelma;
    }
    public void setPesuohjelma(String Pesuohjelma) {
        this.Pesuohjelma = Pesuohjelma;
    }
}