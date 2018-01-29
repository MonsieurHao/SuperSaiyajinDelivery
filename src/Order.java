import javax.swing.JOptionPane;

public class Order {
	
	//Classh which manipulates the stock
	
	public boolean VerifStock(String name){
		Object value = Stock.stock_hashmap.get(name);
		if((int)value >0){
			return true;
		}
		else return false;
	}
	
	public void UpdateStock(String name){

		if(VerifStock(name)==true){
		Stock.stock_hashmap.replace(name, Stock.stock_hashmap.get(name), Stock.stock_hashmap.get(name) - 1);
		System.out.println(Stock.stock_hashmap.get(name));
		}else{
			JOptionPane.showMessageDialog(null, "This product is unavailable,sorry !");
		}
		
	}
	

	

}
