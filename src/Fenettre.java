import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fenettre extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 907424331166105722L;
	
	private JLabel label = new JLabel("Bonjour");
	
	public Fenettre()
	{
		super("Poney");
		
		this.setSize(400, 200);
		this.setResizable(false);
		
		this.getContentPane().add(label);
	}
}
