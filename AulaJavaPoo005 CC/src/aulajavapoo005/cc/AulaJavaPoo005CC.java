
package aulajavapoo005.cc;

public class AulaJavaPoo005CC {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Carlinhos");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1112);
        p2.setDono("Risia");
        p2.abrirConta("CP");
        
        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
