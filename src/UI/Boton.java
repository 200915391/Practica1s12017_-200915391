/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */  
//
package UI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author R0GV3
 */
public class Boton extends JButton implements ActionListener{
    
    public Boton (int posx, int posy, int ancho, int alto){
        setBounds(posx, posy, ancho, alto);
        //super.setBounds(posx, posy, WIDTH, HEIGHT);
        addActionListener(this);
    
    }

    public void CambiarNombre(int x, int y ){
        setText((x+1)+"-"+y+1);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        setBackground(Color.PINK);
        
        
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    }
    
    
    
}
