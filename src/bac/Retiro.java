package bac;

import bac.Ficohsa;
import javax.swing.JOptionPane;

public class Retiro extends Ficohsa {

    public int ret(int Sactual) {
        int retiro;

        try {
            retiro = Integer.parseInt(JOptionPane.showInputDialog("Favor escriba la cantidad que desea retirar"));
            if (retiro <= 0) {
                JOptionPane.showMessageDialog(null, "Favor ingrese un número positivo", "Negativo", JOptionPane.INFORMATION_MESSAGE);
            } else if (retiro > Sactual) {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Sactual -= retiro;
                JOptionPane.showMessageDialog(null, "Su saldo actual es de: " + Sactual);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return Sactual;
    }
}
