package edu.gkelly.aceleradoraagil;
import java.util.Locale;
import java.util.Scanner;

public class Clinica {
    public static void main(String[] args) throws Exception {

        int numeroMenu = 0;

        do{

            Paciente paciente = new Paciente();
            Consulta consulta = new Consulta();
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("");

            System.out.println("********* BEM-VINDO(A) À CLÍNICA CONSULTAS ÁGIL *********");

            System.out.println("Informe o número da funcionalidade desejada:");

            System.out.println("1 - Cadastrar um paciente");
            System.out.println("2 - Marcações de consultas");
            System.out.println("3 - Cancelamento de consultas");
            System.out.println("4 - Sair");

            numeroMenu = scanner.nextInt();

            switch (numeroMenu) {
                case 1:
                    paciente.cadastrarPaciente();
                    break;
                case 2:
                    consulta.marcarConsulta();
                    break;
                case 3:
                    consulta.cancelarConsulta();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Número inválido!");
                    break;    
            }
    } while(numeroMenu >= 1 && numeroMenu < 4);
    }

}
