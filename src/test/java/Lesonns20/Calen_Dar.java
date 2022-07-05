package Lesonns20;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Calen_Dar {
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        data.add(Calendar.HOUR, 3);

        System.out.println(data.getTime());
        System.out.println(data.get(Calendar.MONTH) + 1);
        //()-> {};

        Dress dress1 = new Dress();
        dress1.wear();

        WomenDress dress = () -> {
            System.out.println("Справочная онфа о продукции ");
        };
        dress.wear();

        JFrame frame = new JFrame("окно ");
        JButton button = new JButton("ОК");

        button.addActionListener(new Button_Aktion_listener());
        ActionListener myListener = e -> System.out.println();


        button.addActionListener(myListener);
        frame.add(button);
        frame.setSize(200, 200);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
