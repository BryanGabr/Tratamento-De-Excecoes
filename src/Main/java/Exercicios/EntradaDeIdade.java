package Main.java.Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        int idade = 0;
        double altura = 0;

        try {
            while (true) {

                System.out.print("Digite seu nome: ");
                nome = scanner.nextLine();

                if (nome.isBlank()) {
                    System.out.println("Erro: nome não pode ser vazio.");
                    continue;
                }

                try {

                    System.out.print("Digite sua idade: ");
                    idade = scanner.nextInt();

                    if (idade <= 0) {
                        System.out.println("Erro: idade inválida.!");
                        scanner.nextLine();
                        continue;
                    }

                    System.out.print("Digite sua altura: ");
                    altura = scanner.nextDouble();

                    if (altura <= 0) {
                        System.out.println("Erro: altura não pode ser menor que zero!");
                        scanner.nextLine();
                        continue;
                    }

                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Erro: digite apenas números.");
                    scanner.nextLine();
                }
            }

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);

        } finally {

            System.out.println("Programa finalizado!");
            scanner.close();
        }
    }
}
