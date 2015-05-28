
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class kondisi_Kelas {
    
    int panjang;
    int lebar;
    int luas;
    int kursi;
  //  int rasio;
    int pintu;
    int jendela;

    Scanner kond=new Scanner(System.in);

    public void masuk(String hai){
        System.out.print("Panjang ruang  = ");
        panjang=kond.nextInt();
        System.out.print("Lebar ruang    = ");
        lebar=kond.nextInt();
        System.out.print("Jumlah kursi   = ");
        kursi=kond.nextInt();
        System.out.print("Jumlah pintu   = ");
        pintu=kond.nextInt();
        System.out.print("Jumlah jendela = ");
        jendela=kond.nextInt();
    }
    int Luas(){
        return panjang;
        }
}
