import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private int proximoId = 1;

    public void adicionarProduto(String nome, int quantidade, double preco) {
        produtos.add(new Produto(proximoId, nome, quantidade, preco));
        System.out.println("Produto adicionado com sucesso! ID: " + proximoId);
        proximoId++;
    }

    public void removerProduto(int id) {
        boolean removido = produtos.removeIf(p -> p.getId() == id);
        if (removido) {
            System.out.println("Produto removido com sucesso! ID: " + id);
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    public void atualizarProduto(int id, String nome, int quantidade, double preco) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setQuantidade(quantidade);
                produto.setPreco(preco);
                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto com ID " + id + " não encontrado.");
    }

    public void buscarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                System.out.println(produto);
                return;
            }
        }
        System.out.println("Nenhum produto encontrado com o ID: " + id);
    }
}
