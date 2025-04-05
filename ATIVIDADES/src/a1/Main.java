package a1;

import a1.model.service.CartaoCredito;
import a1.model.service.MetodoPagamento;
import a1.model.service.Pix;

public class Main {
    public static void main(String[] args) {
        MetodoPagamento p1 = new CartaoCredito("Guilherme");
        System.out.println(p1.getTitular() + " "+ "R$" + p1.calcularPagamento(600,3));

        MetodoPagamento p2 = new Pix("Malu");
        System.out.println(p2.getTitular() + " "+ "R$" + p2.calcularPagamento(600,3));
    }
}