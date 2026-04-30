package Main.java.Exercicios;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = null;

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e){

        } catch (IOException e){

        }
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(line != null);

        bw.flush();
        bw.close();
    }
}
