package domen;

public class KancelarijskiMaterijal extends Artikal {

	public KancelarijskiMaterijal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("Kancelarijski materijal: %s : %d : %s : %f", getNaziv(), getSifra(), getOpis(), getKolicina());
	}
	

	
}
