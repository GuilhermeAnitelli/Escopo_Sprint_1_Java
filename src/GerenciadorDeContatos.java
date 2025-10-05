import java.util.ArrayList;

public class GerenciadorDeContatos {

    private ArrayList<Contato> listaDeContatos;

    public GerenciadorDeContatos() {
        this.listaDeContatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        listaDeContatos.add(contato);
        System.out.println("Contato adicionado com sucesso.");
    }

    public Contato buscarContatoPorId(int id) {
        for (Contato contato : listaDeContatos) {
            if (contato.verificarId() == id) {
                return contato;
            }
        }
        return null;
    }

    public void atualizarStatusContato(int id, String novoStatus) {
        Contato contatoParaAtualizar = buscarContatoPorId(id);
        if (contatoParaAtualizar != null) {
            contatoParaAtualizar.atualizarStatus(novoStatus);
        } else {
            System.out.println("Contato com o ID " + id + " não encontrado.");
        }
    }

    public void listarTodosContatos() {
        if (listaDeContatos.isEmpty()) {
            System.out.println("Não há contatos cadastrados.");
            return;
        }

        System.out.println("\n--- Lista de Todos os Contatos ---");
        for (Contato contato : listaDeContatos) {
            contato.imprimirDados();
            System.out.println("---------------------------------");
        }
    }
}