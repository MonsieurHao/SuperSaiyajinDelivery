
public class Facade {
	
		Order order = new Order();
	
		public void order(String ret){
			
			//if(argent et dispo)
			
			//retirer argent du porte monnaie
			
			//Wallet.pay(argent - prix)
			
			//decrement the number of items in the stock corresponding to the selected item
			
			order.UpdateStock(ret);
			
			//sinon ne rien faire
		}
}