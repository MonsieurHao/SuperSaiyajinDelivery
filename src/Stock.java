
public class Stock {

	private static Stock instance;
	private static int nb_DragonBalls = 10;
	private static int nb_Figurines = 10;

	
	
	private Stock(){
		
	}
	
	
	public static int getNb_DragonBalls() {
		return nb_DragonBalls;
	}

	public static void setNb_DragonBalls(int nb_DragonBalls) {
		Stock.nb_DragonBalls = nb_DragonBalls;
	}
	
	public static Stock ModifyInstance_db(){
		if(instance == null){
			instance = new Stock();
		}
		Stock.setNb_DragonBalls(nb_DragonBalls - 1);
		return instance;
	}
	
	
	

	public static int getNb_Figurines() {
		return nb_Figurines;
	}

	public static void setNb_Figurines(int nb_Figurines) {
		Stock.nb_Figurines = nb_Figurines;
	}

	public static Stock ModifyInstance_figurines(){
		if(instance == null){
			instance = new Stock();
		}
		Stock.setNb_Figurines(nb_Figurines - 1);
		return instance;
	}
	

	
}
