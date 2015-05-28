/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class analisis_lingkungan extends lingkungan_Kelas{
    public analisis_lingkungan(){
        System.out.println("\n\tAnalisa lingkungan kelas");
        inputling("Analisa lingkungan kelas");
    }
    
    @Override
    public String analisis_lantai(){
        if(lantai.equals("bersih")){
            System.out.println("\tKondisi lantai sesuai.");
        }
        else{
            System.out.println("\tKondisi lantai tidak sesuai.");
        }
        return lantai;
    }
    
    public String analisis_dinding(){
        if(dinding.equals("bersih")){
            System.out.println("\tKondisi dinding sesuai.");
        }
        else{
            System.out.println("\tKondisi dinding tidak sesuai.");
        }
        return dinding;
    }
    
    public String analisis_atap(){
        if(atap.equals("bersih")){
            System.out.println("\tKondisi atap sesuai.");
        }
        else{
            System.out.println("\tKondisi atap tidak sesuai.");
        }
        return atap;
    }
    
    public String analisis_pintu(){
        if(pintu.equals("bersih")){
            System.out.println("\tKondisi pintu sesuai.");
        }
        else{
            System.out.println("\tKondisi pintu tidak sesuai.");
        }
        return pintu;
    }
    
    public String analisis_jendela(){
        if(jendela.equals("bersih")){
            System.out.println("\tKondisi jendela sesuai.");
        }
        else{
            System.out.println("\tKondisi jendela tidak sesuai.");
        }
        return jendela;
    }
    
    public String analisis_semua(){
        if(lantai.equals("bersih")&&dinding.equals("bersih")&&atap.equals("bersih")&&pintu.equals("bersih")&&jendela.equals("bersih")){
            System.out.println("\tKeseluruhan kondisi SESUAI.");
            System.out.println("------------------------------------------------");
           // return true;
        }
        else{
            System.out.println("\tKeseleruhan kondisi TIDAK SESUAI.");
            System.out.println("------------------------------------------------");
          //  return false;
        }
        return null;
    }
}
