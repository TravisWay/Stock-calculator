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
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class Window extends Stock {

	private JFrame frmAmrs;
	private JTextField txtSystemoutprintlntest;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private JTextField textField_3;
	private JButton btnNewButton;
	
	String answer;
	double avg;
	double now;
	double shares;
	double cal;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_4;
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
		frmAmrs.setTitle("T$'s Stock Calculator");
		frmAmrs.setBounds(100, 100, 245, 277);
		frmAmrs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAmrs.getContentPane().setLayout(null);
		
		txtSystemoutprintlntest = new JTextField();
		txtSystemoutprintlntest.setText("system.out.println(test);");
		txtSystemoutprintlntest.setBounds(10, 55, 86, -37);
		frmAmrs.getContentPane().add(txtSystemoutprintlntest);
		txtSystemoutprintlntest.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 95, 99, 36);
		frmAmrs.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		btnNewButton = new JButton("Run");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now = Double.parseDouble(textField_3.getText());
				
				avg = Double.parseDouble(textField_1.getText());
				
				shares = Double.parseDouble(textField_2.getText());
				
				cal = (now*shares) - (avg*shares);
				answer = String.format("%.2f",cal);
				textField_4.setText(answer);
				
			}
		});
		btnNewButton.setBounds(71, 142, 89, 23);
		frmAmrs.getContentPane().add(btnNewButton);
		
		JTextArea txtrPriceAsOf = new JTextArea();
		txtrPriceAsOf.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrPriceAsOf.setBackground(SystemColor.control);
		txtrPriceAsOf.setText("Price Now");
		txtrPriceAsOf.setBounds(119, 101, 100, 23);
		frmAmrs.getContentPane().add(txtrPriceAsOf);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 55, 99, 34);
		frmAmrs.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 11, 99, 36);
		frmAmrs.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea txtrSharesOwned = new JTextArea();
		txtrSharesOwned.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrSharesOwned.setBackground(SystemColor.control);
		txtrSharesOwned.setText("Shares Owned");
		txtrSharesOwned.setBounds(119, 55, 100, 22);
		frmAmrs.getContentPane().add(txtrSharesOwned);
		
		JTextArea txtrAvgPrice = new JTextArea();
		txtrAvgPrice.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrAvgPrice.setBackground(SystemColor.control);
		txtrAvgPrice.setText("Avg price");
		txtrAvgPrice.setBounds(119, 17, 100, 23);
		frmAmrs.getContentPane().add(txtrAvgPrice);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 176, 99, 36);
		frmAmrs.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JTextArea txtrProfitloss = new JTextArea();
		txtrProfitloss.setBackground(SystemColor.control);
		txtrProfitloss.setForeground(Color.BLACK);
		txtrProfitloss.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrProfitloss.setText("Profit/Loss");
		txtrProfitloss.setBounds(119, 184, 100, 30);
		frmAmrs.getContentPane().add(txtrProfitloss);
		
		
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
