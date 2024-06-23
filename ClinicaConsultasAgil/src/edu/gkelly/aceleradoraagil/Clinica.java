import java.util.Locale;
import java.util.Scanner;

public class Clinica {
    public static void main(String[] args) throws Exception {

        int numeroMenu = 0;
        int remarcarAgendamento = 0;
        String nome = "";
        String numero = "";
        String dia = "";
        String hora = "";
        String especialidade = "";

        ListaConsulta listaConsulta = new ListaConsulta();
        ListaPaciente listaPaciente = new ListaPaciente();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Scanner scanner2 = new Scanner(System.in).useLocale(Locale.US);

        do {
            System.out.println("");

            System.out.println("********* BEM-VINDO(A) À CLÍNICA CONSULTAS ÁGIL *********");

            System.out.println("Informe o número da funcionalidade desejada:");

            System.out.println("1 - Cadastrar um paciente");
            System.out.println("2 - Marcações de consultas");
            System.out.println("3 - Cancelamento de consultas");
            System.out.println("4 - Sair");
            System.out.println("");

            numeroMenu = scanner.nextInt();

            switch (numeroMenu) {
                case 1:
                    System.out.println("Digite o nome completo do paciente:");
                    nome = scanner2.nextLine();

                    System.out.println("Digite o telefone do paciente:");
                    numero = scanner.next();

                    listaPaciente.adicionarPaciente(nome, numero);

                    // System.out.println("A quantidade de pacientes é: " +
                    // listaPaciente.obterNumeroTotalPacientes());
                    break;
                case 2:
                    listaPaciente.visualizarPacientes();

                    System.out.println("");
                    System.out.println("Digite o número que corresponde ao usuário desejado:");
                    int escolherUsuario = scanner.nextInt();

                    System.out.println("Digite o dia da consulta:");
                    dia = scanner.next();

                    System.out.println("Digite a hora da consulta:");
                    hora = scanner.next();

                    System.out.println("Digite a especialidade da consulta:");
                    especialidade = scanner2.nextLine();

                    Paciente pacienteConsulta = listaPaciente.obterPacienteIndex(escolherUsuario);

                    listaConsulta.adicionarConsulta(pacienteConsulta, dia, hora, especialidade);

                    //System.out.println("Total de consultas: " + listaConsulta.obterNumeroTotalConsultas());
                    // listaConsulta.visualizarConsultas();
                    break;
                case 3:
                    listaConsulta.visualizarConsultas();

                    System.out.println("");

                    System.out.println("Digite o número que corresponde ao agendamento que deseja remarcar:");
                    remarcarAgendamento = scanner.nextInt();

                    System.out.println("");

                    System.out.println(listaConsulta.obterConsultaIndex(remarcarAgendamento));

                    System.out.println("Deseja cancelar esta consulta?");
                    System.out.println("Digite 1 para confirmar ou qualquer numero para cancelar:");
                    int confirmacaoCancelamentoConsulta = scanner.nextInt();

                    if (confirmacaoCancelamentoConsulta == 1) {
                        listaConsulta.removerConsulta(dia, hora, especialidade);
                    }
                    System.out.println("Total de consultas: " + listaConsulta.obterNumeroTotalConsultas());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("NÚMERO INVÁLIDO!");
                    break;
            }
        } while (numeroMenu >= 1 && numeroMenu < 4);
    }

}
