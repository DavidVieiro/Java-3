/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class frame extends JFrame implements ActionListener{
    JPanel panel = new JPanel();
    
    public frame(){
        setTitle("Hola!!!");
        setSize(500,400);
        addWindowListener (new escuchador());
        Container contentpane = getContentPane();
        panel.setLayout(new BorderLayout());
        
        azul = new JButton("Azul");
        azul.addActionListener(this);
        Dimension d = new Dimension();
        d.height = 40;
        d.width = 100;
        azul.setPreferredSize(d);
        
        verde = new JButton("Verde");
        verde.addActionListener(this);
        d.height = 40;
        d.width = 100;
        verde.setPreferredSize(d);
        
        amarillo = new JButton("Amarillo");
        amarillo.addActionListener(this);
        d.height = 40;
        d.width = 100;
        amarillo.setPreferredSize(d);
        
        rosa = new JButton("Rosa");
        rosa.addActionListener(this);
        d.height = 40;
        d.width = 100;
        rosa.setPreferredSize(d);
        
        panel.add(azul,BorderLayout.SOUTH);
        panel.add(verde,BorderLayout.NORTH);
        panel.add(amarillo,BorderLayout.EAST);
        panel.add(rosa,BorderLayout.WEST);
        
        contentpane.add(panel);
        panel.setBackground(Color.red);
        
        
    }
    @Override
    public void actionPerformed (ActionEvent e){
        Object source = e.getSource();
        if (source ==azul)
            panel.setBackground(Color.blue);
        if (source ==verde)
            panel.setBackground(Color.green);
        if (source ==amarillo)
            panel.setBackground(Color.yellow);
        if (source ==rosa)
            panel.setBackground(Color.pink);
            
    }
    private JButton azul,rosa,amarillo,verde;
}

 class escuchador extends WindowAdapter{
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        }
        
public class ejemplo23{
    public static void main (String[] args){
        JFrame frame = new frame();
        frame.show();
    }
} 

