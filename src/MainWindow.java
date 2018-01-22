
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
	public MainWindow() {
		this.setTitle("Ma première fenêtre Java");
		this.setSize(1200, 1000);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {

		MainWindow fen = new MainWindow();
	}
}
