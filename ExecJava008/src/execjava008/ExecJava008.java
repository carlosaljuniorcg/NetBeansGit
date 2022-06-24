/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execjava008;

/**
 *
 * @author Carlos
 */
public class ExecJava008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Compararações String
        String nome1 = "Carlos";
        String nome2 = "Risia";
        String nome3 = new String("Carlos");
        String res;
        //res = (nome1==nome2)?"igual":"diferente";
        //Quando comparamos objetos usamos "equals"
        res = (nome1.equals(nome3))?"iguais":"diferentes";
        System.out.println(res);
    }
    
}
