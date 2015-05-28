
import java.util.Scanner;


//import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class kenyamanan_kelas {
 
  /*  abstract String analisisBising();
    abstract String analisisBau();
    abstract String analisisbocor();
    abstract String analisisrusak();
    abstract String analisisaus();*/
    private String bising;
    private String bau;
    private String bocor;
    private String rusak;
    private String aus;
    
    public String getBising() {
        return bising;
    }

    public void setBising(String bising) {
        this.bising = bising;
    }

    public String getBau() {
        return bau;
    }

    public void setBau(String bau) {
        this.bau = bau;
    }

    public String getBocor() {
        return bocor;
    }

    public void setBocor(String bocor) {
        this.bocor = bocor;
    }

    public String getRusak() {
        return rusak;
    }

    public void setRusak(String rusak) {
        this.rusak = rusak;
    }

    public String getAus() {
        return aus;
    }

    public void setAus(String aus) {
        this.aus = aus;
    }
    

    Scanner z=new Scanner(System.in);
    void bisingg(){
        System.out.println("\n\tAnalisis Kenyamanan Ruang Kelas");
        System.out.print("Kebisingan  = ");
        setBising(z.next());
    }
    
    void bauk(){
        System.out.print("Bau ruangan = ");
        setBau(z.next());
    }
    
    void kebocoran(){
        System.out.print("Kebocoran   = ");
        setBocor(z.next());
    }
    
    void kerusakan(){
        System.out.print("Kerusakan   = ");
        setRusak(z.next());
    }
    
    void keausan(){
        System.out.print("Keausan     = ");
        setAus(z.next());
    }
    
}
