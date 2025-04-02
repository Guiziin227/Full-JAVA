package aula01_interfaces.model.entities;

import java.time.LocalDateTime;

public class CarRental {
    private LocalDateTime start;
    private LocalDateTime finish;

    private Vehicles vehicles;

    private Invoice invoice;

    public CarRental() {
    }

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicles vehicles) {
        this.start = start;
        this.finish = finish;
        this.vehicles = vehicles;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
