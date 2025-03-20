package aula01_billing;

import aula01_billing.entities.Pedidos;
import aula01_billing.entities.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pedidos order = new Pedidos(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);
    }
}
