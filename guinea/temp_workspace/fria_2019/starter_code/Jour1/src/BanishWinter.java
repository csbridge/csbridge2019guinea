import stanford.karel.*;


public class BanishWinter extends SuperKarel {

	public void run() {
		
		// Repeter "pour toujours" parce que nous ne conaissons pas 
		// le nombre d'arbres.
		while(true) {
			allerAuProchainArbre();
			if(grimperArbre()) {
				// Si grimperArbre() retourne true, alors, Karel a 
				// effectivement grimpe un arbre.
				// Mettons des feuilles et descendons l'arbre.
				mettreFeuilles();
				descendreArbre();
			}
			else {
				// Si grimperArbre() retourne false, alors Karel a 
				// rencontre le mur de droite. Sortons alors de la boucle.
				// La tache de Karel est terminee.
				return;
			}
		}
	}
	
	
	
	/*
	 * Cette methode permet a Karel d'aller au prochain arbre ou mur 
	 * en faisant Karel avancer jusqu'au prochain obstacle.
	 * */
	private void allerAuProchainArbre() {
		while(frontIsClear()) {
			move();
		}
	}
	
	
	/*
	 * Cette methode permet a Karel de grimper un arbre.
	 * Elle suppose que Karel fait face a l'Arbre, et a l'Est.
	 * Cette methode commence par faire tourner Karel a droite,
	 * et puis faire Karel avancer tant que sa droite est bloquee 
	 * par le tronc de l'arbre.
	 * 
	 * Cette methode retourne true si Karel a en fait pu grimper un arbre,
	 * et false si Karel a grimpe le mur de droite.
	 * */
	private boolean grimperArbre() {
		turnLeft();
		while(rightIsBlocked()) {
			if(frontIsClear()) {
				move();
			}else {
				return false;
			}
		}
		
		return true;
	}
	
	
	/*
	 * Cette methode permet a Karel de descendre d'un arbre.
	 * Elle suppose que:
	 * - Karel fait face au Sud
	 * - L'arbre est a gauche de Karel
	 * 
	 * Cette methode fait Karel descendre jusqua'au sol, 
	 * et puis fait Karel tourner a gauche pour faire face a l'est.
	 * */
	private void descendreArbre() {
		while(frontIsClear()) {
			move();
		}
		turnLeft();
	}
	

	/*
	 * Cette methode permet a Karel de mettre des feuilles sur un arbre
	 * que Karel a deja grimpe.
	 * Elle suppose que Karel:
	 * 	- Fait face au nord
	 *  - Est a gauche de l'arbre
	 *  - A depasse de sommet de l'arbre d'une cellule.
	 * */
	private void mettreFeuilles() {
		putBeeper();
		move();
		putBeeper();
		turnRight();
		move();
		putBeeper();
		turnRight();
		move();
		putBeeper();
	}

}
