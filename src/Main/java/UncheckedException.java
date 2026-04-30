package Main.java;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        while (true) {
            try {

                String a = JOptionPane.showInputDialog("Numerador: ");
                String b = JOptionPane.showInputDialog("Denominador: ");

                int resultado = divisor(Integer.parseInt(a), Integer.parseInt(b));

                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, impossível dividir um número por zero! " + e.getMessage());
            }
        }
    }

    public static int divisor(int a, int b) {
        return a / b;
    }
}
