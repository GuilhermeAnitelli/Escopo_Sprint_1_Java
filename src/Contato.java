public class Contato {

    private int id;
    private String publico;
    private String status;
    private Canal canal;
    private Mensagem mensagem;

    public Contato(int id, String publico, Canal canal, Mensagem mensagem) {
        this.id = id;
        this.publico = publico;
        this.status = "Recebido";
        this.canal = canal;
        this.mensagem = mensagem;
    }

    public int verificarId() {
        return this.id;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status do contato " + this.id + " atualizado para: " + this.status);
    }

    public void imprimirDados() {
        System.out.println("ID: " + this.id);
        System.out.println("Público: " + this.publico);
        System.out.println("Status: " + this.status);
        if (this.canal != null) {
            this.canal.imprimirDados();
        }
        if (this.mensagem != null) {
            this.mensagem.imprimirDados();
        }
    }
}