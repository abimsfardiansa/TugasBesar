/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class Analisis_Kipas extends saranPrasarana{
    public Analisis_Kipas(){
        System.out.println("\nAnalisa Kipas Angin");
        input("Analisa Kipas Angin");
      //  output("Analisa Steker");
}
    @Override
    public boolean AnalisaJumlahKipas(){
        if(jumlah>=2){
            System.out.println("\tJumlah kipas Sesuai.");
           return true;
        }
        else{
            System.out.println("\tJumlah kipas Tidak sesuai.");
           return false;
        }
    }
    
    public String AnalisaKondisiKipas(){
        if(kondisi.equals("baik")&& jumlah==2){
            System.out.println("\tKondisi kipas Sesuai.");
        }
        else{
            System.out.println("\tKondisi kipas Tidak sesuai.");
        }
        return kondisi;
    }
    
    public String AnalisaPosisiKipas(){
        if(posisi.equals("atap_ruangan")){
            System.out.println("\tPosisi kipas Sesuai.");
        }
        else{
            System.out.println("\tPosisi kipas Tidak sesuai.");
        }
        return posisi;
    }   
}
