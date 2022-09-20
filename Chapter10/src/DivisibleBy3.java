import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField ui;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 410, 297);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 352, 215);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ui = new JTextField();
		ui.setBounds(88, 21, 120, 37);
		panel.add(ui);
		ui.setColumns(10);
		
		JLabel di = new JLabel("");
		di.setBounds(32, 136, 273, 37);
		panel.add(di);
		
		JButton mb = new JButton("Submit");
		mb.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String input = ui.getText();
				int input2 = Integer.parseInt(input);
				
				di.setText(Integer.toString(input2* 3));
				
				
			}
		});
		mb.setBounds(98, 68, 104, 42);
		panel.add(mb);
		
		
	}
}
