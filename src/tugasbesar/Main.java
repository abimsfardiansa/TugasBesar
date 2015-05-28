/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Identitas_kelas id=new Identitas_kelas();                
        id.identitas();
        
        analisis_kondisi1 kond=new analisis_kondisi1();
        kond.Luas();
        kond.rasioluas();
        kond.jmlpintu();
        kond.jmljendela();
        
        Analisa_Steker a=new Analisa_Steker();
        a.AnalisaJumlahSteker();
        a.AnalisaKondisiSteker();
        a.AnalisaPosisiSteker();
        
        Analisa_Lcd b=new Analisa_Lcd();                
        b.AnalisaJumlahLcd();
        b.AnalisaKondisiLcd();
        b.AnalisaPosisiLcd();
        
        Analisa_Lampu c=new Analisa_Lampu();
        c.AnalisaJumlahLampu();
        c.AnalisaKondisiLampu();
        c.AnalisaPosisiLampu();
        
        Analisis_Kipas d=new Analisis_Kipas();
        d.AnalisaJumlahKipas();
        d.AnalisaKondisiKipas();
        d.AnalisaPosisiKipas();
        
        Analisis_AC e=new Analisis_AC();
        e.AnalisaJumlahac();
        e.AnalisaKondisiac();
        e.AnalisaPosisiac();
        
        analisis_lingkungan lk=new analisis_lingkungan();
        lk.analisis_lantai();
        lk.analisis_dinding();
        lk.analisis_atap();
        lk.analisis_pintu();
        lk.analisis_jendela();
        lk.analisis_semua();
        
        analisis_kebersihan ber=new analisis_kebersihan();
        ber.analisisSirkulasi();
        ber.analisisPencahayaan();
        ber.analisisKelembaban();
        ber.analisisSuhu();
        
        analisis_kenyamanan gh=new analisis_kenyamanan();
     /*   gh.analisisBising();
        gh.analisisBau();
        gh.analisisbocor();
        gh.analisisrusak();
        gh.analisisaus();*/
        
        gh.bisingg();
        gh.bauk();
        gh.kebocoran();
        gh.kerusakan();
        gh.keausan();

        analisis_keamanan qw=new analisis_keamanan();
        qw.kekokohan();
        qw.kuncipintu();
        qw.kuncijendela();
        qw.bahaya();
    }
}
