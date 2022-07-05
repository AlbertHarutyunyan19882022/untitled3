package Test;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Avtarizetion extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        JButton button = (JButton) e.getSource();

        if (e.getSource() instanceof  JButton){
            System.out.println(1);
        }
        JButton jButton = (JButton) e.getSource();
        if (button.getText().equals("1")) {

        }else {

        }
    }
}