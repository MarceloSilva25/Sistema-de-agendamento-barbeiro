import java.time.LocalDateTime;

public class Agendamento {

    private LocalDateTime data;
    private Cliente cliente;
    private Profissional profissional;
    private Servico servico;

    public Agendamento(LocalDateTime data, Cliente cliente, Profissional profissional, Servico servico) {
        this.data = data;
        this.cliente = cliente;
        this.profissional = profissional;
        this.servico = servico;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public Servico getServico() {
        return servico;
    }
}