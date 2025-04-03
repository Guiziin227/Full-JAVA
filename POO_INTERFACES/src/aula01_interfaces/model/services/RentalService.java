package aula01_interfaces.model.services;

import aula01_interfaces.model.entities.CarRental;
import aula01_interfaces.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxService brazilTaxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brazilTaxService = brazilTaxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes(); //pegando a diferença de tempo em minutos
        double hours = minutes / 60;

        double basicPayment;
        if (hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours);
        }else{
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = brazilTaxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));
    }
}
