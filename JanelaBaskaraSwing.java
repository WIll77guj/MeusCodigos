//Maneira correta e elegante de criar janela na linguagem de programação Java
//Pacote -> organização do arquivo em diretórios
package gui;
//Importação das API's

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//Declaração da Classe Java

public class JanelaBaskaraSwing extends JFrame implements ActionListener {
    //Método construtor responsãvel pela criação da janela

    //Declaração dos componentes visuais
    //Botões
    private JButton btLimpar;
    private JButton btCalcular;
    //Caixas de texto
    private JTextField tfA;
    private JTextField tfB;
    private JTextField tfC;
    //Rótulos
    private JLabel lbResultX1;
    private JLabel lbResultX2;
    //Container
    private Container container;
    //Barra de menu
    private JMenuBar barraMenu;
    //Menu principal
    private JMenu mnArquivo;
    private JMenu mnAjuda;
    //Sub menus
    private JMenuItem miNovo;
    private JMenuItem miSair;
    private JMenuItem miSobre;

    public JanelaBaskaraSwing() {
        //Atributos contidos no método construtor

        //Para chamar o método construtor da classe "PAI"
        super("Fórmula de Baskara");
        //Responsável pela recuperação do Container
        container = this.getContentPane();
        /*Definição do tipo de Layout -> Nesse caso os 
        componentes são exibidos um após o outro
         */
        container.setLayout(new FlowLayout());
        //Criação dos componentes visuais
        //Criação dos botões
        btLimpar = new JButton("Limpar");
        btCalcular = new JButton("Calcular");
        //Criação das caixas de texto
        tfA = new JTextField(10);
        tfB = new JTextField(10);
        tfC = new JTextField(10);
        //Criação dos rótulos
        lbResultX1 = new JLabel("0.0");
        lbResultX2 = new JLabel("0.0");
        //Criação dos menus e sub - menus
        barraMenu = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnAjuda = new JMenu("Ajuda");
        miNovo = new JMenuItem("Novo");
        miSair = new JMenuItem("Sair");
        miSobre = new JMenuItem("Sobre...");
        //Adição dos menus à tela
        barraMenu.add(mnArquivo);
        barraMenu.add(mnAjuda);
        //Adição dos submenus à tela
        mnArquivo.add(miNovo);
        mnArquivo.add(miSair);
        mnAjuda.add(miSobre);

        //Adição do menu à janela
        this.setJMenuBar(barraMenu);
        //Adição dos componentes à janela
        container.add(new JLabel("A:"));
        container.add(tfA);
        container.add(new JLabel("B:"));
        container.add(tfB);
        container.add(new JLabel("C:"));
        container.add(tfC);
        container.add(btCalcular);
        container.add(new JLabel("X':"));
        container.add(lbResultX1);
        container.add(new JLabel("X'':"));
        container.add(lbResultX2);
        container.add(btLimpar);
        //Responsável pela definição de cor de fundo da janela
        container.setBackground(Color.LIGHT_GRAY);
        /*Responsável pela definição de 
        ao clicar no "X" ou apertar 
        o atalho ALT + F4 fechar a aplicação.
         */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*Aqui indicamos que os dois botões na tela
            gerarão eventos
         */
        btCalcular.addActionListener(this);
        btLimpar.addActionListener(this);
        miNovo.addActionListener(this);
        miSair.addActionListener(this);
        miSobre.addActionListener(this);
        //Definição de redimensionamento de janela automático
        this.pack();
        //Apresentação da tela para o usuário.
        this.setVisible(true);

    }

    //Método main -> Responsável por inicializar a aplicação
    //Boa prática é ter o mínimo possível de código
    public static void main(String[] args) {
        //Instância do objeto
        new JanelaBaskaraSwing();

    }

    //Evento que trata o clique do botão
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btCalcular) {
            calcular();
        } else if (e.getSource() == btLimpar
                || e.getSource() == miNovo) {

            limpar();
        } else if (e.getSource() == miSair) {
            System.exit(0);

        } else if (e.getSource() == miSobre) {
            JOptionPane.showMessageDialog(
                    this, "Programa desenvolvido por Will");

        }
    }

    //Método criado especificamente para executar o cálculo de Báskara
    private void calcular() {

        if (isCamposConsistentes()) {
            //entrada
            double a = Double.parseDouble(tfA.getText());
            double b = Double.parseDouble(tfB.getText());
            double c = Double.parseDouble(tfC.getText());
            //processamento
            double delta = Math.pow(b, 2) - 4 * a * c;

            double x1 = (-b + Math.sqrt(delta) / 2 * a);
            double x2 = (-b - Math.sqrt(delta) / 2 * a);
            //saída
            lbResultX1.setText(String.valueOf(x1));
            lbResultX2.setText(String.valueOf(x2));
        } else {

            JOptionPane.showMessageDialog(this, "Campos inconsistentes.");
        }

    }

    //Método criado para limpar os campos TextField
    private void limpar() {
        tfA.setText(" ");
        tfB.setText(" ");
        tfC.setText(" ");
        lbResultX1.setText("0.0");
        lbResultX2.setText("0.0");

    }

    private boolean isCamposConsistentes() {
        String a = tfA.getText().trim();
        String b = tfB.getText().trim();
        String c = tfC.getText().trim();

        if (a.equals("")) {
            tfA.requestFocus();
            return false;

        } else if (b.equals("")) {
            tfB.requestFocus();
            return false;

        } else if (c.equals("")) {
            tfC.requestFocus();
            return false;

        }

        try {
            Double.parseDouble(a);
        } catch (Exception e) {
            tfA.requestFocus();
            return false;

        }

        try {
            Double.parseDouble(b);
        } catch (Exception e) {
            tfB.requestFocus();
            return false;

        }

        try {
            Double.parseDouble(c);
        } catch (Exception e) {
            tfC.requestFocus();
            return false;

        }
        
        return true;

    }

}
