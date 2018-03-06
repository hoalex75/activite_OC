public class Buche{
	private int longueur_cm;	
	private int diametre_cm;

	public Buche(int longueur,int diametre){
		longueur_cm=longueur;
		diametre_cm=diametre;
	}

	public Bois coupe(int coupe){
		int nombreBout=longueur_cm/coupe;
		Bois b=new Bois(nombreBout,coupe);
		return b;
	}
}
