package ed.hector;

public class Institut {

	public static void main(String[] args) {
		
		Alumne p = new Alumne();
		
		p.nom = "Hector";
		p.cognoms = "Valls";
		p.cicleFormatiu = "1º DAM";
		p.any = 2021;
		
		System.out.println(p.toString());

	}

}
