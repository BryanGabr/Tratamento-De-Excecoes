package Main.java.Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Digite o numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Digite o denominador: ");
            int denominador = scanner.nextInt();

            System.out.println("Resultado: " + numerador / denominador);

        } catch (ArithmeticException e){
            System.out.println("O campo de denominador não pode ser zero!");
        } catch (InputMismatchException e){
            System.out.println("Os campos de dividendo e denominador precisam ser numéricos!");
        }

        scanner.close();
    }
}
