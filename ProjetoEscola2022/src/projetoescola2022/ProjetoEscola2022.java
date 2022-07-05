package projetoescola2022;
public class ProjetoEscola2022 {
    public static void main(String[] args) {
        // TODO code application logic here
        //Visitante v1 = new Visitante();
        //v1.setNome("Carlos");
        //v1.setIdade(41);
        //v1.setSexo("M");
        //System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Carlos");
        a1.setMatricula(1111);
        a1.setCurso("Informãtica");
        a1.setIdade(41);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Brunno");
        b1.setIdade(37);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade(); 
        System.out.println(b1.toString());
        
        
        
    }

    
}
