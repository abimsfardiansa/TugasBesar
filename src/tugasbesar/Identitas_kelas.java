
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class Identitas_kelas {
    
    private String namaruang;
    private String lokasi;
    private String jurusan;
    private String fakultas;
    
    public String getNamaruang() {
        return namaruang;
    }

    public void setNamaruang(String namaruang) {
        this.namaruang = namaruang;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
      
    Scanner a=new Scanner(System.in);
    public void identitas(){
        System.out.println("\n\t\tINVENTARIS KELAS");
        System.out.print("\nNama ruang   = ");
        setNamaruang(a.next());
        System.out.print("Lokasi ruang = ");
        setLokasi(a.next());
        System.out.print("Jurusan      = ");
        setJurusan(a.next());
        System.out.print("Fakultas     = ");
        setFakultas(a.next());
        System.out.println("------------------------------------------------");
        System.out.println(getFakultas()+" "+getJurusan()+"\t"+getLokasi()+" "+getNamaruang());
    }
}
