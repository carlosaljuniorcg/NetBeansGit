package mundoanimal;
public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }

    public String getcorPelo() {
        return corPelo;
    }

    public void setcorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
     
   
}
