/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaspernas;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ProgramasPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantss pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna) {
            case 1: 
                tipo = "Saci";
                break;
            case 2: 
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 5:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";

        }
        System.out.println(tipo);
    }
    
}
