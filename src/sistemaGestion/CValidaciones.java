/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaGestion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CValidaciones {
    public static int numerosYletrasMsm(java.awt.event.KeyEvent evt,JTextField cajaTexto){
        int paso=1;
        char c=evt.getKeyChar();
        if(Character.isDigit(evt.getKeyChar()) || Character.isLetter(c) || evt.getKeyChar()==evt.VK_BACK_SPACE){
            paso=1;
        }else {
           evt.consume();
           paso =2;
        }
        if(cajaTexto.getText().length()>=10){
            evt.consume();
            paso=3;
        }  
        return paso;
    }
        
    public static void soloNumerosyLetras(java.awt.event.KeyEvent evt,JTextField cajaTexto){
        char c=evt.getKeyChar();
        if(Character.isDigit(evt.getKeyChar()) ){
           }else if(Character.isLetter(c)){  
           }else {
           evt.consume();
           //JOptionPane.showMessageDialog(null,"Caracter no valido","Login",JOptionPane.INFORMATION_MESSAGE);
        }
        if(cajaTexto.getText().length()>=10){
            evt.consume();
            //JOptionPane.showMessageDialog(null,"Solo se permiten 10 caracteres","calculadora",JOptionPane.INFORMATION_MESSAGE);
        }   
    }
}
