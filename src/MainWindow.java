	
import javax.swing.JButton;
import javax.swing.JFrame; 


public class MainWindow extends JFrame{
	public MainWindow(){
	    this.setTitle("Ma premi�re fen�tre Java");
	    this.setSize(400, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);

	  }
	public void main(String[] args){
		
		MainWindow fen = new MainWindow();
	}
}
	

