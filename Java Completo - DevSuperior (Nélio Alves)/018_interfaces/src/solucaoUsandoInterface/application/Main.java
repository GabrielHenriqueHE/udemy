package solucaoUsandoInterface.application;

import solucaoUsandoInterface.model.entities.Vehicle;
import solucaoUsandoInterface.model.entities.VehicleRental;
import solucaoUsandoInterface.model.services.BrazilTaxService;
import solucaoUsandoInterface.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String vehicleModel = sc.nextLine();
        Vehicle vehicle = new Vehicle(vehicleModel);
        System.out.print("Data e hora de início (dd/MM/yyyy HH:mm): ");
        LocalDateTime startDate = LocalDateTime.parse(sc.nextLine(), dateTimeFormatter);
        System.out.print("Data e hora de retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finishDate = LocalDateTime.parse(sc.nextLine(), dateTimeFormatter);

        VehicleRental vehicleRental = new VehicleRental(startDate, finishDate, vehicle);

        System.out.print("Insira o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Insira o preço por dia: ");
        double pricePerDay = sc.nextDouble();


        BrazilTaxService taxService = new BrazilTaxService();
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, taxService);

        rentalService.processInvoice(vehicleRental);
        System.out.println(vehicleRental.getInvoice().toString());

    }
}
