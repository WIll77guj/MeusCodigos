// Pacote 
package gui;
//Importação da api java.awt

import java.awt.Button;

import java.awt.Frame;
import java.awt.GridLayout;

//Classe 
public class UsandoGridLayout {

    //Método main
    public static void main(String[] args) {

        //Instanciando objeto "janela" da classe Frame()  
        Frame janela = new Frame();
        //Definindo o título da janela
        janela.setTitle("Título da janela");
        //Definindo o tipo de Layout
        //Nesse tipo de Layout os componentes são posicionados em grade (linhas x colunas)
        //Temos que passar os parâmetros de linhas e colunas dentro do método construtor GridLayout()
        janela.setLayout(new GridLayout(3, 2));

        //Criação dos Componentes que ficarão dentro da janela
        //Criação dos botões que ficarão na janela posicionados em grade
        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");
        Button bt3 = new Button("bt3");
        Button bt4 = new Button("bt4");
        Button bt5 = new Button("bt5");
        Button bt6 = new Button("bt6");

        //Adicionando os componentes Button à janela 
        //Adicionando os botões na janela
        janela.add(bt1);
        janela.add(bt2);
        janela.add(bt3);
        janela.add(bt4);
        janela.add(bt5);
        janela.add(bt6);
        /*Sempre deixamos a definição do tamanho e se a janela será visível por 
            por último
         */
        // Definindo o tamanho da janela em pixels (largura x altura) 
        janela.setSize(800, 600);
        //Definindo a janela como visível 
        janela.setVisible(true);

    }

}
