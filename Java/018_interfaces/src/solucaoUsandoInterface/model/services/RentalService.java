package solucaoUsandoInterface.model.services;

import solucaoUsandoInterface.model.entities.Invoice;
import solucaoUsandoInterface.model.entities.VehicleRental;

import java.time.Duration;

public class RentalService {
    public final double pricePerHour;
    public final double pricePerDay;

    private final TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(VehicleRental rental) {
        double minutes = Duration.between(rental.getStartDate(), rental.getFinishDate()).toMinutes();
        double hours = minutes / 60;

        double basicPayment;
        if (hours <= 12) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basicPayment);

        Invoice invoice = new Invoice(basicPayment, tax);
        rental.setInvoice(invoice);
    }
}