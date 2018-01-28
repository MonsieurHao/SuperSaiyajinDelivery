import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.border.BevelBorder;

public class HomeWindow {

	private JFrame frame;
	private JLabel logo_lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeWindow window = new HomeWindow();
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
	public HomeWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Super Saiyajins Delivery");
		frame.getContentPane().setBackground(new Color(255, 140, 0));
		frame.getContentPane().setLayout(null);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					frame.dispose();
					BillingView cart = new BillingView();
					cart.setVisible(true);
				}catch(Exception e){
					
				}
			}
		});
		btnBuy.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBuy.setBackground(new Color(211, 211, 211));
		btnBuy.setBounds(875, 228, 128, 54);
		frame.getContentPane().add(btnBuy);
		
		JLabel lblSuperSaiyajinDelivery = new JLabel("Super Saiyajin Delivery");
		lblSuperSaiyajinDelivery.setFont(new Font("Brush Script MT", Font.BOLD, 48));
		lblSuperSaiyajinDelivery.setBounds(67, 13, 487, 72);
		frame.getContentPane().add(lblSuperSaiyajinDelivery);
		
		JScrollPane itemsPane = new JScrollPane();
		itemsPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		itemsPane.setBounds(67, 327, 970, 268);
		frame.getContentPane().add(itemsPane);
		
		JScrollPane topItemsPane = new JScrollPane();
		topItemsPane.setToolTipText("");
		topItemsPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		topItemsPane.setBounds(126, 135, 699, 147);
		frame.getContentPane().add(topItemsPane);
		
		JLabel lblTopItems = new JLabel("Top Items :");
		lblTopItems.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblTopItems.setBounds(77, 98, 144, 26);
		frame.getContentPane().add(lblTopItems);
		
		/*
		logo_lbl = new JLabel();
		Image logo = new ImageIcon(this.getClass().getResource("/SSD_logo")).getImage();
		logo_lbl.setBounds(1021, 13, 150, 150);
		frame.getContentPane().add(logo_lbl);
		*/
		frame.setBounds(100, 100, 1201, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
