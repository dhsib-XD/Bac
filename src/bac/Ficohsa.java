package bac;

import bac.Deposito;
import bac.Retiro;
import javax.swing.JOptionPane;

public class Ficohsa {

    public static void main(String[] args) {
        int opciones;
        int Sactual = 0;
        int No;
        String cliente;
        //a
        cliente = JOptionPane.showInputDialog("Ingrese su nombre completo");
        
        No = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cuenta"));
        while (true) {
            try {
                opciones = Integer.parseInt(JOptionPane.showInputDialog("Favor selecione una opcion\n"
                    + "1. Depositar\n"
                    + "2. Retiro\n"
                    + "3. Salir"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            
            if (opciones == 3) {
                JOptionPane.showMessageDialog(null, "Saliendo.........Hasta la próxima vez");
                break;
            }
            
            switch (opciones) {
                case 1:
                    Deposito d = new Deposito();
                    Sactual = d.depo(Sactual); 
                    break;
                case 2:
                    Retiro r = new Retiro();
                    Sactual = r.ret(Sactual); 
                    break;   
                default:
                    JOptionPane.showMessageDialog(null, "Error.......Opcion no valida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
