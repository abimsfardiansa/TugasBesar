/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class Analisa_Lampu extends saranPrasarana{
 public Analisa_Lampu(){
        System.out.println("\nAnalisa Lampu");
        input("Analisa Lampu");
      //  output("Analisa Steker");
}
    @Override
    public boolean AnalisaJumlahLampu(){
        if(jumlah>=18){
            System.out.println("\tJumlah lampu Sesuai");
           return true;
        }
        else{
            System.out.println("\tJumlah lampu Tidak sesuai");
           return false;
        }
    }
    
    public String AnalisaKondisiLampu(){
        if(kondisi.equals("baik")&& jumlah==18){
            System.out.println("\tKondisi lampu Sesuai");
        }
        else{
            System.out.println("\tKondisi lampu Tidak sesuai");
        }
        return kondisi;
    }
    
    public String AnalisaPosisiLampu(){
        if(posisi.equals("atap_ruangan")){
            System.out.println("\tPosisi lampu Sesuai");
        }
        else{
            System.out.println("\tPosisi lampu Tidak sesuai");
        }
        return posisi;
    }   
}
