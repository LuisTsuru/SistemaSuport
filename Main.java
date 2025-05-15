import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        }
}

class Pessoa{
    abstract String nome;
    abstract String cpf; //Verificar se String e um tipo decente para cpf
}
class Funcionarios extends Pessoa{
    String cargo;
    String grupo;
    ArrayList<Ticket> ticket_individual; // Ideia para criar caixa entrada para cada funcionario e seus tickets

}

class Prioridade{
    int gravidade;
    //Ideia: implementar calculo de prioridade e servico afetado
}
class Ticket{
    String status;
    String emissor;
    Date data; //Verificar tipo para data
    int id_ticket; 
    String titulo;
    String descricao;
    Funcionarios responsavel = null;
    Prioridade prioridade;

}
class CaixaEntrada{
    ArrayList<Ticket>;
    //Criar funcao para organizar por prioridade (Organizacao);
}
class Resposaveis{
    String nome_resp;
    Date ttr; //defirinir tipo para data (ttr eh o tempo para conclusao limite de ticket)

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
