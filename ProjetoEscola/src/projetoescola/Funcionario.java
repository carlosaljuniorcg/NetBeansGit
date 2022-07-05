package projetoescola;
public class Funcionario extends Pessoa{
    //Atributos
    private String setor;
    private Boolean trabalhando;

    //Métodos
    public void mudarTrabalho(){
        
    }
    
    //Métodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "setor=" + setor + ", trabalhando=" + trabalhando + '}';
    }
    
    
    
}
