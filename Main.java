import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void printMenu(){
        Scanner s= new Scanner(System.in);
        System.out.println("========== M E N U ==========");
        System.out.println("1 - Criar Ticket\n2- Visualizar Caixa de entrada\n3- Atribuir Ticket a time/Individuo\n4 - Visualizar Caixa Individual\n5 - Visualizar Caixa de Time");
        System.out.println("=============================");
        System.out.print("Digite opcao: ");
        int opcao = s.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Bogos");
                break;
            case 2:
                //funcao2
                break;
            case 3:
                //funcao3
                break;
            case 4:
                //funcao4
                break;
            case 5:
                //funcao5
                break;
            default:
                System.out.println("Opcao invalida :( 1231213");

        }

    }

    public static void main(String[] args) {
        printMenu();

    }
}



abstract class Pessoa{
    String nome;
    private String cpf; //Verificar se String e um tipo decente para cpf
}

class Funcionarios extends Pessoa{
    private String cargo;
    private String grupo;
    ArrayList<Ticket> ticket_individual; 
    // Ideia para criar caixa entrada para cada funcionario e seus tickets

    public Funcionarios(String nome, String area) {
        this.nome = nome;
        this.grupo = area;
    }
     @Override
    public String toString() {
        return nome + " (" + grupo + ")";
    }



}

public enum Prioridade {
    ALTA, MEDIA, BAIXA;
}

class Ticket{
    private int id_ticket;
    private String emissor;
    private Date data; //Verificar tipo para data
    private String status;
    private String titulo;
    private String descricao;
    private String tipo_servico;
    private Funcionarios responsavel = null;
    private Prioridade gravidade;

    public Ticket(int id_ticket, String emissor, Date data, String status, String titulo, String descricao, String tipo_servico, Funcionarios responsavel, Prioridade gravidade) {
        this.id_ticket = id_ticket;
        this.emissor = emissor;
        this.data = data;
        this.status = status;
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo_servico = tipo_servico;
        this.responsavel = responsavel;
        this.gravidade = gravidade;
    }
}




class Resposaveis extends Funcionarios{ 
    //Descobrir se devo usar extend ou implement para o responsavel herdar o nome para usar em nome_resp
    String nome_resp = nome;
    Date ttr; //defininir tipo para data (ttr eh o tempo para conclusao limite de ticket)

}

class Cybersecurity extends Resposaveis{
    ArrayList<Funcionarios> respo_cyber;
    ArrayList<Ticket> ticket_cyber;
}

class Infra extends Resposaveis{
    ArrayList<Funcionarios> resp_infra;
    ArrayList<Ticket> ticket_infra;
}

class Financeiro extends Resposaveis{
    ArrayList<Funcionarios> resp_finan;
    ArrayList<Ticket> ticket_finan;
}

class  Marketing extends Resposaveis{
    ArrayList<Funcionarios> resp_mark;
    ArrayList<Ticket> ticket_mark;
}

class Suporte extends Resposaveis {
    ArrayList<Funcionarios> resp_sup;
    ArrayList<Ticket> ticket_sup;
}
