package my.key.recog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Calendar;

public class KeyPanel extends JPanel implements KeyListener {

    private long timeCounterPressed;
    private String message ="";
    private ArrayList<Long> times = new ArrayList<>();
    private ArrayList<Character> chars = new ArrayList<>();
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

        Calendar calendar = Calendar.getInstance();
        //Returns current time in millis
        timeCounterPressed = calendar.getTimeInMillis();


    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

        Calendar calendar = Calendar.getInstance();
        //Returns current time in millis
        long timeCounterRelease = calendar.getTimeInMillis();
        long timePressed = timeCounterRelease- timeCounterPressed;
        chars.add(keyEvent.getKeyChar());
        times.add(timePressed);
        message =keyEvent.getKeyChar()+": "+ timePressed;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(message, 50,100); // display name
        g.drawString(times.toString(), 50,120); // display name
        g.drawString(chars.toString(), 50,140); // display name
    }
}
