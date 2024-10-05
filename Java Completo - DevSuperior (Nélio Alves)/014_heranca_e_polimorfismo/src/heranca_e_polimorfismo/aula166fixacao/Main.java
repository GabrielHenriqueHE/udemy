package heranca_e_polimorfismo.aula166fixacao;

import heranca_e_polimorfismo.aula166fixacao.entities.Contributor;
import heranca_e_polimorfismo.aula166fixacao.entities.LegalEntity;
import heranca_e_polimorfismo.aula166fixacao.entities.NaturalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // NaturalPerson gabriel = new NaturalPerson("Gabriel", 50000.00, 2000.0);
        // System.out.println(gabriel.calculateContributionTax());
        //
        // LegalEntity legal = new LegalEntity("Legal", 400000.00, 25);
        // System.out.println(legal.calculateContributionTax());

        Scanner sc = new Scanner(System.in);

        List<Contributor> contributors = new ArrayList<>();

        System.out.print("Insira o número de contribuintes que deseja cadastrar: ");
        int numberOfContributors = sc.nextInt();

        for (int i = 0; i < numberOfContributors; i++) {
            System.out.printf("Dados do contribuinte #%d:\n", i + 1);
            System.out.print("Informe o tipo de contribuinte (F/J): ");
            char contributorType = sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            System.out.print("Informe o nome do contribuinte: ");
            String name = sc.nextLine();
            System.out.print("Informe a renda anual: R$");
            double annualIncome = sc.nextDouble();
            sc.nextLine();

            if (contributorType == 'F') {
                System.out.print("Informe o total gasto com saúde: R$");
                double healthExpenses = sc.nextDouble();

                NaturalPerson contributor = new NaturalPerson(name, annualIncome, healthExpenses);
                contributors.add(contributor);
            } else if (contributorType == 'J') {
                System.out.print("Informe o total de funcionários: ");
                int numberOfEmployees = sc.nextInt();

                LegalEntity contributor = new LegalEntity(name, annualIncome, numberOfEmployees);
                contributors.add(contributor);
            }
        }

        double totalTaxes = 0.0;

        for (Contributor contributor : contributors) {
            System.out.print(contributor.toString());
            System.out.printf("Total de impostos pagos pelo contribuinte: %.2f\n\n", contributor.calculateContributionTax());

            totalTaxes += contributor.calculateContributionTax();
        }

        System.out.printf("Total de impostos pagos: R$%.2f", totalTaxes);
    }
}
