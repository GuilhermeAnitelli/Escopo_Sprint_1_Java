public class Beneficiario extends Pessoa {

    private String programaSocial;

    public Beneficiario(String nome, String email, String telefone, Endereco endereco, String programaSocial) {
        super(nome, email, telefone, endereco);
        this.programaSocial = programaSocial;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Programa Social: " + this.programaSocial);
    }
}