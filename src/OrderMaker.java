
public class OrderMaker {

	   private Product dragonball;
	   private Product figurine;
	   
	   public OrderMaker(){
		   dragonball = new Dragonball();
		   figurine = new Figurine();
	   }
	   

	   
	   public void OrderFigurine(){
		   figurine.order();
	   }
	   
	   public void OrderDragonBall(){
		   dragonball.order();
	   }
}
