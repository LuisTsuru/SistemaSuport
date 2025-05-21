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
        caixa_titulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 300, 20)); // Espaçamento
        
        //Botão atribuir chamada
          JButton btnchamada = new JButton("Upload");
        btnchamada.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnchamada.setMaximumSize(new Dimension(150, 30));
        btnchamada.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 0)); 
        btnchamada.setBorder(new LineBorder(Color.lightGray, 2));

        // Adiciona e organiza os elementos ao painel
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 10)));
        painelPrincipal.add(titulo);
        painelPrincipal.add(caixa_titulo);
        painelPrincipal.add(btnchamada);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 70)));
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 10)));        

        
        add(painelPrincipal);


        setVisible(true);
    }

    public static void main(String[] args) {
        new CaixaPrincipal();
        
    }
}
