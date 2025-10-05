public class Mensagem {

    private String assunto;
    private String conteudo;

    public Mensagem(String assunto, String conteudo) {
        this.assunto = assunto;
        this.conteudo = conteudo;
    }

    public void imprimirDados() {
        System.out.println("Assunto: " + this.assunto);
        System.out.println("Conteúdo: " + this.conteudo);
    }
}