package mundoanimalmamifero;
public class Mamifero extends Animal {
    //Atributo
    protected String corPelo;
    
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
}
