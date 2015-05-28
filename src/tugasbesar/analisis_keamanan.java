
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class analisis_keamanan implements kemananan_kelas{
  /*  private String kokoh;
    private String kpintu;
    private String kjendela;
    private String bahaya;

    public String getKokoh() {
        return kokoh;
    }

    public void setKokoh(String kokoh) {
        this.kokoh = kokoh;
    }

    public String getKpintu() {
        return kpintu;
    }

    public void setKpintu(String kpintu) {
        this.kpintu = kpintu;
    }

    public String getKjendela() {
        return kjendela;
    }

    public void setKjendela(String kjendela) {
        this.kjendela = kjendela;
    }

    public String getBahaya() {
        return bahaya;
    }

    public void setBahaya(String bahaya) {
        this.bahaya = bahaya;
    }
    */
    String kokoh;
    String kpintu;
    String kjendela;
    String bahaya;
    
    
    Scanner m=new Scanner(System.in);
    
    
        @Override
        public void kekokohan(){
            System.out.println("\n\tAnalisis Keamanan Ruang Kelas");
        System.out.print("Kekokohan bangunan = ");
       // setKokoh(m.next());
        kokoh=m.next();
        if(kokoh.equals("kokoh")){
            System.out.println("\tsesuai");
        }
        else{
            System.out.println("\ttidak sesuai");
        }
    }
        
        @Override
        public void kuncipintu(){
        System.out.print("Kunci Pintu = ");
       // setKokoh(m.next());
        kpintu=m.next();
        if(kpintu.equals("ada")){
            System.out.println("\tsesuai");
        }
        else{
            System.out.println("\ttidak sesuai");
        }
    }
        
        
        @Override
        public void kuncijendela(){
        System.out.print("Kunci jendela = ");
       // setKokoh(m.next());
        kjendela=m.next();
        if(kjendela.equals("ada")){
            System.out.println("\tsesuai");
        }
        else{
            System.out.println("\ttidak sesuai");
        }
    }
        
        @Override
        public void bahaya(){
        System.out.print("Bahaya = ");
       // setKokoh(m.next());
        bahaya=m.next();
        if(bahaya.equals("aman")){
            System.out.println("\tsesuai");
        }
        else{
            System.out.println("\ttidak sesuai");
        }
    }
        
    
}
