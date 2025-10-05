public class Voluntario extends Pessoa {

    private String areaAtuacao;

    public Voluntario(String nome, String email, String telefone, Endereco endereco, String areaAtuacao) {
        super(nome, email, telefone, endereco);
        this.areaAtuacao = areaAtuacao;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Área de Atuação: " + this.areaAtuacao);
    }
}