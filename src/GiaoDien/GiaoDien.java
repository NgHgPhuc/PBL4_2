package GiaoDien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class GiaoDien extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField ft2;
	private JTextField txtngi;
	private JTextField txtKhongCch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDien frame = new GiaoDien();
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
	public GiaoDien() {
		setTitle("Short Path Routing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ch\u1ECDn tr\u1EA1m tr\u00EAn m\u1EA1ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(23, 22, 241, 155);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnChon = new JButton("Chọn");
		btnChon.setFont(new Font("Arial", Font.PLAIN, 14));
		btnChon.setBounds(77, 110, 89, 23);
		panel.add(btnChon);
		
		JLabel lblNewLabel = new JLabel("Nguồn");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(33, 33, 49, 23);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Đích");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(145, 33, 49, 23);
		panel.add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setBounds(33, 67, 36, 20);
		panel.add(tf1);
		tf1.setColumns(10);
		
		ft2 = new JTextField();
		ft2.setColumns(10);
		ft2.setBounds(144, 67, 36, 20);
		panel.add(ft2);
		
		JLabel lblNewLabel_2 = new JLabel("Bảng chỉ đường");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setBounds(92, 188, 116, 19);
		contentPane.add(lblNewLabel_2);
		
		txtngi = new JTextField();
		txtngi.setBackground(new Color(224, 255, 255));
		txtngi.setFont(new Font("Arial", Font.PLAIN, 14));
		txtngi.setText("Đường đi");
		txtngi.setForeground(new Color(255, 0, 0));
		txtngi.setBounds(310, 178, 224, 30);
		contentPane.add(txtngi);
		txtngi.setColumns(10);
		
		txtKhongCch = new JTextField();
		txtKhongCch.setForeground(new Color(255, 0, 0));
		txtKhongCch.setBackground(new Color(224, 255, 255));
		txtKhongCch.setText("Khoảng cách");
		txtKhongCch.setFont(new Font("Arial", Font.PLAIN, 14));
		txtKhongCch.setColumns(10);
		txtKhongCch.setBounds(310, 223, 224, 30);
		contentPane.add(txtKhongCch);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0110i\u1EC1u khi\u1EC3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(361, 277, 123, 74);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("Kết thúc");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 27, 89, 23);
		panel_1.add(btnNewButton);
	}
}
