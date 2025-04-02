import java.util.Scanner;

public class SistemaEstoque {
    public static void main(String[] args) {
        // Scanner para entrada de dados do usuário
        Scanner sc = new Scanner(System.in);
        // Instância da classe Estoque para gerenciar os produtos
        Estoque estoque = new Estoque();

        // Loop infinito para exibir o menu e processar as opções do usuário
        while (true) {
            // Exibição do menu principal
            System.out.println(" ");
            System.out.println("- - - -  Sistema Estoque  - - - - ");
            System.out.println(" ");
            System.out.println(" 1 - Cadastrar no Estoque        |");
            System.out.println(" 2 - Listar Estoque              |");
            System.out.println(" 3 - Excluir do Estoque          |");
            System.out.println(" 4 - Buscar no Estoque           |");
            System.out.println(" 5 - Atualizar Estoque           |");
            System.out.println(" 6 - Sair do Sistema Estoque     |");
            System.out.println(" ");
            System.out.print("Escolha uma opção: ");
            System.out.println(" ");

            // Lê a opção escolhida pelo usuário
            int opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do scanner

            // Processa a opção escolhida pelo usuário
            switch (opcao) {
                case 1:
                    // Cadastrar um novo produto no estoque
                    System.out.println("<----------Cadastrar no Estoque------------->");
                    System.out.println(" ");
                    System.out.print("Informe o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Informe a quantidade: ");
                    int quantidade = sc.nextInt();
                    System.out.print("Informe o preço: ");
                    double valor = sc.nextDouble();
                    // Chama o método para adicionar o produto
                    estoque.adicionarProduto(nome, quantidade, valor);
                    break;

                case 2:
                    // Listar todos os produtos cadastrados no estoque
                    System.out.println("<----------Listar Estoque------------->");
                    System.out.println(" ");
                    estoque.listarProdutos();
                    break;

                case 3:
                    // Remover um produto do estoque pelo ID
                    System.out.println("<----------Remover Produto------------->");
                    System.out.println(" ");
                    System.out.print("Informe o ID do produto: ");
                    int idRemover = sc.nextInt();
                    // Chama o método para remover o produto
                    estoque.removerProduto(idRemover);
                    break;

                case 4:
                    // Buscar um produto no estoque pelo ID
                    System.out.println("<----------Buscar no Estoque------------->");
                    System.out.println(" ");
                    System.out.print("Informe o ID do produto: ");
                    int idEstoque = sc.nextInt();
                    // Chama o método para buscar o produto
                    estoque.buscarProduto(idEstoque);
                    break;

                case 5:
                    // Atualizar as informações de um produto no estoque
                    System.out.println("<----------Atualizar Produto no Estoque------------->");
                    System.out.println(" ");
                    System.out.print("Informe o ID do produto: ");
                    int idAtualizar = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer do scanner
                    System.out.print("Informe o novo nome do produto: ");
                    String nomeAtualizar = sc.nextLine();
                    System.out.print("Informe a nova quantidade do produto: ");
                    int quantidadeAtualizar = sc.nextInt();
                    System.out.print("Informe o novo preço do produto: ");
                    double valorAtualizar = sc.nextDouble();
                    // Chama o método para atualizar o produto
                    estoque.atualizarProduto(idAtualizar, nomeAtualizar, quantidadeAtualizar, valorAtualizar);
                    break;

                case 6:
                    // Sair do sistema
                    System.out.println(" ");
                    System.out.println("Saindo do Sistema Estoque...");
                    sc.close(); // Fecha o scanner
                    return; // Encerra o programa

                default:
                    // Mensagem para opção inválida
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
