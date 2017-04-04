
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class GLDemo2 extends JFrame {

    public GLDemo2() {
        JPanel contenido = (JPanel) getContentPane();

        JButton[] b = new JButton[13];
        for (int i = 0; i < b.length; i++) {
            b[i] = new JButton(i + " ");
        }

        JPanel norte = new JPanel(new GridLayout(1, 4));
        JPanel sur = new JPanel(new GridLayout(1, 4));
        JPanel este = new JPanel(new GridLayout(2, 1));
        JPanel oeste = new JPanel(new GridLayout(2, 1));

        for (int i = 0; i < 4; i++) {
            norte.add(b[i]);
        }
        for (int i = 4; i < 6; i++) {
            oeste.add(b[i]);
        }
        for (int i = 7; i < 9; i++) {
            este.add(b[i]);
        }
        for (int i = 9; i < 13; i++) {
            sur.add(b[i]);
        }

        contenido.add(norte, "North");
        contenido.add(oeste, "West");
        contenido.add(b[6], "Center");
        contenido.add(este, "East");
        contenido.add(sur, "South");
        pack();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        GLDemo2 v = new GLDemo2();

        v.setVisible(true);
    }
}
