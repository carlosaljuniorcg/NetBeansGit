package mundoanimalcachorro;
public class MundoAnimalCachorro {

    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro c = new Cachorro();
        
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 80);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        
    }
    
}
