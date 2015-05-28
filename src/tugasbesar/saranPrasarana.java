
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class saranPrasarana {
    Scanner sarana = new Scanner(System.in);
	int jumlah;
	String kondisi;
	String posisi;
	
	public void input(String masuk){
		System.out.print("Jumlah  = ");
		jumlah = sarana.nextInt();
		System.out.print("Kondisi = ");
		kondisi = sarana.next();
		System.out.print("Posisi  = ");
		posisi = sarana.next();
	}
        
        
	   public void output(String keluaran){
		System.out.println("Jumlah : "+jumlah);
		System.out.println("Kondisi : "+kondisi);
		System.out.println("Posisi : "+posisi);
   	}
           
           
           boolean AnalisaJumlahSteker(){
                return true;
           }
           String AnalisaKondisiSteker(){
            return null;
           }
           boolean AnalisaJumlahLcd(){
                return true;
           }
           boolean AnalisaJumlahLampu(){
                return true;
           }
           boolean AnalisaJumlahKipas(){
                return true;
           }
           boolean AnalisaJumlahac(){
                return true;
           }
}
