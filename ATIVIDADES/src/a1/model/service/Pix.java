package a1.model.service;

public class Pix extends MetodoPagamento{

    public Pix(String titular){
        super(titular);
    }

    public double calcularPagamento(double valor, int parcelas) {
        parcelas = 1;
        return valor * parcelas;
    }
}
