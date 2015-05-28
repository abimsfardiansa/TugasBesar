/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class analisis_kondisi1 extends kondisi_Kelas{
    public analisis_kondisi1(){
        System.out.println("\n\tAnalisa kondisi kelas");
        masuk("Analisa kondisi kelas");
    }
    
    
    @Override
    public int Luas(){
        int luasruang=panjang*lebar;
        System.out.println("\tLuas Kelas = "+luasruang+" meter.");
        if(panjang!=lebar){
            System.out.println("\tRuang kelas sesuai, yaitu persegi panjang.");
          //  return true;
        }
        else{
            System.out.println("\tRuang kelas tidak sesuai, yaitu persegi.");
          //  return false;
        }
        return panjang;
        }
    
    public int rasioluas(){
        int luasrg=panjang*lebar;
        int rasio=luasrg/kursi;
        System.out.print("\tRasio luas = "+rasio);
        if(rasio>=0.5){
            System.out.println(", rasio sesuai.");
          //  return true;
        }
        else{
            System.out.println(", rasio tidak sesuai.");
           // return false;
        }
        return rasio;
        }
    public int jmlpintu(){
        if(pintu>=2){
            System.out.println("\tJumlah pintu "+pintu+", sesuai.");
           // return true;
        }
        else{
            System.out.println("\tJumlah pintu "+pintu+", tidak sesuai.");
          //  return false;
        }
        return pintu;
    }
    
    public int jmljendela(){
        if(jendela>=2){
            System.out.println("\tJumlah jendela "+jendela+", sesuai.");
            System.out.println("------------------------------------------------");
          //  return true;
        }
        else{
            System.out.println("\tJumlah jendela "+jendela+", tidak sesuai.");
            System.out.println("------------------------------------------------");
          //  return false;
        }
        return jendela;
    }
    
}
