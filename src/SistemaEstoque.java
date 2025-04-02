import java.util.Scanner;

public class SistemaEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estoque estoque = new Estoque();


        while (true) {
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

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("<----------Cadastrar no Estoque------------->");
                    System.out.println(" ");

                    System.out.print("Informe o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Informe a quantidade: ");
                    int quantidade = sc.nextInt();
                    System.out.print("Informe o preço: ");
                    double valor = sc.nextDouble();
                    estoque.adicionarProduto(nome, quantidade, valor);
                    break;

                case 2:
                    System.out.println("<----------Listar Estoque------------->");
                    System.out.println(" ");
                    estoque.listarProdutos();
                    break;

                case 3:
                    System.out.println("<----------Remover Produto------------->");
                    System.out.println(" ");
                    System.out.print("Informe o ID do produto: ");
                    int idRemover = sc.nextInt();
                    estoque.removerProduto(idRemover);
                    break;

                case 4:
                    System.out.println("<----------Buscar no Estoque------------->");
                    System.out.println(" ");
                    System.out.print("Informe o ID do produto: ");
                    int idEstoque = sc.nextInt();
                    estoque.buscarProduto(idEstoque);
                    break;

                case 5:
                    System.out.println("<----------Atualizar Produto no Estoque------------->");
                    System.out.println(" ");
                    System.out.print("Informe o ID do produto: ");
                    int idAtualizar = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer
                    System.out.print("Informe o novo nome do produto: ");
                    String nomeAtualizar = sc.nextLine();
                    System.out.print("Informe a nova quantidade do produto: ");
                    int quantidadeAtualizar = sc.nextInt();
                    System.out.print("Informe o novo preço do produto: ");
                    double valorAtualizar = sc.nextDouble();
                    estoque.atualizarProduto(idAtualizar, nomeAtualizar, quantidadeAtualizar, valorAtualizar);
                    break;

                case 6:
                    System.out.println(" ");
                    System.out.println("Saindo do Sistema Estoque...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
