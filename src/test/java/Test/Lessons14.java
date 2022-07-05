package Test;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Lessons14 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("авторизация");
        frame.setLocation(200, 200);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 300, 50);

        JButton button = new JButton("+");
        button.addMouseListener(new Avtarizetion());
        button.setBounds(180, 100, 50, 50);
        panel.add(button);

        JButton button2 = new JButton("-");
        button2.addMouseListener(new Avtarizetion());
        button2.setBounds(130, 100, 50, 50);
        panel.add(button2);

        JButton button3 =new JButton("=");
        button3.addMouseListener(new Avtarizetion());
        button3.setBounds(230, 100, 50, 50);
        panel.add(button3);



        panel.add(textField);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.add(panel);
        frame.setVisible(true);


    }
}
