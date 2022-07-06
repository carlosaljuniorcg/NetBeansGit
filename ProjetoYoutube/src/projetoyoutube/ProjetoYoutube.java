package projetoyoutube;
public class ProjetoYoutube {

    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 02 de POO");
        v[2] = new Video("Aula 03 de POO");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("carlosaljunior", "Carlos", 41, "M", 0);
        g[1] = new Gafanhoto("risiakristinne", "Risia", 45, "F", 0);
        
        //System.out.println(v[0].toString());
        //System.out.println(g[0].toString());
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao (g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao (g[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());
        
    }
    
}
