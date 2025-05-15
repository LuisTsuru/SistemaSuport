import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        }
}

abstract class Pessoa{
    private String nome;
    private String cpf; //Verificar se String e um tipo decente para cpf
}

class Funcionarios extends Pessoa{
    private String cargo;
    private String grupo;
    ArrayList<Ticket> ticket_individual; // Ideia para criar caixa entrada para cada funcionario e seus tickets

}

class Prioridade {
private int prioridade;
private String tipo_afetado; //Afeta pessoa, servico ou departamento


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

}

class CaixaEntrada{
    ArrayList<Ticket>;
    //Criar funcao para organizar por prioridade (Organizacao);
}

class Resposaveis  Funcionarios{ //Descobrir se devo usar extend ou implement para o responsavel herdar o nome para usar em nome_resp
    String nome_resp = ;
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
