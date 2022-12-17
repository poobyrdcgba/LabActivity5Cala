package LeapYear;

import javax.swing.*;

public class  LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI gwapo = new LeapYearGUI();
        gwapo.setSize(600,500);
        gwapo.setTitle("Leap Year Checker");
        gwapo.setContentPane(gwapo.panel1);
        gwapo.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gwapo.setVisible(true);

    }

    }
}
