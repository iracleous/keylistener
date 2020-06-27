package my.key.recog;

import javax.swing.*;

public class MainFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Keypress recogniser");

        KeyPanel keyPanel = new KeyPanel();
        frame.addKeyListener(keyPanel);
        frame.add(keyPanel);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}
