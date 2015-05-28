/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class analisis_kebersihan extends kebersihan_Kelas{
    public analisis_kebersihan(){
        System.out.println("\n\tAnalisis Kebersihan Ruang Kelas");
        mlebu("analisis kebersihan");
    }
    
    @Override
    public String analisisSirkulasi(){
        if(sirkulasi.equals("lancar")){
            System.out.println("\tSirkulasi udara sesuai.");
        }
        else{
            System.out.println("\tSirkulasi udara tidak sesuai.");
        }
        return sirkulasi;
    }
    
    public int analisisPencahayaan(){
        if(cahaya>=250 &&cahaya<=350){
            System.out.println("\tNilai pencahayaan "+cahaya+", sesuai.");
        }
        else{
            System.out.println("\tNilai pencahayaan "+cahaya+", tidak sesuai.");
        }
        return cahaya;
    }
    
    public int analisisKelembaban(){
        if(kelembaban>=70 &&kelembaban<=80){
            System.out.println("\tKelembaban ruang "+kelembaban+"%, sesuai.");
        }
        else{
            System.out.println("\tKelembaban ruang "+kelembaban+"%, tidak sesuai.");
        }
        return kelembaban;
    }
    
    
    public int analisisSuhu(){
        if(suhu>=25 &&suhu<=35){
            System.out.println("\tSuhu "+suhu+" drajat celcius, sesuai.");
            System.out.println("------------------------------------------------");
        }
        else{
            System.out.println("\tSuhu "+suhu+" drajat celcius, tidak sesuai.");
            System.out.println("------------------------------------------------");
        }
        return suhu;
    }
}
