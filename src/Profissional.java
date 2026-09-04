import java.util.ArrayList;

public class Profissional {
    private String nome;
    private String telefone;
    private String especialidade;
    private ArrayList<String> diasDisponiveis;

    public Profissional(String nome, String telefone, String especialidade) {
        setNome(nome);
        setTelefone(telefone);
        setEspecialidade(especialidade);
        this.diasDisponiveis = new ArrayList<>();
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if (especialidade == null || especialidade.isEmpty()) {
            throw new IllegalArgumentException("A especialidade não pode ser nula ou vazia.");
        }
        this.especialidade = especialidade;
    }

    public ArrayList<String> getDiasDisponiveis() {
        return diasDisponiveis;
    }

    public void adicionarDiaDisponivel(String dia) {
        if (dia == null || dia.isEmpty() || !dia.matches("^(Segunda-feira|Terça-feira|Quarta-feira|Quinta-feira|Sexta-feira|Sábado|Domingo)$")) {
            throw new IllegalArgumentException("O dia não pode ser nulo ou inválido.");
        }
        if (diasDisponiveis.contains(dia)) {
            throw new IllegalArgumentException("O dia já está disponível.");
        }

        diasDisponiveis.add(dia);
    }

    public boolean estaDisponivel(String dia) {
        return diasDisponiveis.contains(dia);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isEmpty()) {
            throw new IllegalArgumentException("O telefone não pode ser nulo ou vazio.");
        }
        String telefoneFormatado = telefone.replaceAll("[^0-9]", "");

        if (telefoneFormatado.length() != 11) {
            throw new IllegalArgumentException("O telefone deve ter 11 digitos.");
        }

        this.telefone = telefoneFormatado;
    }


}
