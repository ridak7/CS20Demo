import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class MetricConversion {

	private JFrame frame;
	private JTextField disT;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 580, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		
		
		JLabel display = new JLabel("");
		display.setBounds(55, 212, 348, 79);
		panel.add(display);
		
		disT = new JTextField();
		disT.setBounds(74, 42, 264, 44);
		panel.add(disT);
		disT.setColumns(10);
		
		JRadioButton inch = new JRadioButton("Inches to cm");
		buttonGroup.add(inch);
		inch.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String userinput = disT.getText();
				double userNum = Double.parseDouble(userinput);
				double answer;
				
				if(inch.isSelected())
				{
					answer = userNum * 2.54;
					display.setText(Double.toString(answer)+"cm");
					
				}
				
			}
		});
		inch.setBounds(171, 103, 103, 21);
		panel.add(inch);
		
		JRadioButton feet = new JRadioButton("Feet to cm");
		feet.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String userinput = disT.getText();
				double userNum = Double.parseDouble(userinput);
				double answer;
				
				if(feet.isSelected())
				{
					answer = userNum * 30.48;
					display.setText(Double.toString(answer)+"cm");
					
				}
			}
		});
		buttonGroup.add(feet);
		feet.setBounds(171, 126, 103, 21);
		panel.add(feet);
		
		JRadioButton yards = new JRadioButton("Yards to meters");
		buttonGroup.add(yards);
		yards.setBounds(171, 155, 103, 21);
		panel.add(yards);
	}
}
