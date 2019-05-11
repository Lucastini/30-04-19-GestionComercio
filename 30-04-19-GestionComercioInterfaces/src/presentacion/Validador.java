
package presentacion;

import java.awt.event.KeyEvent;

public abstract class Validador extends javax.swing.JFrame{
    
    public static void soloNumeros(KeyEvent e){
        char c=e.getKeyChar();
        if(!Character.isDigit(c)){
            e.consume();
            //getToolkit().beep();
        }
    }
    
}
