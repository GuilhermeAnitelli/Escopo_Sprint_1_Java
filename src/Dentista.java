public class Dentista extends Pessoa {

    private String cro;

    public Dentista(String nome, String email, String telefone, Endereco endereco, String cro) {
        super(nome, email, telefone, endereco);
        this.cro = cro;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("CRO: " + this.cro);
    }
}