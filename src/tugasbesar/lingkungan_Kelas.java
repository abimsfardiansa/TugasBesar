
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class lingkungan_Kelas {
    String lantai;
    String dinding;
    String atap;
    String pintu;
    String jendela;
    
    Scanner ling=new Scanner(System.in);
    
    public void inputling(String lingk){
        System.out.print("Kondisi lantai  = ");
        lantai=ling.next();
        System.out.print("Kondisi dinding = ");
        dinding=ling.next();
        System.out.print("Kondisi atap    = ");
        atap=ling.next();
        System.out.print("Kondisi pintu   = ");
        pintu=ling.next();
        System.out.print("Kondisi jendela = ");
        jendela=ling.next();
        }
    
    String analisis_lantai(){
        return lantai;
    }
    String analisis_semua(){
        return null;
    }
}
