package tugasbesar;

import java.util.Scanner;

public class LingkunganKelas extends RuangKelas{
    
    Scanner sob = new Scanner(System.in);
    
    private String kondisilantai;
    private String kondisidinding;
    private String kondisiatap;
    private String kondisipintu;
    private String kondisijendela;
    
    
    
    public String getKondisilantai() {
        return kondisilantai;
    }

    public void setKondisilantai(String kondisilantai) {
        this.kondisilantai = kondisilantai;
        String kondlantai = sob.nextLine();
		if("Bersih".equals(kondlantai) || "bersih".equals(kondlantai))
			System.out.println("Sesuai");
		else if("Kotor".equals(kondlantai) || "kotor".equals(kondlantai))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }

    public String getKondisidinding() {
        return kondisidinding;
    }

    public void setKondisidinding(String kondisidinding) {
        this.kondisidinding = kondisidinding;
        String konddinding = sob.nextLine();
		if("Bersih".equals(konddinding) || "bersih".equals(konddinding))
			System.out.println("Sesuai");
		else if("Kotor".equals(konddinding) || "kotor".equals(konddinding))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }

    public String getKondisiatap() {
        return kondisiatap;
    }

    public void setKondisiatap(String kondisiatap) {
        this.kondisiatap = kondisiatap;
        String kondatap = sob.nextLine();
		if("Bersih".equals(kondatap) || "bersih".equals(kondatap))
			System.out.println("Sesuai");
		else if("Kotor".equals(kondatap) || "kotor".equals(kondatap))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }

    public String getKondisipintu() {
        return kondisipintu;
    }

    public void setKondisipintu(String kondisipintu) {
        this.kondisipintu = kondisipintu;
        String kondpintu = sob.nextLine();
		if("Bersih".equals(kondpintu) || "bersih".equals(kondpintu))
			System.out.println("Sesuai");
		else if("Kotor".equals(kondpintu) || "kotor".equals(kondpintu))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }

    public String getKondisijendela() {
        return kondisijendela;
    }

    public void setKondisijendela(String kondisijendela) {
        this.kondisijendela = kondisijendela;
        String kondjendela = sob.nextLine();
		if("Bersih".equals(kondjendela) || "bersih".equals(kondjendela))
			System.out.println("Sesuai");
		else if("Kotor".equals(kondjendela) || "kotor".equals(kondjendela))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }
    
    
    
    
    //public void lingkungan(){
   // @Override
    public void inputan(){
        System.out.println("Kondisi lantai (bersih/kotor) = ");
        String fa=sob.next();
        setKondisilantai(fa);
        System.out.println("Kondisi dinding (bersih/kotor) = ");
        String fb=sob.next();
        setKondisidinding(fb);
        System.out.println("Kondisi atap (bersih/kotor) = ");
        String fc=sob.next();
        setKondisiatap(fc);
        System.out.println("Kondisi pintu (bersih/kotor) = ");
        String fd=sob.next();
        setKondisipintu(fd);
        System.out.println("Kondisi jendela (bersih/kotor) = ");
        String fe=sob.next();
        setKondisijendela(fe);
    }
    
    //public void hasillingkungan(){
   // @Override
    public void outputan(){
        System.out.println("\nLantai = "+getKondisilantai());
        System.out.println("Dinding = "+getKondisidinding());
        System.out.println("Atap = "+getKondisiatap());
        System.out.println("Pintu = "+getKondisipintu());
        System.out.println("Jendela = "+getKondisijendela());
    }
}
