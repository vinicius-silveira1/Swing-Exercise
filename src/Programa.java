import javax.swing.*;

public class Programa {
    public static void main(String[] args) throws Exception {
        int n1;
        int n2;
        int div;
        double pot;
        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));

        div = (int)n1 / (int)n2;
        pot = Math.pow(n1, n2);

        msg = msg + "quociente da divisão de " + n1 + " por " + n2 + " = " + div + "\n";
        msg = msg + "potencia de " + n1 + " por " + n2 + " = " + pot + "\n";
        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}
