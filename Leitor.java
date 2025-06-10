import java.io.*;
import java.util.*;

public class Leitor {
    public static void ler(File arquivo) {
        //Cria os vetores para armazenar os arquivos
        List<Funcionarios> funcionarios = new ArrayList<>();
        List<Ticket> tickets = new ArrayList<>();

        //Le o arquivo de texto
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            //trata os dados lendo cada elemento de uma linha separado por ";" e atribuindo a uma variavel
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 10) {
                    String nome = partes[0];
                    String area = partes[1];
                    String id = partes[2];
                    String emissor = partes[3];
                    String data = partes[4];
                    String status = partes[5];
                    String titulo = partes[6];
                    String desc = partes[7];
                    String tipo = partes[8];
                    String prioridade = partes[9];



                    int idade = Integer.parseInt(partes[1]);
                    funcionarios.add(new funcionarios(nome, idade));
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Exibe as pessoas lidas
        for (Funcionarios p : funcionarios) {
            System.out.println(p);
        }
    }
}
