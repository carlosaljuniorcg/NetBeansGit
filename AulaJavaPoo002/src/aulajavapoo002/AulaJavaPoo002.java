package aulajavapoo002;


public class AulaJavaPoo002 {

   
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Minha";
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.status();
        c2.tampar();
        c2.rabiscar();
       
                
    }
    
}
