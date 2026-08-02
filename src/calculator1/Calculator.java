package calculator1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	double fnum;
	double snum;
	String operation;
	double answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_test frame = new Calculator_test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator_test() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Downloads\\Capture.JPG"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(10, 11, 335, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_7_1_2 = new JButton("sin");
		btnNewButton_7_1_2.setBackground(new Color(204, 255, 255));
		btnNewButton_7_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double fsinv =  Double.parseDouble(textField.getText());
				double sinv = Math.sin(fsinv) ;
				textField.setText(Double.toString(sinv));
			}
		});
		btnNewButton_7_1_2.setBounds(10, 79, 59, 38);
		contentPane.add(btnNewButton_7_1_2);
		
		JButton btnNewButton_7_1_2_2 = new JButton("1/x");
		btnNewButton_7_1_2_2.setBackground(new Color(204, 255, 255));
		btnNewButton_7_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double fvaroon = Double.parseDouble(textField.getText());
				double varoon = 1 / fvaroon ;
				textField.setText(Double.toString(varoon));
			}
		});
		btnNewButton_7_1_2_2.setBounds(10, 128, 59, 38);
		contentPane.add(btnNewButton_7_1_2_2);
		
		JButton btnNewButton_7_1_2_3 = new JButton("7");
		btnNewButton_7_1_2_3.setBackground(new Color(153, 204, 204));
		btnNewButton_7_1_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = textField.getText();
				textField.setText(g + "7");
			}
		});
		btnNewButton_7_1_2_3.setBounds(10, 177, 59, 38);
		contentPane.add(btnNewButton_7_1_2_3);
		
		JButton btnNewButton_7_1_2_4 = new JButton("4");
		btnNewButton_7_1_2_4.setBackground(new Color(153, 204, 204));
		btnNewButton_7_1_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = textField.getText();
				textField.setText(g + "4");
			}
		});
		btnNewButton_7_1_2_4.setBounds(10, 226, 59, 38);
		contentPane.add(btnNewButton_7_1_2_4);
		
		JButton btnNewButton_7_1_2_5 = new JButton("1");
		btnNewButton_7_1_2_5.setBackground(new Color(153, 204, 204));
		btnNewButton_7_1_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = textField.getText();
				textField.setText(g + "1");
			}
		});
		btnNewButton_7_1_2_5.setBounds(10, 275, 59, 38);
		contentPane.add(btnNewButton_7_1_2_5);
		
		JButton btnNewButton_7_1_2_6 = new JButton("(-)");
		btnNewButton_7_1_2_6.setBackground(new Color(204, 204, 204));
		btnNewButton_7_1_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double fqar= Double.parseDouble(textField.getText());
				double qar = fqar * (-1) ;
				textField.setText(Double.toString(qar));
			}
		});
		btnNewButton_7_1_2_6.setBounds(10, 325, 59, 38);
		contentPane.add(btnNewButton_7_1_2_6);
		
		JButton btnNewButton_7_1_2_7 = new JButton("0");
		btnNewButton_7_1_2_7.setBackground(new Color(153, 204, 204));
		btnNewButton_7_1_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = textField.getText();
				textField.setText(g + "0");
			}
		});
		btnNewButton_7_1_2_7.setBounds(79, 325, 59, 38);
		contentPane.add(btnNewButton_7_1_2_7);
		
		JButton btnNewButton_7_1_2_8 = new JButton("2");
		btnNewButton_7_1_2_8.setBackground(new Color(153, 204, 204));
		btnNewButton_7_1_2_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = textField.getText();
				textField.setText(g + "2");
			}
		});
		btnNewButton_7_1_2_8.setBounds(79, 275, 59, 38);
		contentPane.add(btnNewButton_7_1_2_8);
		
		JButton btnNewButton_7_1_2_9 = new JButton("5");
		btnNewButton_7_1_2_9.setBackground(new Color(153, 204, 204));
		btnNewButton_7_1_2_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = textField.getText();
				textField.setText(g + "5");
			}
		});
		btnNewButton_7_1_2_9.setBounds(79, 226, 59, 38);
		contentPane.add(btnNewButton_7_1_2_9);
		
		JButton btnNewButton_7_1_2_10 = new JButton("8");
		btnNewButton_7_1_2_10.setBackground(new Color(153, 204, 204));
		btnNewButton_7_1_2_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = textField.getText();
				textField.setText(g + "8");
			}
		});
		btnNewButton_7_1_2_10.setBounds(79, 177, 59, 38);
		contentPane.add(btnNewButton_7_1_2_10);
		
		JButton btnNewButton_7_1_2_11 = new JButton("log");
		btnNewButton_7_1_2_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double flogv = Double.parseDouble(textField.getText());
				double logv = Math.log(flogv) ;
				textField.setText(Double.toString(logv));
			}
		});
		btnNewButton_7_1_2_11.setBackground(new Color(204, 255, 255));
		btnNewButton_7_1_2_11.setBounds(79, 128, 59, 38);
		contentPane.add(btnNewButton_7_1_2_11);
		
		JButton btnNewButton_7_1_2_12 = new JButton("cos");
		btnNewButton_7_1_2_12.setBackground(new Color(204, 255, 255));
		btnNewButton_7_1_2_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double fcosv = Double.parseDouble(textField.getText());
				double cosv = Math.cos(fcosv) ;
				textField.setText(Double.toString(cosv));
			}
		});
		btnNewButton_7_1_2_12.setBounds(79, 79, 59, 38);
		contentPane.add(btnNewButton_7_1_2_12);
		
		JButton btnNewButton_7_1_2_13 = new JButton(".");
		btnNewButton_7_1_2_13.setBackground(new Color(204, 204, 204));
		btnNewButton_7_1_2_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = textField.getText();
				textField.setText(g + ".");
			}
		});
		btnNewButton_7_1_2_13.setBounds(148, 325, 59, 38);
		contentPane.add(btnNewButton_7_1_2_13);
		
		JButton btnNewButton_7_1_2_14 = new JButton("3");
		btnNewButton_7_1_2_14.setBackground(new Color(153, 204, 204));
		btnNewButton_7_1_2_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = textField.getText();
				textField.setText(g + "3");
			}
		});
		btnNewButton_7_1_2_14.setBounds(148, 275, 59, 38);
		contentPane.add(btnNewButton_7_1_2_14);
		
		JButton btnNewButton_7_1_2_15 = new JButton("6");
		btnNewButton_7_1_2_15.setBackground(new Color(153, 204, 204));
		btnNewButton_7_1_2_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = textField.getText();
				textField.setText(g + "6");
			}
		});
		btnNewButton_7_1_2_15.setBounds(148, 226, 59, 38);
		contentPane.add(btnNewButton_7_1_2_15);
		
		JButton btnNewButton_7_1_2_16 = new JButton("9");
		btnNewButton_7_1_2_16.setBackground(new Color(153, 204, 204));
		btnNewButton_7_1_2_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = textField.getText();
				textField.setText(g + "9");
			}
		});
		btnNewButton_7_1_2_16.setBounds(148, 177, 59, 38);
		contentPane.add(btnNewButton_7_1_2_16);
		
		JButton btnNewButton_7_1_2_17 = new JButton("exp");
		btnNewButton_7_1_2_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double fexpv = Double.parseDouble(textField.getText());
				double expv = Math.exp(fexpv) ;
				textField.setText(Double.toString(expv));
			}
		});
		btnNewButton_7_1_2_17.setBackground(new Color(204, 255, 255));
		btnNewButton_7_1_2_17.setBounds(148, 128, 59, 38);
		contentPane.add(btnNewButton_7_1_2_17);
		
		JButton btnNewButton_7_1_2_18 = new JButton("tan");
		btnNewButton_7_1_2_18.setBackground(new Color(204, 255, 255));
		btnNewButton_7_1_2_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ftanv = Double.parseDouble(textField.getText());
				double tanv = Math.tan(ftanv) ;
				textField.setText(Double.toString(tanv));
			}
		});
		btnNewButton_7_1_2_18.setBounds(148, 79, 59, 38);
		contentPane.add(btnNewButton_7_1_2_18);
		
		JButton btnNewButton_7_1_2_19 = new JButton("π");
		btnNewButton_7_1_2_19.setBackground(new Color(204, 204, 204));
		btnNewButton_7_1_2_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = textField.getText();
				textField.setText(g + Math.PI);
			}
		});
		btnNewButton_7_1_2_19.setBounds(217, 325, 59, 38);
		contentPane.add(btnNewButton_7_1_2_19);
		
		JButton btnNewButton_7_1_2_20 = new JButton("+");
		btnNewButton_7_1_2_20.setBackground(new Color(204, 204, 204));
		btnNewButton_7_1_2_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(textField.getText());
				operation = "+";
				textField.setText(null);
			}
		});
		btnNewButton_7_1_2_20.setBounds(217, 275, 59, 38);
		contentPane.add(btnNewButton_7_1_2_20);
		
		JButton btnNewButton_7_1_2_21 = new JButton("×");
		btnNewButton_7_1_2_21.setBackground(new Color(204, 204, 204));
		btnNewButton_7_1_2_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(textField.getText());
				operation = "×";
				textField.setText(null);
			}
		});
		btnNewButton_7_1_2_21.setBounds(217, 226, 59, 38);
		contentPane.add(btnNewButton_7_1_2_21);
		
		JButton btnNewButton_7_1_2_22 = new JButton("x²");
		btnNewButton_7_1_2_22.setBackground(new Color(204, 255, 255));
		btnNewButton_7_1_2_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double fpower = Double.parseDouble(textField.getText());
				double power = fpower * fpower ;
				textField.setText(Double.toString(power));
			}
		});
		btnNewButton_7_1_2_22.setBounds(217, 177, 59, 38);
		contentPane.add(btnNewButton_7_1_2_22);
		
		JButton btnNewButton_7_1_2_23 = new JButton("x^y");
		btnNewButton_7_1_2_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(textField.getText());
				operation = "x^y";
				textField.setText(null);
			}
		});
		btnNewButton_7_1_2_23.setBackground(new Color(204, 255, 255));
		btnNewButton_7_1_2_23.setBounds(217, 128, 59, 38);
		contentPane.add(btnNewButton_7_1_2_23);
		
		JButton btnNewButton_7_1_2_24 = new JButton("←");
		btnNewButton_7_1_2_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7_1_2_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1 = null;
				int length =  textField.getText().length();
				if(length > 0) {
					StringBuilder str2 = new StringBuilder(textField.getText());
					str2.deleteCharAt(length-1);
					str1 = str2.toString();
					textField.setText(str1);
				}
			}
		});
		btnNewButton_7_1_2_24.setBounds(217, 79, 59, 38);
		contentPane.add(btnNewButton_7_1_2_24);
		
		JButton btnNewButton_7_1_2_25 = new JButton("=");
		btnNewButton_7_1_2_25.setBackground(new Color(204, 204, 204));
		btnNewButton_7_1_2_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				snum = Double.parseDouble(textField.getText());
				if(operation.equals("+"))
				{
					answer = fnum + snum;
					textField.setText(Double.toString(answer));
				}
				else if(operation.equals("-"))
				{
					answer = fnum - snum;
					textField.setText(Double.toString(answer));
				}
				else if(operation.equals("×"))
				{
					answer = snum * fnum;
					textField.setText(Double.toString(answer));
				}
				else if(operation.equals("÷"))
				{
					answer = fnum / snum;
					textField.setText(Double.toString(answer));
				}
				else
				{
					answer = Math.pow(fnum, snum) ;
					textField.setText(Double.toString(answer));
				}
			}
		});
		btnNewButton_7_1_2_25.setBounds(286, 325, 59, 38);
		contentPane.add(btnNewButton_7_1_2_25);
		
		JButton btnNewButton_7_1_2_26 = new JButton("-");
		btnNewButton_7_1_2_26.setBackground(new Color(204, 204, 204));
		btnNewButton_7_1_2_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(textField.getText());
				operation = "-";
				textField.setText(null);
			}
		});
		btnNewButton_7_1_2_26.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_7_1_2_26.setBounds(286, 275, 59, 38);
		contentPane.add(btnNewButton_7_1_2_26);
		
		JButton btnNewButton_7_1_2_27 = new JButton("÷");
		btnNewButton_7_1_2_27.setBackground(new Color(204, 204, 204));
		btnNewButton_7_1_2_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(textField.getText());
				operation = "÷";
				textField.setText(null);
			}
		});
		btnNewButton_7_1_2_27.setBounds(286, 226, 59, 38);
		contentPane.add(btnNewButton_7_1_2_27);
		
		JButton btnNewButton_7_1_2_28 = new JButton("√x");
		btnNewButton_7_1_2_28.setBackground(new Color(204, 255, 255));
		btnNewButton_7_1_2_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double frad = Double.parseDouble(textField.getText());
				double rad = Math.sqrt(frad) ;
				textField.setText(Double.toString(rad));
			}
		});
		btnNewButton_7_1_2_28.setBounds(286, 177, 59, 38);
		contentPane.add(btnNewButton_7_1_2_28);
		
		JButton btnNewButton_7_1_2_29 = new JButton("%");
		btnNewButton_7_1_2_29.setBackground(new Color(204, 255, 255));
		btnNewButton_7_1_2_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double fpercent = Double.parseDouble(textField.getText());
				double percent = fpercent / 100 ;
				textField.setText(Double.toString(percent));
			}
		});
		btnNewButton_7_1_2_29.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_7_1_2_29.setBounds(286, 128, 59, 38);
		contentPane.add(btnNewButton_7_1_2_29);
		
		JButton btnNewButton_7_1_2_30 = new JButton("C");
		btnNewButton_7_1_2_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_7_1_2_30.setBounds(286, 79, 59, 38);
		contentPane.add(btnNewButton_7_1_2_30);
	}
}
