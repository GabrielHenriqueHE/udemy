package exercicio03;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do aluno: ");
        Student student = new Student(sc.next());

        System.out.println("Insira as notas do aluno: (30/30/35)");
        student.setN1(sc.nextDouble());
        student.setN2(sc.nextDouble());
        student.setN3(sc.nextDouble());

        if (student.calcularNota() >= 60) {
            System.out.printf("Aluno: %s\n", student.name);
            System.out.printf("Nota: %.2f\n", student.calcularNota());
            System.out.println("Situação: aprovado\n");
        } else {
            System.out.printf("Aluno: %s\n", student.name);
            System.out.printf("Nota: %.2f\n", student.calcularNota());
            System.out.println("Situação: reprovado\n");
        }

    }

}
