package my.key.recog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Calendar;

public class KeyPanel extends JPanel implements KeyListener {
private long timePressed;
private long timeCounterPressed;

    private String message ="";
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
    timePressed = timeCounterRelease- timeCounterPressed;

        message =keyEvent.getKeyChar()+": "+ timePressed;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString(message, 50,100); // display name
    }
}
