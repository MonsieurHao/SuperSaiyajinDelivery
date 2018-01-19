
public class Figurine implements Product{

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("Commande de la figurine !");
		Stock.ModifyInstance_figurines();
		System.out.println(Stock.getNb_Figurines() + " Figurines in the stock \n");
	}

}
