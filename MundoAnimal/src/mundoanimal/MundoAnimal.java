package mundoanimal;
public class MundoAnimal {

    public static void main(String[] args) {
        // TODO code application logic here
        //Animal n = new Animal();//ANIMAL é uma classe abstrata
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();
        
        /*m.setPeso(35.5f);
        m.setcorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();*/
        //a.locomover();
        //p.locomover();
        c.locomover();
        k.emitirSom();
        
    }
    
}
