package ed.hector;

public class Institut {

	private static final int ANY = 2021;
	private static final String CICLO_FORMATIVO = "1º DAM";
	private static final String COGNOMS_ALUMNE = "Valls";
	private static final String NOM_ALUMNE = "Hector";

	public static void main(String[] args) {
		
		Alumne p = new Alumne();
		
		p.nom = NOM_ALUMNE;
		p.cognoms = COGNOMS_ALUMNE;
		p.cicleFormatiu = CICLO_FORMATIVO;
		p.any = ANY;
		
		System.out.println(p.toString());

	}

}
