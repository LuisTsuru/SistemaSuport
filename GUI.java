import javax.swing.*;
import java.awt.*;

public class EditorTXT extends JFrame {
    public EditorTXT() {
        // Configurações básicas da janela
        setTitle("Editor de Arquivos TXT");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Componentes
        JTextArea textArea = new JTextArea();
        JButton btnLer = new JButton("Ler Arquivo");
        JButton btnSalvar = new JButton("Salvar Arquivo");

        // Painel de botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.add(btnLer);
        painelBotoes.add(btnSalvar);

        // Layout
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

        // Exibe a janela
        setVisible(true);
    }

    public static void main(String[] args) {
        new EditorTXT();
    }
}
