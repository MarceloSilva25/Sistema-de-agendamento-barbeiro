import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeAgendamentos {
    private List<Agendamento> agendamentos;

    public GerenciadorDeAgendamentos() {
        this.agendamentos = new ArrayList<>();

    }

    public void adicionarAgendamento(Agendamento agendamento) {

        if (agendamento != null) {

            DayOfWeek diaDaSemana = agendamento.getData().getDayOfWeek();
            String dia = diaDaSemana.getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.of("pt", "BR"));
            if (agendamento.getProfissional().getDiasDisponiveis().contains(dia)) {
                this.agendamentos.add(agendamento);
            }
        }

    }

}

