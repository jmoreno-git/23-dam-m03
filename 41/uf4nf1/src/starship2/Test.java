/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starship2;

/**
 *
 * @author jasmm
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cruiser c1 = new Cruiser("pepe", 2);
        Cruiser c2 = new Cruiser("pepe", 3);
        System.out.println(c1.equals(c2));
        Hunter h1 = new Hunter("pepe");
        Hunter h2 = new Hunter("pepe");
        System.out.println(h1.equals(h2));
        System.out.println(c1.equals(h2));
    }
    
}
