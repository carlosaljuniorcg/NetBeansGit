package projetoescola;

public class ProjetoEscola {

    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Carlos");
        p2.setNome("Risia");
        p3.setNome("Keylla");
        p4.setNome("Pedro");
        
        p1.setSexo("M");
        p2.setSexo("F");
        
        System.out.println(p1.toString());
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
       
        //p2.setCurso("Informática");
        //p3.setSalario(2500);
        
    }
    
}
