package Classes;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
public class Accueil extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4634064151056960285L;
	private JButton jButton1;
	private JButton Jeux;
	private JButton Pseudo;
	private JTextField Accueil;
	private JButton Regles;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Accueil inst = new Accueil();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Accueil() {
		super();
		initGUI();
	}
	
	private void initGUI() {
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
				getContentPane().add(getRegles(), new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
				Regles.setText("Regles");
				Regles.addActionListener((ActionListener) this);
				
			}
			{
				Jeux = new JButton();
				getContentPane().add(Jeux, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				Jeux.setText("jeux");
				setVisible(true);
				Jeux.addContainerListener((ContainerListener) Jeux);
				Jeux.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent evt) {
						JeuxMouseClicked(Jeux);
					}
				});
			}
			{
				Accueil = new JTextField();
				getContentPane().add(Accueil, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
				Accueil.setText("jeu du pendu");
			}
			{
				Pseudo = new JButton();
				getContentPane().add(Pseudo, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				Pseudo.setText("pseudo");
				//((Joueur) Pseudo).InputMethodListener();
				Pseudo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent y) {
						System.out.println("Pseudo.actionPerformed, event="+y);
						 String pseudo2 = null;
						Joueur.setPseudo(pseudo2);					}
				});
			    //Joueur.setPseudo(Pseudo);
				String pseudo= new String();
				pseudo= JOptionPane.showInputDialog("entrer le pseudo du joueur");
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


}
