
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
abstract public class kebersihan_Kelas {
    String sirkulasi;
    int cahaya;
    int kelembaban;
    int suhu;
    
    Scanner keb=new Scanner(System.in);
    
    public void mlebu(String hallo){
        System.out.print("Keadaan sirkulasi udara = ");
        sirkulasi=keb.next();
        System.out.print("Nilai pencahayaan       = ");
        cahaya=keb.nextInt();
        System.out.print("Prosentase kelembaban   = ");
        kelembaban=keb.nextInt();
        System.out.print("Suhu (celcius)          = ");
        suhu=keb.nextInt();
    }
    
    String analisisSirkulasi(){
        return sirkulasi;
    }
}
