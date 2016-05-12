import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenettreBoutons extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7468929487746877232L;
	
	private JPanel panel;
	private JButton b1, b2, b3;
	
	public FenettreBoutons()
	{
		super("Les boutons");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Trois boutons"));
		panel.setBackground(Color.GREEN);
		panel.setToolTipText("Je suis le panneau qui contient les 3 boutons");
		
		b1 = new JButton("Premier bouton");
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		panel.add(b1);
		
		b2 = new JButton("Bouton milieu");
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.GRAY);
		b2.setToolTipText("Je suis la bouton 2");
		panel.add(b2);
		
		b3 = new JButton("Bouton 3");
		b3.setBackground(Color.RED);
		b3.setForeground(Color.BLACK);
		b3.setToolTipText("Je suis le bouton 3");
		panel.add(b3);
		
		add(panel);
		this.pack();
	}
	
	
}