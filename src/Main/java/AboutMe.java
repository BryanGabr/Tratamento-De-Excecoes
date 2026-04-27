package Main.java;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu nome: ");
            String nome = scanner.next();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");
            scanner.close();
        } catch (InputMismatchException e){
            System.out.println("O campos de idade e altura precisam ser numéricos");
        }
    }
}
