package projetolivro;
public class ProjetoLivro {

    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa [] p = new Pessoa[2];
        Livro [] li = new Livro[3];
        
        p[0] = new Pessoa("Carlos", 40, "M");
        p[1] = new Pessoa("Risia", 45, "F");
        
        li[0] = new Livro("Amado meu", "Carlos Drummond", 400, p[0]);
        li[1] = new Livro("Cafajeste", "Mário de Andrade", 362, p[1]);
        li[2] = new Livro("Pantanal", "Benedito Ruy", 500, p[0]);
    }
    
}
