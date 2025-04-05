package a1.model.service;

public abstract class MetodoPagamento implements Pagamento {
    private String titular;

    public MetodoPagamento(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
