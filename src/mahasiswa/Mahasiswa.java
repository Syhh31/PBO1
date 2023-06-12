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
public class Mahasiswa {
      private String nama;
      private int npm;
      private int umur;
      
      //Method Konstruktor
      public Mahasiswa(String nama, int npm, int umur){
          this.nama = nama;
          this.npm = npm;
          this.umur = umur;
      }
      
      //Method Mutator
      public void setNama(String nama){
          this.nama = nama;
      }
      public void setNpm(int npm){
          this.npm = npm;
      }
      public void setUmur(int umur){
          this.umur = umur;
      }
      
      //Method Accessor
      public String getNama(){
          return this.nama;
      }
      public int getNpm(){
          return this.npm;
      }
      public int getUmur(){
          return this.umur;
      }
}
