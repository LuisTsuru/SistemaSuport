import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TelaInicial extends JFrame {

    public TelaInicial() {
        setTitle("Sistema Support");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Janela da Tela inicio 
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));


        // Título 
        JLabel titulo = new JLabel("Sistema Support");
        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 300, 20)); // Espaçamento

        // Botão Para escolher Arquivo
        JButton btnEscolher = new JButton("Escolha o local do arquivo");
        btnEscolher.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnEscolher.setMaximumSize(new Dimension(300, 50)); // Limita largura
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0));
        
        //Local para mostrar arquivo que foi selecionado
        JLabel lblArquivoSelecionado = new JLabel("Nenhum arquivo selecionado");
        lblArquivoSelecionado.setFont(new Font("Arial", Font.PLAIN, 14));
        lblArquivoSelecionado.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblArquivoSelecionado.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        // Botão "Upload" 
        JButton btnUpload = new JButton("Upload");
        btnUpload.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnUpload.setMaximumSize(new Dimension(150, 30));
        btnUpload.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 0)); 
        btnUpload.setBorder(new LineBorder(Color.lightGray, 2));

        // Adiciona e organiza os elementos ao painel
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 30)));
        painelPrincipal.add(titulo);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 70)));
        painelPrincipal.add(btnEscolher);
        painelPrincipal.add(lblArquivoSelecionado);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 10)));        
        painelPrincipal.add(btnUpload);
        btnUpload.setEnabled(false); // Desativa o botao upload

        
        add(painelPrincipal);
        btnEscolher.addActionListener(e -> {
            JFileChooser seletor = new JFileChooser(); // Objeto para procurar o arquivo no pc
            FileNameExtensionFilter filtro = new  FileNameExtensionFilter("Apenas arquivos de texto", "txt");
            seletor.setFileFilter(filtro);
            int resultado = seletor.showOpenDialog(null); 
        
        //if para detectar se o arquivo foi escolhido ou nao
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado = seletor.getSelectedFile();
            lblArquivoSelecionado.setText(arquivoSelecionado.getName()); //Muda o texto de "labelArquivoSelecionado" para o nome arquivo selecionado
            btnUpload.setEnabled(true); // Ativa o botao upload
            btnUpload.addActionListener(b ->{
                JOptionPane.showMessageDialog(null, "Arquivo valido");
                //Envia o arquivo .txt para o Leitor tratar os dados
                //Executa o Leitor.java
                Leitor.ler(arquivoSelecionado);
                
            });

            
        
    }
});


        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaInicial();
        
    }
}
