package ex6.entities;

public class Employe {
    private String nome;
    private Integer id;
    private Double salario;

    public Employe(String nome, Integer id, Double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public Employe() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(Double porcentagem){
        salario += salario * porcentagem / 100;
    }
}
