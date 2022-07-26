/*
 
 */
package clase9.orientación.object;

import javax.swing.JOptionPane;


public class Figuras {

public void cuadrado(){
    int lado,area ;
    lado= Integer.parseInt(JOptionPane.showInputDialog("Digite el lado del cuadrado "));
    area = lado*lado;
    JOptionPane.showMessageDialog(null,"El area del cuadrado es: "+area );
}
    public void triangulo(){
        double base,altura,area;
        
        base= Double.parseDouble(JOptionPane.showInputDialog("Digite la base del triangulo"));
        altura= Double.parseDouble(JOptionPane.showInputDialog("Digite la altura del triangulo"));
       area= (base*altura)/2;
     JOptionPane.showMessageDialog(null,"El base del cuadrado es: "+area );
        
    }
    public void circulo(){
        double radio, pi=3.14, area;
        radio= Double.parseDouble(JOptionPane.showInputDialog("Digite el radio del circulo"));
        
        //= pi * radio*2;
        area= Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null,"El area del cirulo es: "+area );
    }
 
   
}
