/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/**
 *
 * @author acer
 */
public class Binatang {
    private String jenis;
    private String suara;
    
    public Binatang(String jenis, String suara){
        this.jenis = jenis;
        this.suara = suara;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public String getJenis(){
        return jenis;
    }
    public void setSuara(String suara){
        this.suara = suara;
    }
    public String getSuara(){
        return suara;
    }
    public void suaraBinatang(){
        System.out.println("Jenis Binatang : " + jenis);
        System.out.println("Jenis Suara : " + suara);
    }
    
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.suaraBinatang();
        
        Anjing anjing = new Anjing();
        anjing.suaraBinatang();
    }
}