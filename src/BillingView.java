import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JButton;

public class BillingView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillingView frame = new BillingView();
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
	public BillingView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1201, 655);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		this.setTitle("Super Saiyajin Delivery");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSuperSaiyajinDelivery = new JLabel("Super Saiyajin Delivery");
		lblSuperSaiyajinDelivery.setFont(new Font("Brush Script MT", Font.PLAIN, 48));
		lblSuperSaiyajinDelivery.setBounds(12, 13, 443, 62);
		contentPane.add(lblSuperSaiyajinDelivery);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setBounds(254, 375, 719, 220);
		contentPane.add(scrollPane);
		
		JLabel lblItemName = new JLabel("Item Name");
		lblItemName.setBounds(302, 153, 338, 72);
		contentPane.add(lblItemName);
		
		JLabel lblItemImage = new JLabel("Item Image");
		lblItemImage.setBounds(29, 153, 180, 180);
		contentPane.add(lblItemImage);
		
		JButton btnConfirmPayment = new JButton("Confirm payment");
		btnConfirmPayment.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConfirmPayment.setBounds(471, 257, 169, 76);
		contentPane.add(btnConfirmPayment);
	}

}
