/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/


import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
*
* @author Liz Neria
*/
public class Ventanaa extends JFrame{
JPanel panel1;
JPanel panel2;
JPanel panel3;
JLabel e1;
JLabel e2;
JLabel e3;
/*
   public Ventana() throws HeadlessException {
       Dimension d=new Dimension(500, 500);
       this.setSize(d);
   }
   */
public Ventana(String title) throws HeadlessException, InterruptedException {

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setBounds(300, 300, 500, 500);
    this.setLocationRelativeTo(null);
    iniciarPaneles();
    inicaEtiquetas();
}

protected void iniciarPaneles() {
JPanel contenedor=new JPanel();
this.getContentPane().add(contenedor);
contenedor.setBackground(Color.red);
this.panel1=new JPanel();
this.panel2=new JPanel();
this.panel3=new JPanel();
contenedor.add(this.panel1);
contenedor.add(this.panel2);
contenedor.add(this.panel3);
this.panel1.setBackground(new Color(0, 51, 102));
this.panel2.setBackground(new Color(0, 102, 255));
this.panel3.setBackground(new Color(255, 0, 255));
contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.X_AXIS));
//this.panel3.setVisible(false);
}

protected void inicaEtiquetas() {
        e1=new JLabel("<html>Hola Humano soy la etiqueta1</html>");
        e2=new JLabel("<html>Hola Humano soy la etiqueta2</html>");
        e3=new JLabel("<html>Hola Humano soy la etiqueta3</html>");
        e1=new JLabel("<html>Hola1</html>");
        e2=new JLabel("<html>Hola2</html>");
        e3=new JLabel("<html>Hola3</html>");

this.panel1.add(e1);
this.panel2.add(e2);
this.panel3.add(e3);

e1.setForeground(Color.white);
e2.setForeground(Color.white);
e3.setForeground(Color.white);

this.panel1.setLayout(null);
this.panel2.setLayout(null);
this.panel3.setLayout(null);

        e1.setBounds(10, 100, 90, 60);
        e2.setBounds(10, 100, 90, 60);
        e3.setBounds(10, 100, 90, 60);
        e1.setBounds(10, 100, 120, 60);
        e2.setBounds(10, 100, 120, 60);
        e3.setBounds(10, 100, 120, 60);

        e1.setText("<html>Hola humano</html>");
        this.panel2.setVisible(false);
        //e1.setText("<html>Hola humano</html>");
        //this.panel2.setVisible(false);
        e1.setOpaque(true);
        e2.setOpaque(true);
        e3.setOpaque(true);
        
        e1.setBackground(Color.black);
        e2.setBackground(Color.black);
        e3.setBackground(Color.black);
        /*
        HorizontalAlignment
        CENTER  = 0;
        LEFT    = 2;
        RIGHT   = 4;
        
        VerticalAlignment
        TOP     = 1;
        BOTTOM  = 3;
	*/

        e1.setHorizontalAlignment(SwingConstants.LEFT);
        e2.setHorizontalAlignment(SwingConstants.CENTER);
        e3.setHorizontalAlignment(SwingConstants.RIGHT);
        
        e1.setVerticalAlignment(SwingConstants.TOP);
        e2.setVerticalAlignment(SwingConstants.BOTTOM);

}
public void setTextos(String textos[]){
this.e1.setText(textos[0]);
this.e2.setText(textos[1]);
this.e3.setText(textos[2]);
}

}