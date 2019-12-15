import stanford.karel.SuperKarel;

/*
 * Ce programme inverse toutes les cellules du monde de Karel.
 * Les cellules qui avaient un beeper n'en auront plus.
 * Les cellules qui n'avaient pas de beepers en auront.
 */
public class Inverser extends SuperKarel {

	public void run() {
		inverserLigne();
		retourVersOuest();
		while (leftIsClear()) {
			turnLeft();
			move();
			turnRight();
			inverserLigne();
			retourVersOuest();
		}
	}

	/**
	 * Cette méthode inverse la ligne courante.
	 * 
	 * Elle suppose que Karel est au debut (a gauche, l'Ouest) 
	 * de la ligne et fait face a l'Est.
	 * 
	 * Après l'exécution de cette methode, Karel sera a la fin 
	 * (a droite, l'est) de la ligne qu'il vient d'inverser.
	 */
	private void inverserLigne() {
		while (frontIsClear()) {
			inveserCellule();
			move();
		}
		inveserCellule();
	}

	/**
	 * Cette méthode inverse une cellule. 
	 * - Si la cellule contient un beeper, Karel le prends.
	 * - Si la cellule ne contient pas de beeper, Karel en place un. 
	 */
	private void inveserCellule() {
		if (beepersPresent()) {
			pickBeeper();
		} else {
			putBeeper();
		}
	}

	/**
	 * Cette méthode fait retourner Karel au debut (gauche, Ouest)
	 * de la ligne courante.
	 * 
	 * Elle suppose que karel est sur la ligne courante et fait face a l'Est.
	 * Elle fait faire Karel un demi tours, avancer jusqu'a rencontrer un mur, 
	 * et faire un autre demi tours pour faire face a l'Est.
	 */
	private void retourVersOuest() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnAround();
	}
}
