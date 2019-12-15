import stanford.karel.*;

/* Programme: Monter un escalier
 * ----------
 * Votre premier exemple de programme Karel. Ce programme 
 * demande a Karel de prendre le beeper devant lui, et de
 * le placer sur la marche de l'escallier.
 * Ceci est un commentaire. Il sera ignoré pendant l'execution
 * du programme
 */
public class MonterEscalier extends Karel {
	
	/*
	 * Lorsque vous démarrez votre programme, cette 
	 * méthode sera executée.
	 */
	public void run() {
		move();
		pickBeeper();
		turnLeft();
		move();
		turnRight();
		move();
		putBeeper();
		move();
	}
	
	/*
	 * Definition d'une nouvelle commande (méthode)
	 * qui permet à Karel de tourner a droite
	 */
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

}
