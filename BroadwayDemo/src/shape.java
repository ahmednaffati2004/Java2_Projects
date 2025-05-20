

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zakaria
 */
public class shape {
    
    static final int UP = 0;
    static final int DOWN = 1;
    static final int RIGHT = 2;
    static final int LEFT = 3;
    
    int x;
    int base_x;
    int y;
    int base_y;
    int width;
    int height;
    int state = UP;
    int max = 0;
    boolean animation = false;

    
    shape(int x , int y , int width , int height){
        
        this.x = x;     
        this.y = y;
        this.width = width;
        this.height = height;
        this.base_x = x;
        this.base_y = y;
    }
    
    int update_x(){
        
        if(animation == false){
            return base_x;
        }
        switch (state)
        {
            case 0:
                x += 2;
                if (x >= base_x + max)
                {
                    state = 1;
                }
                break;
            case 1:
                x -= 2;
                if (x <= base_x + (-max))
                {
                    state = 2;
                }
                break;
        }
        return x;
    }
    int update_y(){
        
        if(animation == false){
            return base_y;
        }
        
        switch (state)
        {
            case 2:
                y += 2;
                if (y >= base_y + max)
                {
                    state = 3;
                }
                break;
            case 3:
                y -= 2;
                if (y <= base_y + (-max))
                {
                    state = 0;
                }
                break;
        }
        return y;
    }
    
    void set_animition(boolean animation ,int max,int state){
        
        this.state = state;
        
        this.max = max;     
        this.animation = animation;
    }
    
}
