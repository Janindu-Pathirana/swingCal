package Cal;

import javax.swing.*;
import java.awt.*;

public class Gui {


    JFrame frame = new JFrame();


    Gui() {
        frame.setSize(300, 400);
        frame.setBackground(Color.DARK_GRAY);

        frame.setTitle("Calculator");

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);


        frame.add(jPanel(0, 0, 300, 70,Color.DARK_GRAY).add(jlabel()));
        frame.add(jPanel(0, 72, 300, 310,Color.gray));

        frame.setVisible(true);

    }


    private JPanel jPanel(int x, int y, int width, int height,Color color) {
        JPanel panel = new JPanel();

        panel.setBackground(color);
        panel.setBounds(x, y, width, height);


        return panel;
    }

    private JLabel jlabel(){
        JLabel jLabel = new JLabel();

        jLabel.setText("0");



        return jLabel;
    }


}
