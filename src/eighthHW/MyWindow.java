package eighthHW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public void init() {
        setVisible(true);
        setTitle("Test Window");
        setSize(500, 500);
        setLocation(650, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridLayout layout = new GridLayout(1, 2);
        JPanel panel = new JPanel(layout);

        JButton btn1 = new JButton("Exit");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        panel.add(btn1);

        JButton btn2 = new JButton("Enter");
        panel.add(btn2);

        add(panel, BorderLayout.SOUTH);
    }
}
