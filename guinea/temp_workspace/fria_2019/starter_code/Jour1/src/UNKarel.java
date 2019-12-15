import stanford.karel.*;

public class UNKarel extends SuperKarel {
	
	public void run() {
		while(frontIsClear()) {
			move();
			if(beepersPresent()) {
				buildHouse();
			}
		}
	}

	/*
	 * Cette méthode fait Karel construire une maison centree a la position courante de Karel.
	 * Elle suppose qu'un beeper est present a la position de Karel.
	 * A la fin de la methode, Karel aura pris le beeper, construit une maison centree a sa place. 
	 * Kare sera aussi positionne au coin droit de la maison et faisant face a l'Est 
	 */
	private void buildHouse() {
		pickBeeper();
		turnAround();
		move();
		turnRight();
		placerTroisBeepers();
		turnRight();
		move();
		turnRight();
		placerTroisBeepers();
		turnLeft();
		move();
		turnLeft();
		placerTroisBeepers();
		turnAround();
		moveToWall();
		turnLeft();
	}
	
	/*
	 * Cette méthode fait avancer karel jusqu'au mur
	 */
	private void moveToWall() {
		while(frontIsClear()) {
			move();
		}
	}

	/*
	 * Cette méthode place 1 beeper sur 3 cellules consécutives 
	 * commencant a la position courante de Karel, et alant dans 
	 * la direction que face Karel présentement.
	 */
	private void placerTroisBeepers() {
		for(int i = 0; i < 3; i++) {
			putBeeper();
			move();
		}
	}
	
}
	