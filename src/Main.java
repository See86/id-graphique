import javax.swing.JFrame;

public class Main 
{
	public static void main(String[] args) 
	{
		//Fenettre fenettre = new Fenettre();
		FenettreBoutons fenettre = new FenettreBoutons();
		
		fenettre.setVisible(true);
		fenettre.setLocationRelativeTo(null);
		fenettre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
