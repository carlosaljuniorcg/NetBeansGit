package projetoescola2022;
class Bolsista extends Aluno {
    //Atributos
    private float bolsa;
    
    //Métodos
    public void renovarBolsa() {
        System.out.println("Renovando bolda de " + this.getNome());
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }
    
    
}
