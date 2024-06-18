package edu.gkelly.aceleradoraagil;

import java.util.List;

public class Consulta {

    int dia;
    String data;
    String especialidade;
    List agendamentos;

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
}
