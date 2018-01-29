
public class Facade {
	
		Order order = new Order();
	
		public void order(String ret){
			
			order.UpdateStock(ret);
			
			
		}
		
		
		public int stock_remain(String name) {
			return order.stock_value(name);
		}
}
