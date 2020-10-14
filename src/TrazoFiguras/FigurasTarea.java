
package TrazoFiguras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo Guevara
 */
public class FigurasTarea extends JPanel{// ventana
    private JFrame ventana;
    // contenedor
    private Container contenedor;
    

    public FigurasTarea() {
        // inicializar la ventana
        ventana = new JFrame("Muchas Figuras");
        // definir tamaño a ventana
        ventana.setSize(1000, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        contenedor = ventana.getContentPane();
        contenedor.setSize(1000, 600);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //trazar el rectangulo redondeado
        g.drawRoundRect(5, 3, contenedor.getSize().width - 10, contenedor.getSize().height - 5, 15, 15);
        
        //trazar los 6 rectangulos internos
        //1
        g.drawRect(25, 13, 300, 250);
        //2
        g.drawRect(345, 13, 300, 250);
        //3
        g.drawRect(665, 13, 300, 250);
        //4
        g.drawRect(25, 293, 300, 250);
        //5
        g.drawRect(345, 293, 300, 250);
        //6
        g.drawRect(665, 293, 300, 250);
        
        
        //1 Dibujando Lineas
        //Dibujar el rectangulo
        g.setColor(Color.red);
        g.drawRect(65, 103, 200, 90);
        //dibujar triangulo
        g.drawLine(64, 103, 185, 43);
        g.drawLine(185, 43, 265, 103);
        //puerta
        g.drawRect(105, 123, 50, 70);
        //lineas de la puerta
        g.drawLine(105, 193, 65, 233);
        g.drawLine(155, 193, 85, 233);
        //dibujo de cadenas de texto
       g.drawString("Dibujando Lineas", 65, 253);
       
       //2 Dibujando rectángulos
       g.drawRect(365, 113, 30, 80);
       g.drawRect(415, 93, 30, 100);
       g.drawRect(465, 73, 30, 120);
       g.drawRect(515, 53, 30, 140);
       g.drawRect(565, 33, 30, 160);
       g.drawString("Dibujando Rectángulos", 365, 233);
       
       //3 Dibujando Óvalos con Rectángulos
       g.drawRoundRect(710, 73, 200, 65, 180, 180);
       g.drawRoundRect(785, 28, 45, 170, 180, 180);
       g.drawRoundRect(765, 53, 80, 35, 180, 180);
       // Letrero
       g.drawString("Dibujando Óvalos con Rectángulos", 698, 233);
       
       //4 Dibujando circulos
       //Cara
       g.drawOval(75, 333, 180, 180);
       //Ojos
       g.drawOval(125, 373, 30, 30);
       g.drawOval(185, 373, 30, 30);
       //Boca
       g.drawOval(145, 420, 50, 50);
       //Pupilas
       g.fillOval(135, 380, 15, 15);
       g.fillOval(190, 380, 15, 15);
       //Letrero
       g.drawString("Dibujando Círculos", 85, 530);
       
       //5 Dibujando Óvalos con círculos
       g.drawOval(395, 353, 200, 65);
       g.drawOval(470, 303, 45, 170);
       g.drawOval(450, 333, 80, 35);
       //Letrero
       g.drawString("Dibujando Óvalos con círculos", 405, 530);

       //6 Dibujando Triángulos
       g.drawLine(705, 343, 745, 403);
       g.drawLine(745, 403, 705, 403);
       g.drawLine(705, 403, 705, 343);
       
       g.drawLine(835, 333, 905, 363);
       g.drawLine(905, 363, 835, 363);
       g.drawLine(835, 363, 835, 333);
       
       g.drawLine(835, 363, 905, 443);
       g.drawLine(905, 443, 705, 443);
       g.drawLine(705, 443, 835, 363);
       // Letrero
       g.drawString("Dibujando Triángulos", 698, 530);
    }
    
    
    
}
