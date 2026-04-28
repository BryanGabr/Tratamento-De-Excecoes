package Main.java.Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Digite o dividendo: ");
            int dividendo = scanner.nextInt();

            System.out.print("Digite o divisor: ");
            int divisor = scanner.nextInt();

            System.out.println("Resultado: " + dividendo / divisor);

        } catch (ArithmeticException e){
            System.out.println("O campo de divisor não pode ser zero!");
        } catch (InputMismatchException e){
            System.out.println("Os campos de dividendo e divisor precisam ser numéricos!");
        }

        scanner.close();
    }
}
