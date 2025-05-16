import java.awt.*;
import java.io.File;
import javax.swing.*;

public class TelaInicial extends JFrame {

    public TelaInicial() {
        setTitle("Sistema Support");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal com layout vertical
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));

        // Título centralizado
        JLabel titulo = new JLabel("Sistema Support");
        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 300, 20)); // Espaçamento

        // Botão centralizado
        JButton btnEscolher = new JButton("Escolha o local do arquivo");
        btnEscolher.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnEscolher.setMaximumSize(new Dimension(300, 50)); // Limita largura
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0));
        
        JLabel lblArquivoSelecionado = new JLabel("Nenhum arquivo selecionado");
        lblArquivoSelecionado.setFont(new Font("Arial", Font.PLAIN, 14));
        lblArquivoSelecionado.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblArquivoSelecionado.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        // Botão "Upload" centralizado abaixo
        JButton btnUpload = new JButton("Upload");
        btnUpload.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnUpload.setMaximumSize(new Dimension(150, 30)); // Limita largura
        btnUpload.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0)); // Espaço entre os botões

        // Adiciona os componentes ao painel
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 30)));
        painelPrincipal.add(titulo);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 70)));
        painelPrincipal.add(btnEscolher);
        painelPrincipal.add(lblArquivoSelecionado);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 10)));        
        painelPrincipal.add(btnUpload);
        btnUpload.setEnabled(false);

        // Adiciona o painel à janela
        add(painelPrincipal);
        btnEscolher.addActionListener(e -> {
            JFileChooser seletor = new JFileChooser();
            int resultado = seletor.showOpenDialog(null); // null = janela principal

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado = seletor.getSelectedFile();
            JOptionPane.showMessageDialog(null, "Arquivo selecionado:\n" + arquivoSelecionado.getAbsolutePath());
            lblArquivoSelecionado.setText(arquivoSelecionado.getName());
            btnUpload.setEnabled(true);
            btnUpload.addActionListener(b ->{
                JOptionPane.showMessageDialog(null, "Mnsagem!1");
            });

            
        
    }
});


        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaInicial();
        
    }
}
