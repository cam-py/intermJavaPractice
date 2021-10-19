import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Buttons {
	JButton messageButton = new JButton();
	JButton exitButton = new JButton();
	JButton counterButton = new JButton();
	
	private static class MessageHandler implements ActionListener {
		private JFrame window = null;
		
		//setup frame to be used in JOpionPane
		public MessageHandler(JFrame frame) {
			window = frame;
			
		}
		
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(window, "Hello World");
		}
	}
	
	private static class ExitHandler implements ActionListener{
		
		public void actionPerfomed (ActionEvent e) {
			System.exit(0);
		}
	}
	
	private static class CounterHandler implements ActionListener{
		
		private int clicks = 0;
		private JFrame window = null;
		
		public CounterHandler(JFrame frame) {
			window = frame;
		}
		
		
	}
		
}



	


