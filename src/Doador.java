public class Doador extends Pessoa {

    private String tipoDoacao;

    public Doador(String nome, String email, String telefone, Endereco endereco, String tipoDoacao) {
        super(nome, email, telefone, endereco);
        this.tipoDoacao = tipoDoacao;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Tipo de Doação: " + this.tipoDoacao);
    }
}