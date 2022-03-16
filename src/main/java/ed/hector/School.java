package ed.hector;

public class School {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.nom = "Hector";
		p.cognoms = "Valls";
		p.cicleFormatiu = "1º DAM";
		p.any = 2021;
		
		System.out.println(p.toString());

	}

}
