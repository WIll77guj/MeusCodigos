// Pacote 
package gui;
//Importação da api java.awt

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

//Classe 
public class PrimeiraJanela {

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
        Button btNorte = new Button("Norte");
        //Criação do botão que ficará ao sul da janela
        Button btSul = new Button("Sul");
        //Criação do botão que ficará ao leste da janela
        Button btLeste = new Button("Leste");
        //Criação do botão que ficará ao oeste da janela
        Button btOeste = new Button("Oeste");

        //Características do componente Button
        //Definição de cor do botão do centro
        btCentro.setBackground(Color.red);
        //Definição de cor do botão do sul
        btSul.setBackground(Color.blue);
        //Definição de cor do botão do norte
        btNorte.setBackground(Color.green);
        //Cor de frente da fonte do botão localizado ao centro da janela
        btCentro.setForeground(Color.white);

        //Adicionando os componentes Button à janela 
        //Adicionando um botão ao centro da janela
        janela.add(btCentro, BorderLayout.CENTER);
        //Adicionando um botão ao norte da janela
        janela.add(btNorte, BorderLayout.NORTH);
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
