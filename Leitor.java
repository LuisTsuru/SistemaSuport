import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Leitor {
    public static void ler(File arquivo) {
        //Cria os vetores para armazenar os arquivos
        List<Funcionarios> funcionario_list = new ArrayList<>();
        List<Ticket> tickets_list = new ArrayList<>();
        //para conseguir armazenar no tipo data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Le o arquivo de texto
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            //trata os dados lendo cada elemento de uma linha separado por ";" e atribuindo a uma variavel
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 10) {
                    String nome = partes[0];
                    String area = partes[1];
                    Funcionarios responsavel = new Funcionarios(nome, area);
                    funcionario_list.add(responsavel);
                    String idstr = partes[2];
                    String emissor = partes[3];
                    String dataStr = partes[4];
                    String status = partes[5];
                    String titulo = partes[6];
                    String desc = partes[7];
                    String tipo = partes[8];
                    String prioridadestr = partes[9];
                    int id = Integer.parseInt(idstr);

                    Date data = null;
                    // Convertendo dados
                    try { // tenta transforma string em Date
                        Date data = sdf.parse(dataStr);
                    } catch (ParseException e) {
                        System.out.println("Data em formato inválido: " + dataStr);
                        e.printStackTrace(); // ou trate de outra forma
                    } 

                    Prioridade prioridade = Prioridade.valueOf(prioridadestr.toUpperCase());
                    Ticket tick = new Ticket(id, emissor, data, status, titulo, desc, tipo, responsavel, prioridade);

                    funcionario_list.add(responsavel);

                
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Exibe as pessoas lidas
        for (Funcionarios p : funcionario_list) {
            System.out.println(p);
        }
    }
}
