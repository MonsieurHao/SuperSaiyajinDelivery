import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;



@SuppressWarnings({ "rawtypes", "serial" })
public class ViewDetails extends JFrame implements ActionListener{

	JList l1;
	JButton BuyButton;
	int ret;
	DefaultListModel listModel;
	
	
	{
		setTitle("Adding or Removing Items From JList");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		listModel = new DefaultListModel();

		
		for (Integer value : Stock.stock_hashmap.keySet())
		{
		    listModel.addElement(value);
		}
		
		
		//creating J List
		l1 = new JList(listModel);

		//Creating Buttons
		BuyButton = new JButton("BUY");
		BuyButton.addActionListener(this);
		BuyButton.setActionCommand("BuyAction");

		//adding jlist to a scrollpane
		JScrollPane js = new JScrollPane(l1);
		js.setPreferredSize(new Dimension(300,100));
		add(js);

		add(BuyButton);
		setSize(700,500);
		setVisible(true);
		}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("BuyAction".equals(e.getActionCommand()))
		{
		ret = l1.getSelectedIndex();
		//listModel.remove(ret);
		System.out.println(ret + 1);
	    //decrement the number of items in the stock corresponding to the selected item
		Stock.UpdateStock(ret + 1);
		}
		
	}

	public static void main(String[] args) 
	{

		ViewDetails vd = new ViewDetails();
	}

	
	
}









