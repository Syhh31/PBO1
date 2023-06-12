/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2bana;

/**
 *
 * @author acer
 */
public class Pertemuan2BanaMain {
    public static void main(String[] args) {
        Pertemuan2Bana MOBIL = new Pertemuan2Bana();
        Pertemuan2Bana LAPTOP = new Pertemuan2Bana();
        
        MOBIL.mobil="Mobil";
        MOBIL.tahunproduksi="2012";
        MOBIL.warna="Hijau";
        MOBIL.type="AVANZA";
        
        LAPTOP.laptop="Laptop";
        LAPTOP.merk="ASUS";
        LAPTOP.tahun="2021";
        LAPTOP.color="Silver";
                
        System.out.println("MOBIL : " +MOBIL.mobil);
        System.out.println("Tahun Produksi : " +MOBIL.tahunproduksi);
        System.out.println("Warna : " +MOBIL.warna);
        System.out.println("Type : " +MOBIL.type);
        
        System.out.println("LAPTOP : " +LAPTOP.laptop);
        System.out.println("Merk : " +LAPTOP.merk);
        System.out.println("Tahun : " +LAPTOP.tahun);
        System.out.println("Color : " +LAPTOP.color);
    }
}
