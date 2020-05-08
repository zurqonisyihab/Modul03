import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiByText extends JFrame {

    JLabel label = new JLabel( "Cobs Input 1");
    JTextField textField1 = new JTextField();
    JButton button1 = new JButton("Greet");

    GuiByText(){
        setSize(640, 480);
        setLocationRelativeTo(null);
        setTitle("GUI By Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    void meletakkanKomponen(){
        getContentPane().setLayout(null);

        getContentPane().add(label);
        getContentPane().add(textField1);
        getContentPane().add(button1);

        label.setBounds(16,32,100,25);
        textField1.setBounds(124,32,100,25);
        button1.setBounds(232,32,80,25);
    }
    void menambahkanListener(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField1.getText();
                JOptionPane.showMessageDialog(null, "Hai " + nama);
            }
        });
    }
    public static void main(String[] args) {
        GuiByText guiByText = new GuiByText();
        guiByText.meletakkanKomponen();
        guiByText.setVisible(true);

    }
}
