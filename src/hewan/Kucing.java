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
public class Kucing extends Binatang{
    public Kucing(){
        super("Kucing", "Meong");
    }
    public void suaraBinatang(){
        System.out.println("Suara Kucing : " +getSuara());
    }
}
