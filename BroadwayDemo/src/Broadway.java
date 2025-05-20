import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;



public class Broadway extends Applet implements Runnable 
{
    Thread animation;
    static final int REFRESH_RATE = 100; // in millseconds applet methods:
    static shape[] shapes = new shape[13];
    
    @Override
    public void init()
    {
        System.out.println(">> init <<");
        setBackground(Color.black);

        shapes[0] = new shape(0, 0, 90, 90);
        shapes[0].set_animition(true, 10,shape.UP);
        
        
        shapes[1] = new shape(250, 0, 40, 190);
        shapes[1].set_animition(true, 5,shape.DOWN);
        
        
        shapes[2] = new shape(80, 110, 100, 20);
        shapes[2].set_animition(true, 20,shape.RIGHT);
        
        
        shapes[3] = new shape(80, 200, 220, 90);
        shapes[3].set_animition(true, 100,shape.UP);
        
        shapes[4] = new shape(100, 10, 90, 80);
        shapes[4].set_animition(true, 1,shape.LEFT);
        
        
        shapes[5] = new shape(80, 100, 110, 90);
        shapes[5].set_animition(true, 20,shape.UP);
        
        shapes[6] = new shape(200, 0, 45, 45);
        shapes[6].set_animition(true, 30,shape.DOWN);
        
        shapes[7] = new shape(0, 100, 70, 200);
        shapes[7].set_animition(true, 60,shape.LEFT);
        
        
        shapes[8] = new shape(200, 55, 60, 135);
        shapes[8].set_animition(false, 10,shape.RIGHT); // no animition
        
        shapes[9] = new shape(0, 0, 300, 300);   
        shapes[9].set_animition(true, 10,shape.RIGHT);
        
        shapes[10] = new shape(0, 0, 90, 90);  
        shapes[10].set_animition(true, 10,shape.DOWN);
        
        
        shapes[11] = new shape(250, 0, 40, 190); 
        shapes[11].set_animition(true, 10,shape.UP);
        
        
        shapes[12] = new shape(200, 55, 60, 135);  
        shapes[12].set_animition(true, 10,shape.LEFT);
        
        
    }
    @Override
    public void start() 
    {
        System.out.println(">> start <<");
        animation = new Thread(this);
        if (animation != null) 
        {
            animation.start();
        }
    }

    @Override
    public void paint(Graphics g) 
    {
        System.out.println(">> paint <<");

        g.setColor(Color.yellow);

        g.fillRect(shapes[0].update_x(), shapes[0].update_y(), shapes[0].width, shapes[0].height);

        g.fillRect(shapes[1].update_x(), shapes[1].update_y(), shapes[1].width, shapes[1].height);

        g.fillRect(shapes[2].update_x(), shapes[2].update_y(), shapes[2].width, shapes[2].height);

        g.setColor(Color.blue);
        g.fillRect(shapes[3].update_x(), shapes[3].update_y(), shapes[3].width, shapes[3].height);

        g.fillRect(shapes[4].update_x(), shapes[4].update_y(), shapes[4].width, shapes[4].height);

        g.setColor(Color.lightGray);
        g.fillRect(shapes[5].update_x(), shapes[5].update_y(), shapes[5].width, shapes[5].height);

        g.setColor(Color.red);
        g.fillRect(shapes[6].update_x(), shapes[6].update_y(), shapes[6].width, shapes[6].height);

        g.fillRect(shapes[7].update_x(), shapes[7].update_y(), shapes[7].width, shapes[7].height);

        g.setColor(Color.magenta);
        g.fillRect(shapes[8].update_x(), shapes[8].update_y(), shapes[8].width, shapes[8].height);


    }

    


    @Override
    public void run() 
    {
        while (true)
        {
            repaint();

            try 
            {
                Thread.sleep(REFRESH_RATE);
            } 
            catch (Exception exc) {}
        }
    }
    @Override
    public void stop() 
    {
        System.out.println(">> stop <<");
        if (animation != null)
        {
            animation.stop();
            animation = null;
        }
    }

}