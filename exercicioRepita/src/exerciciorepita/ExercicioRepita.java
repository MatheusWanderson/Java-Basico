/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author wande
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!!!", "Boas vindas", JOptionPane.WARNING_MESSAGE);
        int n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um numero: <br><em>(O valor zero interrompe)</em> </html>"));
            //JOptionPane.showMessageDialog(null, "Você digitou: (O valor 0 interrompe)");
            s += n;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final: <hr> "
                + "<br>Somatorio vale: " + s + "</html>");
    }

}
