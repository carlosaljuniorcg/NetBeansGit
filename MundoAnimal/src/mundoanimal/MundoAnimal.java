package mundoanimal;
public class MundoAnimal {

    public static void main(String[] args) {
        // TODO code application logic here
        //Animal n = new Animal();//ANIMAL é uma classe abstrata
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setPeso(35.5f);
        m.setcorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
    }
    
}
