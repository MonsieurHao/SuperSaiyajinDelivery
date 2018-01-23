import java.util.HashMap;

public class Stock {
	
	public static HashMap<Integer, Integer> stock_hashmap = new HashMap<Integer, Integer>();

	static
	 {
		stock_hashmap.put(1, 10);
		stock_hashmap.put(2, 25);
	 }


	
	
	private Stock(){

	}
	
	
	
	public static void UpdateStock(int ID){

		stock_hashmap.replace(ID, stock_hashmap.get(ID), stock_hashmap.get(ID) - 1);
		System.out.println(stock_hashmap.get(ID));
	}
	
	
	


	

	
}
