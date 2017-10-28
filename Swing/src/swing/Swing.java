package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;

public class Swing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Integer contador = 0;
	private JButton btnReiniciameYDecime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing frame = new Swing();
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
	public Swing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 192, 203));
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(164, 48, 86, 20);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField);
		textField.setColumns(10);
		textField.setText("0");
		JButton btnClickleameYDecime = new JButton("Clickleame");
		btnClickleameYDecime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador++;
				textField.setText(String.valueOf(contador));
			}
		});
		btnClickleameYDecime.setIcon(null);
		btnClickleameYDecime.setFont(new Font("Stylus BT", Font.PLAIN, 16));
		btnClickleameYDecime.setBounds(87, 121, 257, 35);
		panel.add(btnClickleameYDecime);
		
		btnReiniciameYDecime = new JButton("Reiniciame");
		btnReiniciameYDecime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador = 0;
				textField.setText(String.valueOf(contador));
			}
		});
		btnReiniciameYDecime.setFont(new Font("Stylus BT", Font.PLAIN, 16));
		btnReiniciameYDecime.setBounds(87, 167, 257, 35);
		panel.add(btnReiniciameYDecime);
	}
}
