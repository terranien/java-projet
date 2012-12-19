package Classes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;



/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Accueil extends javax.swing.JFrame implements InputMethodListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4634064151056960285L;
	private JButton jButton1;
	private JButton pseu2;
	private JButton pseu;
	private JPanel Pseudo;
	private JTextArea Pesudo;
	private JTextField Accueil;
	private JButton Regles;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Accueil inst = new Accueil(null);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Accueil(JButton Pseudo) {
		super();
		initGUI(Pseudo);
	}
	
	private void initGUI(JButton pseudo2) {
		// TODO Auto-generated method stub
		
	}
	private void initGUI(JPanel pseudo2) {
		try {
			GridBagLayout thisLayout = new GridBagLayout();
			thisLayout.rowWeights = new double[] {0.0, 0.1, 0.1, 0.1};
			thisLayout.rowHeights = new int[] {84, 7, 7, 7};
			thisLayout.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1};
			thisLayout.columnWidths = new int[] {7, 7, 7, 7};
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			setVisible(true);
			{
				Regles = new JButton();
				getContentPane().add(Regles, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				Regles.setText("Regles");
				Regles.addActionListener((ActionListener) this);
				
			}
			{
				Accueil = new JTextField();
				getContentPane().add(Accueil, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
				Accueil.setText("jeu du pendu");
				setVisible(true);
			}
			{
				pseudo2 = new JPanel();
				FlowLayout PseudoLayout = new FlowLayout();
				getContentPane().add(pseudo2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
				{
					pseu = new JButton();
					pseudo2.add(pseu);
					pseu.setText("pseudo");
				}
				{
					pseu2 = new JButton();
					pseudo2.add(pseu2);
					pseu2.setText("pseudo2");
				}
				pseudo2.setLayout(PseudoLayout);
			}
			{
				
			}

			setSize(500, 500);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public JButton getRegles() {
		return Regles;
	}
	
	private void JeuxMouseClicked(JButton jeux2) {
		System.out.println("Jeux.mouseClicked, event="+jeux2);
		
	}
 private void actionPerformed(ActionEvent evt){
	 if (evt.getActionCommand().equals("Regles")){
		 System.out.println("Lobjectif du jeu est de découvrir un mot en devinant les lettres qui le composent.");
			System.out.println("Chaque joueur disposera du même mot à découvrir le plus rapidement possible.");
			System.out.println("Si le joueur découvre une lettre qui correspond au mot, celle-ci sera affichée et placée au bon endroit dans le mot.");
			System.out.println("Si la lettre est fausse, un croquis représentant un corps humain pendu sera peu à peu formé. Dès que le corps entier est formé, le joueur perd.");
			
	 }
	 		
 }

@Override
public void caretPositionChanged(InputMethodEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void inputMethodTextChanged(InputMethodEvent arg0) {
	// TODO Auto-generated method stub
	
}

public JPanel getPseudo() {
	return Pseudo;
}

}
