public class Produto {
    // Atributos da classe Produto
    private int id; // Identificador único do produto
    private String nome; // Nome do produto
    private int quantidade; // Quantidade disponível do produto
    private double preco; // Preço do produto

    /**
     * Construtor da classe Produto.
     * Inicializa os atributos do produto com os valores fornecidos.
     * 
     * @param id         Identificador único do produto.
     * @param nome       Nome do produto.
     * @param quantidade Quantidade inicial do produto.
     * @param preco      Preço do produto.
     */
    public Produto(int id, String nome, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Métodos getters para acessar os atributos do produto
    public int getId() {
        return id; // Retorna o ID do produto
    }

    public String getNome() {
        return nome; // Retorna o nome do produto
    }

    public int getQuantidade() {
        return quantidade; // Retorna a quantidade do produto
    }

    public double getPreco() {
        return preco; // Retorna o preço do produto
    }

    // Métodos setters para atualizar os atributos do produto
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade; // Atualiza a quantidade do produto
    }

    public void setPreco(double preco) {
        this.preco = preco; // Atualiza o preço do produto
    }

    /**
     * Método toString sobrescrito.
     * Retorna uma representação em string do produto, incluindo ID, nome, quantidade e preço.
     * 
     * @return String formatada com as informações do produto.
     */
    @Override
    public String toString() {
        return String.format("ID: %d | Nome: %s | Quantidade: %d | Preço: R$%.2f", id, nome, quantidade, preco);
    }
}