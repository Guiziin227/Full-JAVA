package aula04_polimorfismo.entities;

public class FuncionarioTerceirizado extends Funcionario{
    private Double additionalCharge;

    public FuncionarioTerceirizado() {
    }

    public FuncionarioTerceirizado(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
        super(name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        Double sum = 0.0;
        sum += (hour * valuePerHour) + (1.1 * additionalCharge);
        return sum;
    }
}
