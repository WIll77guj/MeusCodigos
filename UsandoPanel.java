// Pacote 
package gui;
//Importação da api java.awt

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

//Classe 
public class UsandoPanel {

    //Método main
    public static void main(String[] args) {

        //Instanciando objeto "janela" da classe Frame()  
        Frame janela = new Frame();
        //Definindo o título da janela
        janela.setTitle("Título da janela");

        //Criação dos Componentes que ficarão dentro da janela
        //Criação do botão que ficará ao centro da janela
        Button btCentro = new Button("Centro");
        //Criação do botão que ficará ao norte da janela
        Button btNorte1 = new Button("Norte1");
        //Criação do botão que ficará ao sul da janela
        Button btNorte2 = new Button("Norte2");
        Button btSul = new Button("Sul");
        //Criação do botão que ficará ao leste da janela
        Button btLeste = new Button("Leste");
        //Criação do botão que ficará ao oeste da janela
        Button btOeste = new Button("Oeste");

        //Criação do componente Panel
        Panel pNorte = new Panel();
        //Adição dos botões dentro do componente Panel
        pNorte.add(btNorte1);
        pNorte.add(btNorte2);

        //Adicionando os componentes Button à janela 
        //Adicionando um botão ao centro da janela
        janela.add(btCentro, BorderLayout.CENTER);
        //Adicionando um painel ao norte da janela
        janela.add(pNorte, BorderLayout.NORTH);
        //Adicionando um botão ao sul janela 

        janela.add(btSul, BorderLayout.SOUTH);
        //Adicionando um botão ao leste da janela 
        janela.add(btLeste, BorderLayout.EAST);
        //Adicionando um botão ao oeste da janela 
        janela.add(btOeste, BorderLayout.WEST);

        /*Sempre deixamos a definição do tamanho e se a janela será visível por 
            por último
         */
        // Definindo o tamanho da janela em pixels (largura x altura) 
        janela.setSize(800, 600);
        //Definindo a janela como visível 
        janela.setVisible(true);

    }

}

//Obs: Por padrão o tipo de Layout do componente Panel é FlowLayout
