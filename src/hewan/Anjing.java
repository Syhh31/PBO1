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
public class Anjing extends Binatang{
    public Anjing(){
        super("Anjing", "Guk Guk");
    }
    public void suaraBinatang(){
        System.out.println("Suara Anjing : " + getSuara());
    }
}
