import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo
{
    public static void main(String[] args)
    {

        JFrame frame = new JFrame("Button Click Event");

   
        JLabel label = new JLabel("Click the button to display a message.");

        JButton button = new JButton("Click Me");


        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(button);

       
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                label.setText("Hello .... Button Clicked.");

                JOptionPane.showMessageDialog(
                    frame,
                    "Button clicked successfully!"
                );
            }
        });

        // Set window properties
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}