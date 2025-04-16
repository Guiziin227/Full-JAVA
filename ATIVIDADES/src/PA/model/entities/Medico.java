package PA.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa{

    private String crm;

    private List<Auxiliar> auxiliares;

    public Medico(String nome, String dataNascimento, String crm) {
        super(nome, dataNascimento);
        this.crm = crm;
        this.auxiliares = new ArrayList<>();
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<Auxiliar> getAuxiliares() {
        return auxiliares;
    }

    public void designarAuxiliar(Auxiliar aux){
        if(!auxiliares.contains(aux)){
            auxiliares.add(aux);
            System.out.println("Auxiliar designado com sucesso.");
        } else {
            System.out.println("Auxiliar já designado.");
        }
    }


    @Override
    public int calcularIdade() {

        LocalDate dataNasc = LocalDate.parse(dataNascimento);
        LocalDate hoje = LocalDate.now();

        int idade = hoje.getYear() - dataNasc.getYear();

        return idade;
    }



}
