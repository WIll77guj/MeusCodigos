// Pacote 
package gui;
//Importação da api java.awt

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.Frame;

//Classe 
public class UsandoFlowLayout {

    //Método main
    public static void main(String[] args) {

        //Instanciando objeto "janela" da classe Frame()  
        Frame janela = new Frame();
        //Definindo o título da janela
        janela.setTitle("Título da janela");
        //Definindo o tipo de Layout
        /*FlowLayout -> Nesse tipo de Layout os componentes são posicionados um 
                ao lado do outro
         */
        janela.setLayout(new FlowLayout());

        /*Criação dos Componentes que ficarão dentro da janela
          posicionados uma ao lado do outro  
         */
        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");
        Button bt3 = new Button("bt3");
        Button bt4 = new Button("bt4");
        Button bt5 = new Button("bt5");

        //Adicionando os componentes Button à janela 
        janela.add(bt1);
        janela.add(bt2);
        janela.add(bt3);
        janela.add(bt4);
        janela.add(bt5);

        /*Sempre deixamos a definição do tamanho e se a janela será visível 
            por último
         */
        // Definindo o tamanho da janela em pixels (largura x altura) 
        janela.setSize(800, 600);
        //Definindo a janela como visível 
        janela.setVisible(true);

    }

}
/*Obs: Se quiser alterar o nome de todas as variáveis de 
uma vez só apertamos CTRL + R
 */
