package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main(String[] args) {

        SimpleCalcGUI gwapojapon = new SimpleCalcGUI();
        gwapojapon.setTitle("Simple Calculator");
        gwapojapon.setContentPane(gwapojapon.CalcuPanel);
        gwapojapon.setSize(1280, 720);
        gwapojapon.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gwapojapon.setVisible(true);
        gwapojapon.lblResult.setEditable(false);

    }
}
