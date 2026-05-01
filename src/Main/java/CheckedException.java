package Main.java;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "checklis-estudo-bryan.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que desejar imprimir! " + e.getCause());
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inespirado! " + e.getMessage());
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
