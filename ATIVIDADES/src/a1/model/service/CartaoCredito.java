package a1.model.service;

public class CartaoCredito extends MetodoPagamento{

    public CartaoCredito(String titular) {
        super(titular);
    }

    public double calcularPagamento(double valor, int parcelas) {
        double part = valor / parcelas; //200
        double juros = part * parcelas * 0.01;

        return part + juros;
    }
}
