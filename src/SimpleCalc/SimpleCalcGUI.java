package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public static void main(String[] args) {

        SimpleCalcGUI gwapo = new SimpleCalcGUI();
        gwapo.setTitle("Simple Calculator");
        gwapo.setContentPane(gwapo.panel1);
        gwapo.setSize(1200, 700);
        gwapo.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gwapo.setVisible(true);
        gwapo.lblResult.setEditable(false);

    }
}
