package Lessons11;

import javax.swing.*;
import java.awt.*;

public class Test1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Первая окошка !!");
        frame.setSize(500, 300);
        frame.setLocation(100, 200);


        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        JButton jButton = new JButton("КНОПКА");
        jButton.setSize(120, 50);

        frame.add(jButton, BorderLayout.NORTH);
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.X_AXIS));
        jPanel2.add(new Button("Buton 2"));
        jPanel2.add(new Button("Buton 3"));
        jPanel2.add(new Button("Buton 4"));

        frame.add(jPanel2, BorderLayout.SOUTH);
        frame.add(jPanel);
        frame.setVisible(true);

    }
}
