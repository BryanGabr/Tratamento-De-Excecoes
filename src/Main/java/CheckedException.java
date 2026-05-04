package Main.java;

import javax.swing.*;
import java.io.*;

public class CheckedException  {
    public static void main(String[] args) throws IOException {
        String nomeDoArquivo = "checklist-estudo-bryan.txt";

        imprimirArquivoNoConsole(nomeDoArquivo);
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        try {
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
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que desejar imprimir! " + e.getCause());
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inespirado! " + e.getMessage());
        }

    }
}
