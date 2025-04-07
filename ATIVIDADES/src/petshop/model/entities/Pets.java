package petshop.model.entities;

import petshop.model.entities.enums.Sexo;
import petshop.model.entities.enums.Tipo;
import petshop.model.exceptions.DomainExceptions;

public class Pets {
    private String nomeCompleto;
    private Address address;
    private Double idade;
    private Double peso;
    private String raça;

    private Tipo tipo;
    private Sexo sexo;

    public Pets(String nomeCompleto, Address address, Double idade, Double peso, String raça, Tipo tipo, Sexo sexo) throws DomainExceptions {
        validarNomeCompleto(nomeCompleto);
        this.address = address;
        this.idade = idade;
        this.peso = peso;
        this.raça = raça;
        this.tipo = tipo;
        this.sexo = sexo;
    }

    public void validarNomeCompleto(String nomeCompleto) throws DomainExceptions {
        int espacos = 0;
        for (int j = 0; j < nomeCompleto.length(); j++) {
            if (nomeCompleto.charAt(j) == ' ') {
                espacos++;
            }


        }

        if (espacos == 0 || !nomeCompleto.matches("^[A-Za-z]+\\s[A-Za-z]+$")) {
            throw new DomainExceptions("O nome precisa ser completo e sem caracteres especiais");
        } else {
            System.out.println("Nome cadastrado");
            this.nomeCompleto = nomeCompleto;
        }
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) throws DomainExceptions {
        validarNomeCompleto(nomeCompleto);
    }

    public Address getEndereço() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Double getIdade() {
        return idade;
    }

    public void setIdade(Double idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {


        return
                "Nome completo: '" + nomeCompleto + '\'' +
                        ", " + address.toString() +
                        ", idade: " + idade +
                        ", peso: " + peso +
                        ", raça: '" + raça + '\'' +
                        ", tipo: " + tipo +
                        ", sexo: " + sexo;


    }
}
