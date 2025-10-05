public class Pessoa {

    private String nome;
    private String email;
    private String telefone;
    private Endereco endereco;

    public Pessoa(String nome, String email, String telefone, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        if (this.endereco != null) {
            this.endereco.imprimirDados();
        }
    }
}