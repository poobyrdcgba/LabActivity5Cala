package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    public LeapYearGUI() {
            btnCheckYear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int input = Integer.parseInt(tfYear.getText());
                    if(input % 4 == 0) {
                    JOptionPane.showMessageDialog(panel1, "Leap year");
                    }
                    else {
                        JOptionPane.showMessageDialog(panel1, "Not a leap year");
                    }
                }
            });
        }

    }

}
