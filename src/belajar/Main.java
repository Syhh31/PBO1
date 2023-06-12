/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        Belajar person1 = new Belajar("John", 30);
        Belajar person2 = new Belajar("Jane", 25);
        
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("");
        
        System.out.println("Person 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("");
        
        person2.setName("Janet");
        person1.setAge(35);
        
        System.out.println("Updated Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("");
        
        System.out.println("Updated Person 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("");
    }
}
