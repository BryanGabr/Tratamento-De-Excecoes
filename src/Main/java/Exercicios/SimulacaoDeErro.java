package Main.java.Exercicios;

public class SimulacaoDeErro {
    public static void main(String[] args) {

        String nome = null;

        try {
            System.out.println(nome.length());
        } catch (NullPointerException e){
            System.out.println("Erro: Variável não foi inicializada.");
        }
    }
}
