package aula179;

import aula179.services.PrintService;

public class Main {
    public static void main(String[] args) {
        PrintService<Integer> printService = new PrintService<Integer>();

        printService.addValue(10);
        printService.addValue(20);
        printService.addValue(30);
        printService.addValue(40);

        printService.first();
        printService.print();
    }
}
