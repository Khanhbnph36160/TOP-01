/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hawkshop_top01.images;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

import javax.swing.border.EmptyBorder;

/**
 *
 * @author khuat
 */
public class ActionButton extends JButton{
    
    private boolean mousePress;
    
    public ActionButton(){
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(3, 3, 3, 3));
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mousePress=true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mousePress=false;
            }
            
            
        });
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D grap = (Graphics2D)g.create();
        grap.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int Width = getWidth();
        int Height = getHeight();
        int size  = Math.min(Width, Height);
        int x= (Width-size)/2;
        int y = (Height-size)/2;
        if (mousePress) {
            grap.setColor(new Color(158,158,158));
        }else {
            grap.setColor(new Color(199,199,199));
        }
        grap.fill(new Ellipse2D.Double(x, y, size, size));
        grap.dispose();
        super.paintComponent(g);
    }
    
            
}
