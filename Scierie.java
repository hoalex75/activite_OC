public class Scierie{
	public static void main(String[] args){
		Buche buche= new Buche(300,100);
		Bois tas= buche.coupe(33);
		
		System.out.println("Le bois obtenu est de longueur: "+tas.getLongueur()+"cm et possède "+tas.getNombre()+" bouts");
	}

}
