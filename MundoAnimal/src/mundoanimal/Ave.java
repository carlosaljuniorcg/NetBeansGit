package mundoanimal;
public class Ave extends Animal{
    private String corpena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    
    public void fazerNinho() {
        System.out.println("Construindo um ninho");
    }

    public String getCorpena() {
        return corpena;
    }

    public void setCorpena(String corpena) {
        this.corpena = corpena;
    }
    
    
    
}
