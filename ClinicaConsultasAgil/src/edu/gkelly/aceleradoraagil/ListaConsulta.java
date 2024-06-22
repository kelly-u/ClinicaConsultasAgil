import java.util.ArrayList;
import java.util.List;

public class ListaConsulta {

    private List<Consulta> consultaList;
    int i = 0;

    public ListaConsulta() {
        this.consultaList = new ArrayList<>();
    }

    public void adicionarConsulta(Paciente pacienteConsulta, String dia, String hora, String especialidade){
        consultaList.add(new Consulta( pacienteConsulta, dia, hora, especialidade));
    }

    public void removerConsulta(String dia, String hora, String especialidade){

        List<Consulta> consultasParaRemover = new ArrayList<>();

        for(Consulta c : consultaList){
            if(c.getDia().equalsIgnoreCase(dia) && c.getHora().equalsIgnoreCase(hora) && c.getEspecialidade().equalsIgnoreCase(especialidade)){
                consultasParaRemover.add(c);
            }
        }
        consultaList.removeAll(consultasParaRemover);
    }

    public int obterNumeroTotalConsultas(){
        return consultaList.size();
    }

    public void visualizarConsultas(){
        for (Consulta consulta : consultaList) {
            System.out.println(i + " = " + consultaList.get(i));
            i ++;
        }  
    }






    /*
      // Exibir lista dos pacientes cadastrados com nº
    // Escolhe o número, dia, hora e especialidade
    // Adicionado à lista de agendamentos
    public void marcarConsulta(){
        // Só para ver no console que entrou nesse método
        System.out.println("Marcando consulta...");
    }
    
    // Mostra lista de agendamentos com nº
    // Escolhe o nº que deseja remarcar
    // Exibir mensagem com dia, hora e especialidade
    // Pode cancelar a consulta ou não
    // Cancelamento feito? Removido da lista
    public void cancelarConsulta(){
        // Só para ver no console que entrou nesse método
        System.out.println("Cancelando consulta...");
    }
     */
}
