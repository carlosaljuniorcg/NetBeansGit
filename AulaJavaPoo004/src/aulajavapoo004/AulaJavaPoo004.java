
package aulajavapoo004;
public class AulaJavaPoo004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
        //c1.setModelo("BIC"); //Modificando usando os Métodos Especiais
        //c1.modelo = "BIC"; //Tentando modificar de forma direta
        //c1.setPonta(0.3f); //Modificando usando os Métodos Especiais
        //c1.ponta = "0.5f"; //Tentando modificar de forma direta
        
        //System.out.println("Tenho uma caneta " + c1.getModelo() + 
        //        " de ponta " + c1.getPonta() + ".");
        c1.status();
        Caneta c2 = new Caneta("KKK", "Preto", 0.1f);
        c2.status();
        
    }
    
}
