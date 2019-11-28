import java.util.Date;
/*******************************************************************************
 * Instance třídy {@code Zaměstnanec} představují ...
 * The {@code Zaměstnanec} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public abstract class Zamestnanec
{
    private String jmeno;
    private String prijmeni;
    private Date datum_nastupu;
    private double plat;
    
    public Zamestnanec(String jmeno, String prijmeni, Date datum_nastupu, double plat)
    {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datum_nastupu = datum_nastupu;
        this.plat = plat;
    }
    
    public abstract void pracuj();
    
    public void pozdrav()
    {
        System.out.println("Dzień Dobry");
    }
    
    public int PocetLetPrace(int rok)
    {
        Date datum = new Date(rok,1,1);
        int pocetroku = datum.getYear() - this.datum_nastupu.getYear();
        return pocetroku;
    }
    
    public String GetJmeno()
    {
        return this.jmeno+" "+this.prijmeni;
    }
    
    public void Datum_nastupu()
    {
        System.out.print(this.datum_nastupu.getDay());
        System.out.print("/"+this.datum_nastupu.getMonth());
        System.out.print(" "+this.datum_nastupu.getYear());
        System.out.println();
    }
    /*public abstract String GetJmeno();
    public abstract String GetPrijmeni();
    public abstract double getPlat();*/
}