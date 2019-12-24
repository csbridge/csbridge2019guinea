import acm.program.GraphicsProgram;
import acm.graphics.GRect;
import acm.graphics.GOval;
import acm.graphics.GLabel;
import java.awt.Color;

public class GrandPereDeKarel extends GraphicsProgram {

	/*Largeur de la face*/
	private static final int LARGEUR_FACE = 300;
	
	/*Hauteur de la face*/
	private static final int HAUTEUR_FACE = 350;
	
	/*Diametre d'un oeil*/
	private static final int DIAMETERE_OEIL = 70;
	
	/* Distance verticale entre le haut de la tete 
	 * et les yeux*/
	private static final int OFFSET_Y_OEIL = 40;
	
	/*largeur de la bouche*/
	private static final int LARGEUR_BOUCHE = 150;
	
	/*Hauteur de la bouche*/
	private static final int HAUTEUR_BOUCHE = 30;
	
	/*Distance verticale entre le haut de la tete
	 * et la bouche*/
	private static final int OFFSET_Y_BOUCHE = 200;
	
	/*Position verticale de l'etiquette*/
	private static final int Y_ETIQUETTE = 50;

	public void run() {
		dessinerTete();
		dessinerOeilGauche();
		dessinerOeilDroit();
		dessinerBouche();
		dessinerEtiquette();
	}

	private void dessinerTete() {
		double x = (getWidth() - LARGEUR_FACE) / 2;
		double y = (getHeight() - HAUTEUR_FACE) / 2;
		GRect face = new GRect(x, y, LARGEUR_FACE, HAUTEUR_FACE);
		face.setFilled(true);
		face.setFillColor(Color.ORANGE);
		add(face);
	}
	
	private void dessinerOeilGauche() {
		double espaceEntreYeux = (LARGEUR_FACE - 2 * DIAMETERE_OEIL) / 3;
		double faceX = (getWidth() - LARGEUR_FACE) / 2;
		double faceY = (getHeight() - HAUTEUR_FACE) / 2;
		double x = faceX + espaceEntreYeux;
		double y = faceY + OFFSET_Y_OEIL;
		GOval oeilGauche = new GOval(x, y, DIAMETERE_OEIL, DIAMETERE_OEIL);
		oeilGauche.setFilled(true);
		oeilGauche.setFillColor(Color.RED);
		add(oeilGauche);
	}
	
	private void dessinerOeilDroit() {
		double espaceEntreYeux = (LARGEUR_FACE - 2 * DIAMETERE_OEIL) / 3;
		double faceX = (getWidth() - LARGEUR_FACE) / 2;
		double faceY = (getHeight() - HAUTEUR_FACE) / 2;
		double x = faceX + espaceEntreYeux + DIAMETERE_OEIL + espaceEntreYeux;
		double y = faceY + OFFSET_Y_OEIL;
		GOval rightEye = new GOval(x, y, DIAMETERE_OEIL, DIAMETERE_OEIL);
		rightEye.setFilled(true);
		rightEye.setFillColor(Color.BLUE);
		add(rightEye);
	}
	
	private void dessinerBouche() {
		double faceX = (getWidth() - LARGEUR_FACE) / 2;
		double faceY = (getHeight() - HAUTEUR_FACE) / 2;
		double x = faceX + (LARGEUR_FACE - LARGEUR_BOUCHE) / 2;
		double y = faceY + OFFSET_Y_BOUCHE;
		GRect mouth = new GRect(x, y, LARGEUR_BOUCHE, HAUTEUR_BOUCHE);
		mouth.setFilled(true);
		mouth.setFillColor(Color.BLACK);
		add(mouth);
	}
	
	private void dessinerEtiquette() {
		GLabel etiquette = new GLabel("Grand-père de Karel");
		etiquette.setFont("Courrier-50");
		double x = (getWidth() - etiquette.getWidth()) / 2;
		etiquette.setLocation(x, Y_ETIQUETTE);
		add(etiquette);
	
	}
	
}