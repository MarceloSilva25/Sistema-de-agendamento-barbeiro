public class Cliente {
    private String nome;
    private String telefone;

    public Cliente (String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
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
