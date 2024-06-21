import java.util.Locale;
import java.util.Scanner;

public class Paciente {
    String nome;
    String numero;

    public Paciente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return nome;
    }
}
