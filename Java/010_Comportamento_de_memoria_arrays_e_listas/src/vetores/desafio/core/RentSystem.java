package vetores.desafio.core;

import vetores.desafio.Rent;

import java.util.Locale;
import java.util.Scanner;

public class RentSystem {
    private final Scanner sc = new Scanner(System.in);
    private Rent[] rents;

    public void run() {
        Locale.setDefault(Locale.US);

        this.rents = new Rent[9];

        while (true) {
            this.showMenu();

            System.out.print("Escolha uma opção: ");
            int option = this.sc.nextInt();

            switch (option) {
                case 1:
                    this.rentRoom();
                    break;
                case 2:
                    this.cancelRent();
                    break;
                case 3:
                    this.viewRents();
                    break;
                case 4:
                    break;
            }
        }
    }

    private int getNumberOfVacantRooms() {
        int vacantRooms = 0;

        for (int i = 0; i < this.rents.length; i++) {
            if (this.rents[i] == null) {
                vacantRooms++;
            }
        }

        return vacantRooms;
    }

    private void showVacantRooms() {
        System.out.print("\nQuartos livres:\n| ");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] == null) {
                System.out.printf("Quarto %d | ", i + 1);
            }
        }
    }

    private void rentRoom() {
        int vacantRooms = this.getNumberOfVacantRooms();

        int roomsToRent;

        while (true) {
            System.out.printf("Insira o número de quartos que vão ser reservados [0-%d]: ", vacantRooms);

            roomsToRent = this.sc.nextInt();
            if (roomsToRent >= 1 && roomsToRent <= vacantRooms) {
                break;
            } else {
                System.out.printf("Número inválido. Máximo: %d\n", vacantRooms);
            }
        }

        int i = 0;
        do {
            this.showVacantRooms();

            System.out.printf("\nReserva #%d\n", i + 1);
            System.out.print("Insira o seu nome: ");
            String name = sc.next();
            System.out.print("Insira o seu e-mail: ");
            String email = sc.next();
            System.out.print("Insira o número do quarto que deseja reservar: ");
            int room = sc.nextInt();

            if (rents[room - 1] == null) {
                Rent rent = new Rent(name, email, room);
                rents[room - 1] = rent;
                i++;
            } else {
                System.out.printf("O quarto %d já está ocupado.", room);
            }
        } while (i < roomsToRent);
    }

    private void viewRents() {
        System.out.println("============ Rents ============");
        for (int i = 0; i < this.rents.length; i++) {
            if (this.rents[i] != null) {
                System.out.println(this.rents[i].toString());
            }
        }
        System.out.println("===============================");
    }

    private void cancelRent() {
        System.out.print("Insira o seu e-mail: ");
        String email = this.sc.next();
        System.out.print("Insira o número do seu quarto: ");
        int number = this.sc.nextInt();

        if (this.rents[number - 1] != null && this.rents[number - 1].getEmail().equals(email)) {
            this.rents[number - 1] = null;
            System.out.print("Reserva cancelada\n");
        } else {
            System.out.print("Não existe essa reserva.\n");
        }
    };

    private void showMenu() {
        System.out.println("|====== Rent System ======|");
        System.out.println("| [1] Reservar quarto     |");
        System.out.println("| [2] Cancelar reserva    |");
        System.out.println("| [3] Consultar reservas  |");
        System.out.println("| [4] Sair                |");
        System.out.println("|=========================|");
    }
}
