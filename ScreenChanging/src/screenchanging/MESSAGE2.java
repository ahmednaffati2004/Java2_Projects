
    package screenchanging;

import java.awt.Color;
import java.awt.Font;

public class MESSAGE2 implements Runnable {
    private int counter;
    private MyFrame framm;
    private String messages[] = {"We", "Are", "Programmers"};

    MESSAGE2(MyFrame fr) {
        this.framm = fr;
    }

    @Override
    public void run() {
        while(true)
        {
            displayMessages();
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }

    public void displayMessages() {
        Font font = new Font("Time Roman", Font.BOLD, 5 * counter + 20);

        framm.labelMessages2.setFont(font);
        framm.labelMessages2.setText(messages[counter]);
        framm.labelMessages2.setForeground(Color.ORANGE);

        framm.panelMessages2.setBackground(new Color(counter * 100, counter * 100, counter * 80));

        counter++;

        if(counter > 2) {
            counter = 0;
        }
    }
}
