package Main.java.Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;

        while(true) {
            try {
                System.out.print("Digite sua idade: ");
                idade = scanner.nextInt();

                if (idade <= 0){
                    System.out.println("Erro: idade não pode ser menor que zero!");
                }
                break;

            } catch (InputMismatchException e) {
                System.out.println("Erro: o campo de idade precisa ser numérica!");
                scanner.nextLine();
            }
        }
    }
}
