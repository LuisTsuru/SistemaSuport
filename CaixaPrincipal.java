import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class CaixaPrincipal extends JFrame {

    public CaixaPrincipal() {
        setTitle("Sistema Support");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Janela da Tela inicio 
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));


        // Título 
        JLabel titulo = new JLabel("Sistema Support");
        titulo.setFont(new Font("Arial", Font.BOLD, 25));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 30, 20)); // Espaçamento

        //Caixa de entrada txt
        JLabel caixa_titulo = new JLabel("Caixa de entrada");
        caixa_titulo.setFont(new Font("Arial", Font.BOLD, 25));
        caixa_titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        caixa_titulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 100, 20)); // Espaçamento
        
        //Botão atribuir chamada
          JButton btnchamada = new JButton("Atribuir chamado");
        btnchamada.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnchamada.setMaximumSize(new Dimension(150, 30));
        btnchamada.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 0)); 
        btnchamada.setBorder(new LineBorder(Color.lightGray, 2));

        //Botão Excluir chamado
          JButton btnexcluir_chamada = new JButton("Excluir chamado");
        btnexcluir_chamada.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnexcluir_chamada.setMaximumSize(new Dimension(150, 30));
        btnexcluir_chamada.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 0)); 
        btnexcluir_chamada.setBorder(new LineBorder(Color.lightGray, 2));

        //Botão Visualizar chamadas
          JButton btnvizu_chamada = new JButton("Visualizar chamados");
        btnvizu_chamada.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnvizu_chamada.setMaximumSize(new Dimension(150, 30));
        btnvizu_chamada.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 0)); 
        btnvizu_chamada.setBorder(new LineBorder(Color.lightGray, 2));

        // Adiciona e organiza os elementos ao painel
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 10)));
        painelPrincipal.add(titulo);
        painelPrincipal.add(caixa_titulo);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 50)));
        painelPrincipal.add(btnchamada);
        painelPrincipal.add(btnexcluir_chamada);
        painelPrincipal.add(btnvizu_chamada);
            

        
        add(painelPrincipal);


        setVisible(true);
    }

    public static void main(String[] args) {
        new CaixaPrincipal();
        
    }
}
