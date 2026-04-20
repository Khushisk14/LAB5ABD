import javax.swing.*;
import java.awt.*;
public class CMYTabbedPane  extends JFrame {
	 public CMYTabbedPane() {
	        setTitle("CMY Tabbed Pane");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JTabbedPane tabbedPane = new JTabbedPane();

	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);

	        tabbedPane.addTab("CYAN", cyanPanel);
	        tabbedPane.addTab("MAGENTA", magentaPanel);
	        tabbedPane.addTab("YELLOW", yellowPanel);

	        add(tabbedPane);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            new CMYTabbedPane().setVisible(true);
	        });
	    }
}
