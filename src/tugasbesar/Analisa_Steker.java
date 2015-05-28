/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class Analisa_Steker extends saranPrasarana{
    public Analisa_Steker(){
        System.out.println("\n\tAnalisa Sarana Prasarana\nAnalisa steker");
        input("Analisa Steker");
      //  output("Analisa Steker");
}
    @Override
    public boolean AnalisaJumlahSteker(){
        if(jumlah>=4){
            System.out.println("\tJumlah steker Sesuai.");
           return true;
        }
        else{
            System.out.println("\tJumlah Steker Tidak sesuai.");
           return false;
        }
    }
    
    @Override
    public String AnalisaKondisiSteker(){
        if(kondisi.equals("baik") && jumlah>=4){
            System.out.println("\tKondisi steker Sesuai.");
        }
        else{
            System.out.println("\tKondisi steker Tidak sesuai.");
        }
        return kondisi;
    }
    
    public String AnalisaPosisiSteker(){
        if(posisi.equals("dekat_dosen") && jumlah>=4){
            System.out.println("\tPosisi steker Sesuai.");
        }
        else{
            System.out.println("\tPosisi steker Tidak sesuai.");
        }
        return posisi;
    }
    
    
}
