package Main.java;

public class ExceptionCustomizada_2 {
    public static void main(String[] args) {

        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {

                if (denominador[i] == 0)
                    throw new DivisaoPorZeroException(numerador[i], denominador[i]);

                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata! ", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];

                System.out.println(resultado);

            } catch (DivisaoPorZeroException | DivisaoNaoExataException | ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Programa continua...");
    }
}

class DivisaoPorZeroException extends ArithmeticException {
    private int numerador;
    private int denominador;

    public DivisaoPorZeroException(int numerador, int denominador) {
        super("Impossível dividir " + numerador + " por zero!");
        this.numerador = numerador;
        this.denominador = denominador;
    }
}

