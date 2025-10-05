import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeContatos gerenciador = new GerenciadorDeContatos();

        System.out.println("Bem-vindo ao sistema de gestão de contatos!");

        int opcao = 0;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar novo contato");
            System.out.println("2. Listar todos os contatos");
            System.out.println("3. Atualizar status de um contato");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarContato(gerenciador, scanner);
                    break;
                case 2:
                    gerenciador.listarTodosContatos();
                    break;
                case 3:
                    atualizarStatus(gerenciador, scanner);
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void adicionarContato(GerenciadorDeContatos gerenciador, Scanner scanner) {
        System.out.println("\n--- Adicionar Novo Contato ---");
        System.out.print("Digite o ID do contato: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o tipo de público (beneficiario, dentista, doador, paciente ou voluntario): ");
        String publico = scanner.nextLine();

        System.out.print("Digite o tipo do canal (WhatsApp ou E-mail): ");
        String tipoCanal = scanner.nextLine();
        System.out.print("Digite o identificador do canal (número/e-mail): ");
        String identificadorCanal = scanner.nextLine();
        Canal canal = new Canal(tipoCanal, identificadorCanal);

        System.out.print("Digite o assunto do contato: ");
        String assunto = scanner.nextLine();
        System.out.print("Digite a mensagem do contato: ");
        String conteudo = scanner.nextLine();
        Mensagem mensagem = new Mensagem(assunto, conteudo);

        Contato novoContato = new Contato(id, publico, canal, mensagem);
        gerenciador.adicionarContato(novoContato);
    }

    private static void atualizarStatus(GerenciadorDeContatos gerenciador, Scanner scanner) {
        System.out.println("\n--- Atualizar Status do Contato ---");
        System.out.print("Digite o ID do contato para atualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o novo status (Ex: Em andamento, Resolvido): ");
        String novoStatus = scanner.nextLine();

        gerenciador.atualizarStatusContato(id, novoStatus);
    }
}