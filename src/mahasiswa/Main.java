/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Syahbana", 2110010093, 19);
        Mahasiswa mahasiswa1 = new Mahasiswa("Syauqi", 2110010016, 21);
        
        System.out.println("Mahasiswa 1");
        System.out.println("Nama : " +mahasiswa.getNama());
        System.out.println("NPM : " +mahasiswa.getNpm());
        System.out.println("Umur : " +mahasiswa.getUmur());
        
        System.out.println("Mahasiswa 2");
        System.out.println("Nama : " +mahasiswa.getNama());
        System.out.println("NPM : " +mahasiswa.getNpm());
        System.out.println("Umur : " +mahasiswa.getUmur());
        
        mahasiswa.setNama("Andi");
        mahasiswa.setNpm(19082376);
        mahasiswa.setUmur(23);
        
        mahasiswa1.setNama("Sadam");
        mahasiswa1.setNpm(2110010076);
        mahasiswa1.setUmur(20);
        
        System.out.println("Ubah data mahasiswa 1");
        System.out.println("Nama : " +mahasiswa.getNama());
        System.out.println("NPM : " +mahasiswa.getNpm());
        System.out.println("Umur : " +mahasiswa.getUmur());
        
        System.out.println("Ubah data mahasiswa 2");
        System.out.println("Nama : " +mahasiswa1.getNama());
        System.out.println("NPM : " +mahasiswa1.getNpm());
        System.out.println("Umur : " +mahasiswa1.getUmur());
    }
}
