package solucaoUsandoInterface.model.entities;

import java.time.LocalDateTime;

public class VehicleRental {
    private LocalDateTime startDate;
    private LocalDateTime finishDate;

    private Vehicle vehicle;
    private Invoice invoice;

    public VehicleRental() {}
    public VehicleRental(
            LocalDateTime startDate,
            LocalDateTime finishDate,
            Vehicle vehicle
    ) {
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.vehicle = vehicle;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getFinishDate() {
        return finishDate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
