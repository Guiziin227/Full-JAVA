package aula05_default.model.services;

public interface InterestService {
    double getInterestRate();
    default double payment(double amount, int months) {
        if (months < 0) {
            throw new IllegalArgumentException("Months musta be positive");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}
