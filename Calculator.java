import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField textField = new JTextField();
        JPanel panel = new JPanel(new GridLayout(4, 4));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "=", "C", "+"
        };

        for (String b : buttons) {
            JButton button = new JButton(b);
            panel.add(button);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String cmd = e.getActionCommand();
                    if (cmd.equals("C")) textField.setText("");
                    else if (cmd.equals("=")) {
                        try {
                            textField.setText("" + eval(textField.getText()));
                        } catch (Exception ex) {
                            textField.setText("Error");
                        }
                    } else {
                        textField.setText(textField.getText() + cmd);
                    }
                }
            });
        }

        frame.setLayout(new BorderLayout());
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static int eval(String expression) {
        return (int) new javax.script.ScriptEngineManager().getEngineByName("JavaScript").eval(expression);
    }
}
