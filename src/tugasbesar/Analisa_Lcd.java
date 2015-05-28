/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class Analisa_Lcd extends saranPrasarana{
    public Analisa_Lcd(){
        System.out.println("\nAnalisa kabel LCD");
        input("Analisa Kabel LCD");
      //  output("Analisa Steker");
}
    @Override
    public boolean AnalisaJumlahLcd(){
        if(jumlah>=1){
            System.out.println("\tJumlah kabel LCD Sesuai.");
           return true;
        }
        else{
            System.out.println("\tJumlah kabel LCD Tidak sesuai.");
           return false;
        }
    }
    
    public String AnalisaKondisiLcd(){
        if(kondisi.equals("baik")){
            System.out.println("\tKondisi Kabel LCD Sesuai.");
        }
        else{
            System.out.println("\tKondisi kabel LCD Tidak sesuai.");
        }
        return kondisi;
    }
    
    public String AnalisaPosisiLcd(){
        if(posisi.equals("dekat_dosen")){
            System.out.println("\tPosisi kabel LCD Sesuai.");
        }
        else{
            System.out.println("\tPosisi kabel LCD Tidak sesuai.");
        }
        return posisi;
    }
}
