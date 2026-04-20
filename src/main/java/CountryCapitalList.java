import javax.swing.*;
import java.awt.event.*;
public class CountryCapitalList extends JFrame {
	String[] countries = {
	        "USA", "India", "Vietnam", "Canada", "Denmark",
	        "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
	    };

	    public CountryCapitalList() {
	        setTitle("Country List");
	        setSize(300, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JList<String> list = new JList<>(countries);
	        JScrollPane scroll = new JScrollPane(list);

	        list.addListSelectionListener(e -> {
	            if (!e.getValueIsAdjusting()) {
	                String country = list.getSelectedValue();
	                System.out.println("Selected: " + country);

	                switch (country) {
	                    case "USA": System.out.println("Capital: Washington DC"); break;
	                    case "India": System.out.println("Capital: New Delhi"); break;
	                    case "Vietnam": System.out.println("Capital: Hanoi"); break;
	                    case "Canada": System.out.println("Capital: Ottawa"); break;
	                    case "Denmark": System.out.println("Capital: Copenhagen"); break;
	                    case "France": System.out.println("Capital: Paris"); break;
	                    case "Great Britain": System.out.println("Capital: London"); break;
	                    case "Japan": System.out.println("Capital: Tokyo"); break;
	                    case "Africa": System.out.println("Capital: (continent)"); break;
	                    case "Greenland": System.out.println("Capital: Nuuk"); break;
	                    case "Singapore": System.out.println("Capital: Singapore"); break;
	                }
	            }
	        });

	        add(scroll);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            new CountryCapitalList().setVisible(true);
	        });
	    }
}
