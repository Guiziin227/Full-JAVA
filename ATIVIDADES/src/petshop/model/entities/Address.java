package petshop.model.entities;

public class Address {
    private Integer numeroCasa;
    private String cidade;
    private String rua;
    private String bairro;

    public Address(Integer numeroCasa, String cidade, String rua, String bairro) {
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
    }

    public Integer getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(Integer numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return
                "numero: " + numeroCasa +
                        ", cidade: '" + cidade + '\'' +
                        ", rua: " + rua +
                        ", bairro: " + bairro;
    }
}
