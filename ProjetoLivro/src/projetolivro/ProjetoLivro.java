package projetolivro;

import java.rmi.StubNotFoundException;

public class ProjetoLivro {

    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];
        
        p[0] = new Pessoa("Carlos", 40, "M");
        p[1] = new Pessoa("Risia", 45, "F");
        
        l[0] = new Livro("Amado meu", "Carlos Drummond", 400, false, 0, p[0]);
        l[1] = new Livro("Cafajeste", "Mário de Andrade", 500, false, 0, p[1]);
        l[2] = new Livro("Pantanal", "Benedito Ruy", 800, false, 0, p[0]);

        l[0].abrir();
        l[0].folhear(500);
        //l[0].avancarPag();
        System.out.println(l[0].detalhes());
    
    }

}
