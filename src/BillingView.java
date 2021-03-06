import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class BillingView extends JFrame implements ActionListener {
	
	JList<String> l1;
	String ret;

	DefaultListModel<String> listModel;
	
	Facade facade = new Facade();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillingView frame = new BillingView(ret);
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
	public BillingView(String ret) {

		
		listModel = new DefaultListModel<String>();
		
		listModel.addElement(ret);
		
		
		//creating J List
				l1 = new JList<String>(listModel);
		
		
		setBounds(100, 100, 800, 600);
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
		
		/*JScrollPane scrollPane = new JScrollPane(l1);
		scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setBounds(254, 375, 719, 220);
		contentPane.add(scrollPane);*/
		
		JLabel lblItemName = new JLabel(listModel.firstElement());
		lblItemName.setBounds(302, 153, 338, 72);
		contentPane.add(lblItemName);
		
		
		JLabel lblItemImage = new JLabel("Remaining products : "+ facade.stock_remain(ret));
		lblItemImage.setBounds(29, 153, 180, 180);
		contentPane.add(lblItemImage);
		

		
		JButton btnConfirmPayment = new JButton("Confirm payment");
		btnConfirmPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					facade.order(ret);
					lblItemImage.setText("Remaining products : "+ facade.stock_remain(ret));
					contentPane.repaint();
					contentPane.revalidate();

				}catch(Exception e){
					
				}
			}
		});
		btnConfirmPayment.setActionCommand("Confirm payment");
		btnConfirmPayment.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConfirmPayment.setBounds(471, 257, 169, 76);
		contentPane.add(btnConfirmPayment);
		contentPane.revalidate();
		contentPane.repaint();
		
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
		/*if("Confirm payment".equals(e.getActionCommand()))
		{
		
				facade.order(ret);

					
					contentPane.remove(lblItemImage);
					contentPane.updateUI();
					contentPane.revalidate();
					contentPane.repaint();
			
					
					JLabel lblItemImage = new JLabel(String.valueOf(facade.stock_remain(ret)));
					lblItemImage.setBounds(29, 153, 180, 180);
					contentPane.remove(lblItemImage);
					contentPane.revalidate();
					lblItemImage.repaint();
					contentPane.add(lblItemImage);

			
		}*/
		
	}
	

}












