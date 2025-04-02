import java.util.ArrayList;

public class Estoque {
    // Lista para armazenar os produtos cadastrados no estoque
    private ArrayList<Produto> produtos = new ArrayList<>();
    // Variável para gerar IDs únicos para cada produto
    private int proximoId = 1;

    /**
     * Adiciona um novo produto ao estoque.
     * 
     * @param nome       Nome do produto.
     * @param quantidade Quantidade inicial do produto.
     * @param preco      Preço do produto.
     */
    public void adicionarProduto(String nome, int quantidade, double preco) {
        produtos.add(new Produto(proximoId, nome, quantidade, preco));
        System.out.println("Produto adicionado com sucesso! ID: " + proximoId);
        proximoId++; // Incrementa o ID para o próximo produto
    }

    /**
     * Remove um produto do estoque com base no ID.
     * 
     * @param id ID do produto a ser removido.
     */
    public void removerProduto(int id) {
        // Remove o produto se o ID corresponder
        boolean removido = produtos.removeIf(p -> p.getId() == id);
        if (removido) {
            System.out.println("Produto removido com sucesso! ID: " + id);
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    /**
     * Lista todos os produtos cadastrados no estoque.
     * Exibe uma mensagem se não houver produtos cadastrados.
     */
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            // Itera sobre a lista de produtos e exibe suas informações
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    /**
     * Atualiza as informações de um produto existente no estoque.
     * 
     * @param id         ID do produto a ser atualizado.
     * @param nome       Novo nome do produto.
     * @param quantidade Nova quantidade do produto.
     * @param preco      Novo preço do produto.
     */
    public void atualizarProduto(int id, String nome, int quantidade, double preco) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                // Atualiza os atributos do produto
                produto.setQuantidade(quantidade);
                produto.setPreco(preco);
                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto com ID " + id + " não encontrado.");
    }

    /**
     * Busca um produto no estoque com base no ID.
     * 
     * @param id ID do produto a ser buscado.
     */
    public void buscarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                // Exibe as informações do produto encontrado
                System.out.println(produto);
                return;
            }
        }
        System.out.println("Nenhum produto encontrado com o ID: " + id);
    }
}
