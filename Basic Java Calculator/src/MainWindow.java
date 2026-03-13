import java.awt.EventQueue;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import net.objecthunter.exp4j.Expression;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;

public class MainWindow {

	private JFrame frmBasicJavaCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmBasicJavaCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBasicJavaCalculator = new JFrame();
		frmBasicJavaCalculator.setResizable(false);
		frmBasicJavaCalculator.setTitle("Basic Java Calculator");
		frmBasicJavaCalculator.setBounds(100, 100, 304, 464);
		frmBasicJavaCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBasicJavaCalculator.getContentPane().setLayout(null);
		
		JLabel expBox = new JLabel("0");
		expBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		expBox.setHorizontalAlignment(SwingConstants.RIGHT);
		expBox.setBounds(38, 28, 209, 55);
		frmBasicJavaCalculator.getContentPane().add(expBox);
		
		JLabel ansBox = new JLabel("");
		ansBox.setHorizontalAlignment(SwingConstants.RIGHT);
		ansBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ansBox.setBounds(38, 94, 209, 22);
		frmBasicJavaCalculator.getContentPane().add(ansBox);
		
		JButton btnBksp = new JButton("⌫");
		btnBksp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (expBox.getText() != "0") {
					expBox.setText(expBox.getText().substring(0, expBox.getText().length() - 1));
				} else {
					expBox.setText("0");
				}
				
				if (expBox.getText().length() < 1) {
					expBox.setText("0");
				}
			}
		});
		btnBksp.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 8));
		btnBksp.setBounds(38, 155, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btnBksp);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expBox.setText("0");
				ansBox.setText("");
			}
		});
		btnC.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnC.setBounds(93, 155, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btnC);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (expBox.getText() != "0") {
					expBox.setText(expBox.getText() + "7");
				} else {
					expBox.setText("7");
				}
			}
		});
		btn7.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btn7.setBounds(38, 191, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (expBox.getText() != "0") {
					expBox.setText(expBox.getText() + "8");
				} else {
					expBox.setText("8");
				}
			}
		});
		btn8.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btn8.setBounds(93, 191, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (expBox.getText() != "0") {
					expBox.setText(expBox.getText() + "9");
				} else {
					expBox.setText("9");
				}
			}
		});
		btn9.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btn9.setBounds(148, 191, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (expBox.getText() != "0") {
					expBox.setText(expBox.getText() + "4");
				} else {
					expBox.setText("4");
				}
			}
		});
		btn4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btn4.setBounds(38, 227, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (expBox.getText() != "0") {
					expBox.setText(expBox.getText() + "5");
				} else {
					expBox.setText("5");
				}
			}
		});
		btn5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btn5.setBounds(93, 227, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (expBox.getText() != "0") {
					expBox.setText(expBox.getText() + "6");
				} else {
					expBox.setText("6");
				}
			}
		});
		btn6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btn6.setBounds(148, 227, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (expBox.getText() != "0") {
					expBox.setText(expBox.getText() + "1");
				} else {
					expBox.setText("1");
				}
			}
		});
		btn1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btn1.setBounds(38, 265, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (expBox.getText() != "0") {
					expBox.setText(expBox.getText() + "2");
				} else {
					expBox.setText("2");
				}
			}
		});
		btn2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btn2.setBounds(93, 265, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (expBox.getText() != "0") {
					expBox.setText(expBox.getText() + "3");
				} else {
					expBox.setText("3");
				}
			}
		});
		btn3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btn3.setBounds(148, 265, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (expBox.getText() != "0") {
					expBox.setText(expBox.getText() + "0");
				} else {
					expBox.setText("0");
				}
			}
		});
		btn0.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btn0.setBounds(38, 299, 100, 25);
		frmBasicJavaCalculator.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expBox.setText(expBox.getText() + ".");
			}
		});
		btnDot.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnDot.setBounds(148, 299, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btnDot);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expBox.setText(expBox.getText() + "/");
			}
		});
		btnDiv.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnDiv.setBounds(203, 191, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btnDiv);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expBox.setText(expBox.getText() + "*");
			}
		});
		btnMult.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnMult.setBounds(203, 227, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btnMult);
		
		JButton btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expBox.setText(expBox.getText() + "-");
			}
		});
		btnMin.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnMin.setBounds(203, 265, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btnMin);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expBox.setText(expBox.getText() + "+");
			}
		});
		btnAdd.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnAdd.setBounds(203, 299, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btnAdd);
		
		JButton btnSqrt = new JButton("√");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (expBox.getText() != "0") {
					expBox.setText(expBox.getText() + "sqrt(");
				} else {
					expBox.setText("sqrt(");
				}
			}
		});
		btnSqrt.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnSqrt.setBounds(148, 155, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btnSqrt);
		
		JButton btnPer = new JButton("%");
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expBox.setText(expBox.getText() + "%");
			}
		});
		btnPer.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnPer.setBounds(203, 156, 45, 25);
		frmBasicJavaCalculator.getContentPane().add(btnPer);
		
		JButton btnLB = new JButton("(");
		btnLB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expBox.setText(expBox.getText() + "(");
			}
		});
		btnLB.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnLB.setBounds(38, 335, 100, 25);
		frmBasicJavaCalculator.getContentPane().add(btnLB);
		
		JButton btnRB = new JButton(")");
		btnRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expBox.setText(expBox.getText() + ")");
			}
		});
		btnRB.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnRB.setBounds(148, 335, 100, 25);
		frmBasicJavaCalculator.getContentPane().add(btnRB);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Expression exp = new ExpressionBuilder(expBox.getText()).build();
				try {
					double result = exp.evaluate();
					ansBox.setText(String.valueOf(result));
				} catch (Exception ex) {
					ansBox.setText("Invalid expression");
				}
			}
		});
		btnEq.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		btnEq.setBounds(38, 371, 209, 25);
		frmBasicJavaCalculator.getContentPane().add(btnEq);
	}
}
