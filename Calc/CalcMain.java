import javax.swing.*;
import java.awt.*;

public class CalcMain {

    private JFrame theFrame;
    protected static JTextField firstText = new JTextField(10);
    protected static JTextField secondText = new JTextField(10);
    protected static JTextField outputText = new JTextField(23);
    private static JButton divideButton = new JButton("=");

    public static void main(String[] args) {
        new CalcMain().buildGUI();
    }

    private void buildGUI() {
        theFrame = new JFrame("Calculator");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        divideButton.addActionListener(new DivideListener());

        outputText.setEditable(false);

        background.add(new Label("Делимое"));
        background.add(firstText);
        background.add(new Label("Делитель"));
        background.add(secondText);
        background.add(divideButton);
        background.add(outputText);

        theFrame.getContentPane().add(background);
        theFrame.setVisible(true);
        theFrame.setBounds(20, 20, 750, 120);
        theFrame.pack();
    }
}
