package sem5hw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PhonebookApp {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        print(numbers);
        task(numbers);
    }

    public static void task(ArrayList<String> numbers) {
        JFrame frame = new JFrame("PhoneBook");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel, numbers);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel, ArrayList<String> numbers) {
        panel.setLayout(null);

        JButton addButton = new JButton("Add Number to Speed Dial");
        addButton.setBounds(10, 20, 200, 25);
        panel.add(addButton);

        JButton callButton = new JButton("Speed Dial A Number");
        callButton.setBounds(10, 50, 200, 25);
        panel.add(callButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(10, 80, 200, 25);
        panel.add(exitButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = JOptionPane.showInputDialog("Enter the Number:");
                numbers.add(number);
                JOptionPane.showMessageDialog(null, "Number added to speed dial!");
            }
        });

        callButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] options = numbers.toArray(new String[0]);
                String choice = (String) JOptionPane.showInputDialog(null, "Pick A Speed Dial Number:", "Dial Number",
                        JOptionPane.QUESTION_MESSAGE, null, options, 0);
                JOptionPane.showMessageDialog(null, "Dialing " + choice);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Goodbye!");
                System.exit(0);
            }
        });
    }

    private static void print(ArrayList<String> numbers) {
        System.out.println("PhoneBook");
    }
}
