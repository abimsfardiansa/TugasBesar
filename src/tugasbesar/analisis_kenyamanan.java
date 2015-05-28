
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class analisis_kenyamanan extends kenyamanan_kelas{
    
    
    Scanner a=new Scanner(System.in);
    
    @Override
   // String analisisBising(){
    void bisingg(){
        super.bisingg();
        if(getBising().equals("tidak.bising")){
            System.out.println("\tHening, sesuai.");
        }
        else{
            System.out.println("\tBising, tidak sesuai.");
        }
       // return bising;
    }
    
    @Override
   // String analisisBau(){
    void bauk(){
        super.bauk();
        if(getBau().equals("tidak.bau")){
            System.out.println("\tHarum, sesuai.");
        }
        else{
            System.out.println("\tBau, tidak sesuai.");
        }
      //  return bau;
    }
    
    @Override
    //String analisisbocor(){
    void kebocoran(){
        super.kebocoran();
        if(getBocor().equals("tidak.bocor")){
            System.out.println("\tTidak bocor, sesuai.");
        }
        else{
            System.out.println("\tBocor, tidak sesuai.");
        }
      //  return bocor;
    }
    
    
    
    @Override
 //   String analisisrusak(){
    void kerusakan(){
        super.kerusakan();
        if(getRusak().equals("tidak.rusak")){
            System.out.println("\tUtuh, sesuai.");
        }
        else{
            System.out.println("\tRusak, tidak sesuai.");
        }
     //   return rusak;
    }
    
    @Override
 //   String analisisaus(){
    void keausan(){
    super.keausan();
        if(getAus().equals("tidak.aus")){
            System.out.println("\tUtuh, sesuai.");
            
            System.out.println("------------------------------------------------");
        }
        else{
            System.out.println("\tAus, tidak sesuai.");
            
            System.out.println("------------------------------------------------");
        }
   //     return aus;
    }
}
