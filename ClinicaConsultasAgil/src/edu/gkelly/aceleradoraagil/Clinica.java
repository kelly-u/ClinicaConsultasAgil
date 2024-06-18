package edu.gkelly.aceleradoraagil;
import java.util.Locale;
import java.util.Scanner;

public class Clinica {
    public static void main(String[] args) throws Exception {

        int numeroMenu = 0;

        do{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Paciente paciente = new Paciente();

        System.out.println("********* BEM-VINDO(A) À CLÍNICA CONSULTAS ÁGIL *********");

        System.out.println("Informe o númro da funcionalidade desejada:");

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
                System.out.println("Whats e Instagram grátis");
                break;
            case 3:
                System.out.println("100 min de ligação");
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
