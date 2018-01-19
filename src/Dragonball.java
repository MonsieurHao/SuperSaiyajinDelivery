
public class Dragonball implements Product {

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("Commande de la DragonBall");
		Stock.ModifyInstance_db();
		System.out.println(Stock.getNb_DragonBalls() + " Drabonballs in the stock !");
	}

}
