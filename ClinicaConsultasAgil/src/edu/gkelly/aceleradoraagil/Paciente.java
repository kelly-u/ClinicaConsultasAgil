package edu.gkelly.aceleradoraagil;

import java.util.Locale;
import java.util.Scanner;

public class Paciente {
    String nome;
    int numero;

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void cadastrarPaciente(){
        System.out.println("Digite o nome completo do paciente:");
        String nome = scanner.next();
        
        System.out.println("Digite o telefone do paciente:");
        int numero = scanner.nextInt();

        // Adicionar o paciente à lista de Pacientes Cadastrados
        System.out.println("Paciente cadastrado com sucesso");
    }
}
