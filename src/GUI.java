import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        JLabel label=new JLabel("User");
        label.setBounds(10,20,80,25);
        panel.add(label);










    }


}


