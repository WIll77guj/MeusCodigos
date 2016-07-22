//Maneira correta e elegante de criar janela na linguagem de programação Java
//Pacote -> organização do arquivo em diretórios
package gui;
//Importação das API's

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//Declaração da Classe Java

public class JanelaBaskara extends Frame implements WindowListener, ActionListener {
    //Método construtor responsãvel pela criação da janela

    //Declaração dos componentes visuais
    private Button btLimpar;
    private Button btCalcular;
    private TextField tfA;
    private TextField tfB;
    private TextField tfC;
    private Label lbA;
    private Label lbB;
    private Label lbC;
    private Label lbX1;
    private Label lbX2;
    private Label lbResultX1;
    private Label lbResultX2;

    public JanelaBaskara() {
        //Atributos contidos no método construtor

        //Para chamar o método construtor da classe "PAI"
        super("Fórmula de Baskara");
        //Definição do tipo de Layout
        this.setLayout(new FlowLayout());
        //Criação dos componentes visuais
        btCalcular = new Button("Calcular");
        btLimpar = new Button("Limpar");
        tfA = new TextField(10);
        tfB = new TextField(10);
        tfC = new TextField(10);
        lbA = new Label("A:");
        lbB = new Label("B:");
        lbC = new Label("C:");
        lbX1 = new Label("X':");
        lbX2 = new Label("X'':");
        lbResultX1 = new Label("0.0");
        lbResultX2 = new Label("0.0");

        //Adição dos componentes à janela
        this.add(lbA);
        this.add(tfA);
        this.add(lbB);
        this.add(tfB);
        this.add(lbC);
        this.add(tfC);
        this.add(btCalcular);
        this.add(lbX1);
        this.add(lbResultX1);
        this.add(lbX2);
        this.add(lbResultX2);
        this.add(btLimpar);

        this.addWindowListener(this);
        btCalcular.addActionListener(this);
        btLimpar.addActionListener(this);

        this.pack();
        this.setVisible(true);

    }

    //Método main -> Responsável por inicializar a aplicação
    //Boa prática é ter o mínimo possível de código
    public static void main(String[] args) {
        //Instância do objeto
        new JanelaBaskara();

    }

    public void windowActvated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btCalcular) {
            calcular();
        } else if (e.getSource() == btLimpar) {
            limpar();
        }
    }

    private void calcular() {
        double a = Double.parseDouble(tfA.getText());
        double b = Double.parseDouble(tfB.getText());
        double c = Double.parseDouble(tfC.getText());

        double delta = Math.pow(b, 2) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta) / 2 * a);
        double x2 = (-b - Math.sqrt(delta) / 2 * a);

        lbResultX1.setText(String.valueOf(x1));
        lbResultX2.setText(String.valueOf(x2));

    }

    private void limpar() {
        tfA.setText(" ");
        tfB.setText(" ");
        tfC.setText(" ");
        lbResultX1.setText("0.0");
        lbResultX2.setText("0.0");

    }

}
