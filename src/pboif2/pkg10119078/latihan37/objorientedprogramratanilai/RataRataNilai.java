/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan37.objorientedprogramratanilai;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class RataRataNilai {
    public float nilaiMhs,jum = 0,rata;
    
    public float rataNilai(int parBnykMhs){
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= parBnykMhs; i++){
        System.out.printf("nilai mahasiswa ke-" + i +": ");
        nilaiMhs = scanner.nextFloat();
        jum += nilaiMhs;
            
        }
    return(jum);
    }
    public float hasilRata(int parBnykMhs){
        rata = jum / parBnykMhs;
        System.out.println("\nMaka, Rata-rata Nilainya adalah " + rata);
        return (rata);
    }

    
}
