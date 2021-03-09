package domen;

public class Knjiga extends Artikal {

	public Knjiga() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return String.format("Knjiga: %s : %d : %s : %f", getNaziv(), getSifra(), getOpis(), getKolicina());
	}

	
}
