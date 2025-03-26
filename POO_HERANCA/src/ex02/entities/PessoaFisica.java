package ex02.entities;

public class PessoaFisica extends Contribuintes{
    private Double gastoEmSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String name,Double rendaAnual,Double gastoEmSaude) {
        super(name,rendaAnual);
        this.gastoEmSaude = gastoEmSaude;
    }

    public Double getGastoEmSaude() {
        return gastoEmSaude;
    }

    public void setGastoEmSaude(Double gastoEmSaude) {
        this.gastoEmSaude = gastoEmSaude;
    }

    @Override
    public double imposto(){
        double tax = 0.0;

        if (getRendaAnual() > 20000){
            if (gastoEmSaude > 0){
                tax += (getRendaAnual() * 0.25) - (gastoEmSaude * 0.5);
            } else{
                tax += (getRendaAnual() * 0.25);
            }
        } else {
            if (gastoEmSaude > 0){
                tax += (getRendaAnual() * 0.15) - (gastoEmSaude * 0.5);
            } else{
                tax += getRendaAnual() * 0.15;
            }
        }

        return tax;
    }
}
