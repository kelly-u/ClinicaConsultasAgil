import java.util.List;

public class Consulta {

    String dia;
    String hora;
    String especialidade;

   public Consulta(String dia, String hora, String especialidade) {
        this.dia = dia;
        this.hora = hora;
        this.especialidade = especialidade;
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
       return dia;
   }

}


