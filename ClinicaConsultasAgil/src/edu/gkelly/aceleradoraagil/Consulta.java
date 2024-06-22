import java.util.List;

public class Consulta {

    Paciente paciente;
    String dia;
    String hora;
    String especialidade;
 
   public Consulta(Paciente paciente, String dia, String hora, String especialidade) {
        this.paciente = paciente;
        this.dia = dia;
        this.hora = hora;
        this.especialidade = especialidade;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getHora() {
        return hora;
    }

   public String getDia() {
       return dia;
   }

   public String getEspecialidade() {
       return especialidade;
   }

   @Override
   public String toString() {
       return "Dia: " + dia + " / Hora: " + hora + " / Especialidade: " + especialidade;
   }

}


