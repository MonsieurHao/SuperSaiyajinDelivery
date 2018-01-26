
public class Order {
	
	//Classh which manipulates the stock
	
	public void UpdateStock(String name){

		Stock.stock_hashmap.replace(name, Stock.stock_hashmap.get(name), Stock.stock_hashmap.get(name) - 1);
		System.out.println(Stock.stock_hashmap.get(name));
	}

}
