import java.math.BigDecimal;

public class Servico {
    private String nome;
    private BigDecimal preco;
    private int duracao; // duração em minutos

    public Servico(String nome, BigDecimal preco, int duracao) {
        setNome(nome);
        setPreco(preco);
        setDuracao(duracao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        if (preco == null || preco.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O preço não pode ser nulo ou negativo.");
        }
        this.preco = preco;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if (duracao <= 0) {
            throw new IllegalArgumentException("A duração deve ser um valor positivo.");
        }
        this.duracao = duracao;
    }
}
