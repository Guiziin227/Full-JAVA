package PA.model.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Auxiliar extends Pessoa{

    private String codigo;

    private Medico medico;


    public Auxiliar(String nome, String dataNascimento, String codigo) {
        super(nome, dataNascimento);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public int calcularIdade() {

        LocalDate dataNasc = LocalDate.parse(dataNascimento);
        LocalDate hoje = LocalDate.now();

        int idade = hoje.getYear() - dataNasc.getYear();

        return idade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Auxiliar auxiliar = (Auxiliar) o;
        return Objects.equals(codigo, auxiliar.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
