package screenchanging;

import java.awt.Color;
import java.awt.Font;

public class Names2 implements Runnable {
    int counter;
    Thread myThrd = new Thread(this);
    MyFrame frm; 
    String names[] = {"دقز", "عمك", "ياعمر"};

    public Names2(MyFrame frm) {
        this.frm = frm;
    }

    @Override
    public void run() {
        while(true) {
            displayNames();
            try {
                myThrd.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }

    public void displayNames() {
        Font myFont = new Font("Time Roman", Font.BOLD, 5 * counter + 20);

        frm.labelNames2.setFont(myFont);
        frm.labelNames2.setText(names[counter]);
        frm.labelNames2.setForeground(Color.GREEN);

        frm.panelNames2.setBackground(new Color(counter * 10, counter * 70, counter * 120));

        counter++;
        if(counter > 2) {
            counter = 0;
        }
    }
}
