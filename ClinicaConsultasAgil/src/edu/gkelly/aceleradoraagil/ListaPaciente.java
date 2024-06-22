import java.util.ArrayList;
import java.util.List;

public class ListaPaciente {

    private List<Paciente> pacienteList;

    public ListaPaciente() {
        this.pacienteList = new ArrayList<>();
    }

    public void adicionarPaciente(String nome, String numero){
        pacienteList.add(new Paciente(nome, numero));
    }
    
    public int obterNumeroTotalPacientes(){
        return pacienteList.size();
    }

    public Paciente obterPacienteIndex(int index){
        return pacienteList.get(index);
    }

    public void visualizarPacientes(){
        int i = 0;
        for (Paciente paciente : pacienteList) {
            System.out.println(i + " = " + pacienteList.get(i));
            i ++;
        }  
    }

    /*
    

      public void cadastrarPaciente(){
        System.out.println("Digite o nome completo do paciente:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o telefone do paciente:");
        int numero = scanner.nextInt();

        // Adicionar o paciente à lista de Pacientes Cadastrados
        System.out.println("Paciente cadastrado com sucesso");
    }
     */

}
