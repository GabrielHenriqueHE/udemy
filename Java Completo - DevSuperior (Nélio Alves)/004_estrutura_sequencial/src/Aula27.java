import java.util.Locale;
import java.util.Scanner;

public class Aula27 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        String line;
        String line2;

        System.out.println("Digite a próxima linha: ");
        line = sc.nextLine();
        System.out.println("Digite mais uma linha: ");
        line2 = sc.nextLine();
        System.out.printf("Linha 1: %s\n", line);
        System.out.printf("Linha 2: %s", line2);

    }
}
