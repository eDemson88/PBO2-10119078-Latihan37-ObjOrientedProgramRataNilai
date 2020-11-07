/*
 * NAMA: Adam Firdaus Darmawan
 * NIM: 10119078
 * KELAS: IF-2
 * DESKRIPSI: berisi codingan untuk menampilkan rata rata nilai
 */
package pboif2.pkg10119078.latihan37.objorientedprogramratanilai;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan37ObjOrientedProgramRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bnykMhs;
        RataRataNilai nilai = new RataRataNilai();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan banyaknya mahasiswa: ");
        bnykMhs = scanner.nextInt();
        nilai.rataNilai(bnykMhs);
        nilai.hasilRata(bnykMhs);
        
    }
    
}
