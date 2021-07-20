package lista01_questao01;

public class Produto {
    
    // Declaração de variáveis
    private String nome;
    private String descricao;
    private double valor;
    private int quantidade;
    private int codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    @Override
    public String toString() {
        return "Código " + codigo + " | " +
                "Nome: " + nome + " | " +
                "Valor: " + valor + " | " +
                "Quantidade: " + quantidade + " | ";
    }
}

         
