package ex02.entities;

public class PessoaJuridica extends Contribuintes{

    private Integer numeroFuncionario;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionario){
        super(name,rendaAnual);
        this.numeroFuncionario = numeroFuncionario;
    }

    public Integer getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(Integer numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    @Override
    public double imposto(){
        double tax = 0.0;

        if (numeroFuncionario > 10){
            tax += getRendaAnual() * 0.14;
        } else {
            tax += getRendaAnual() * 0.16;
        }

        return tax;
    }
}
