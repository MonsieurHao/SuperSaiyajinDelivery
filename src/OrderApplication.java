import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;





@SuppressWarnings({ "rawtypes", "serial" })
public class OrderApplication implements ActionListener{

	JList l1;
	JButton BuyButton, GetMoney;
	String ret;
	DefaultListModel listModel;
	
	
	
	
	OrderApplication(){
		
		JFrame f = new JFrame("DragonBall Delivery");
		f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel P = new JPanel();
		P.setSize(400,800);
		
		JPanel NorthPanel = new JPanel();
		NorthPanel.setSize(400,800);
		
	   	
		listModel = new DefaultListModel();

		
		for (String value : Stock.stock_hashmap.keySet())
		{
		    listModel.addElement(value);
		}
		
		
		//creating J List
		l1 = new JList(listModel);

		//Creating Buttons
		BuyButton = new JButton("BUY");
		BuyButton.addActionListener(this);
		BuyButton.setActionCommand("BuyAction");
		
		GetMoney = new JButton("Charge KI");
		GetMoney.addActionListener(this);
		GetMoney.setActionCommand("KI");

		//adding jlist to a scrollpane
		JScrollPane js = new JScrollPane(l1);
		js.setPreferredSize(new Dimension(300,100));
		
		P.add(js);
		P.add(BuyButton);
		
		
		NorthPanel.add(GetMoney);
		
		
		f.setSize(800,800);
		f.getContentPane().add(NorthPanel,BorderLayout.NORTH);
		f.getContentPane().add(P,BorderLayout.CENTER);
	   	f.setVisible(true);

		}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//order();
		ret = (String) l1.getSelectedValue();
		
		System.out.println(ret);
		
		if("BuyAction".equals(e.getActionCommand()))
		{
		
				Facade.order(ret);
	    
		}
		
	}

	
	
	public static void main(String[] args) 
	{

		OrderApplication vd = new OrderApplication();
	}

	
	
}









