package aula04_polimorfismo.entities;

public class Funcionario {
    private String name;
    protected Integer hour;
    protected Double valuePerHour;

    public Funcionario(){}

    public Funcionario(String name, Integer hour, Double valuePerHour) {
        this.name = name;
        this.hour = hour;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        Double sum = 0.0;
        sum += hour * valuePerHour;
        return sum;
    }
}
