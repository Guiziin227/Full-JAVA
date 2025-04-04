package ex01.model.services;

import ex01.model.services.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {
    private static final double FEE_PERCENTAGE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;

    public double interest(Double amount, Integer months) {
        return amount * MONTHLY_INTEREST * months;
    }

    public double paymentFee(Double amount) {
        return amount * FEE_PERCENTAGE;
    }
}