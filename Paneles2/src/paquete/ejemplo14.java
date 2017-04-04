package paquete;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dam132
 */
class frame extends JFrame {

    public frame() {
        this.setTitle("Hola!!!");
        this.setSize(300, 200);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("salimos");
                System.exit(0);
            }
        });
    }
}

public class ejemplo14 {

    public static void main(String[] args) {
        JFrame frame = new frame();
        frame.show();
    }
} ///:~
