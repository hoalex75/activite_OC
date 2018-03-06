public class Bois{
	private int longueur_cm;
	private int nombre_bout;

	public Bois(int nombre,int longueur){
		longueur_cm=longueur;
		nombre_bout=nombre;
	}

	public int getLongueur(){
		return longueur_cm;
	}

	public int getNombre(){
		return nombre_bout;
	}
}
