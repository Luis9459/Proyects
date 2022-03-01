/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author luisf
 */
public class PanelFondo extends JPanel {
    
    Color colorfondo=Color.gray;
    int tamax,tam,can, res;
    
    
    public PanelFondo(int tamax,int can){
        this.tamax=tamax;
        this.can=can;
        this.tam=tamax/can;
        this.res=tamax%can;
    }
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);
        pintor.setColor(colorfondo);
        for (int i = 0; i < can; i++) {
            for (int j = 0; j < can; j++) {
                pintor.fillRect(res/2+i*tam,res/2+j*tam, tam-1, tam-1);
            }
        }
    }
}
