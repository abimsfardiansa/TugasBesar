/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class Analisis_AC extends saranPrasarana{
    public Analisis_AC(){
        System.out.println("\nAnalisa AC");
        input("Analisa AC");
      //  output("Analisa Steker");
}
    @Override
    public boolean AnalisaJumlahac(){
        if(jumlah>=1){
            System.out.println("\tJumlah AC Sesuai.");
           return true;
        }
        else{
            System.out.println("\tJumlah AC Tidak sesuai.");
           return false;
        }
    }
    
    public String AnalisaKondisiac(){
        if(kondisi.equals("baik")){
            System.out.println("\tKondisi AC Sesuai.");
        }
        else{
            System.out.println("\tKondisi AC Tidak sesuai.");
        }
        return kondisi;
    }
    
    public String AnalisaPosisiac(){
        if(posisi.equals("disamping") || posisi.equals("dibelakang")){
            System.out.println("\tPosisi AC Sesuai.");
            System.out.println("------------------------------------------------");
        }
        else{
            System.out.println("\tPosisi AC Tidak sesuai.");
            System.out.println("------------------------------------------------");
        }
        return posisi;
    }   
}
