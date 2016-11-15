import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;

public class Window extends Stock {

	private JFrame frmAmrs;
	private JTextField txtSystemoutprintlntest;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private JTextField textField;
	private JButton btnNewButton;
	
	String answer;
	double avg = .8089;
	double now;
	double cal;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmAmrs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAmrs = new JFrame();
		frmAmrs.setTitle("AMRS ");
		frmAmrs.setBounds(100, 100, 243, 98);
		frmAmrs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAmrs.getContentPane().setLayout(null);
		
		txtSystemoutprintlntest = new JTextField();
		txtSystemoutprintlntest.setText("system.out.println(test);");
		txtSystemoutprintlntest.setBounds(10, 55, 86, -37);
		frmAmrs.getContentPane().add(txtSystemoutprintlntest);
		txtSystemoutprintlntest.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 99, 36);
		frmAmrs.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		btnNewButton = new JButton("Run");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now = Double.parseDouble(textField.getText());
				textField.setText("");
				cal = (now*908) - (avg*908);
				answer = String.format("%.2f",cal);
				textField.setText(answer);
				
			}
		});
		btnNewButton.setBounds(119, 18, 89, 23);
		frmAmrs.getContentPane().add(btnNewButton);
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
