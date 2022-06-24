/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslógicos;

/**
 *
 * @author Carlos
 */
public class OperadoresLógicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r1, r2, r3;
        r1 = (x<y && y<z)?true:false;
        r2 = (x<z || y<z)?true:false;
        r3 = (x<y ^ y==z)?true:false;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
    
}
