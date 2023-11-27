import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestJFrame extends JFrame {
    JPanel panel;
    
    public TestJFrame() {
        super("TicTacToe Game");

        panel = new JPanel();
        setContentPane(panel);

        setLocation(1100, 200);
        setSize(600, 600);
        setVisible(true);
    }
}
