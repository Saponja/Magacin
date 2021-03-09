package domen;

import java.util.Date;

public class KucnaHemija extends Artikal {

	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}
	
	@Override
	public String toString() {
		return String.format("Kunca hemija: %s : %d : %s : %f, %tD", getNaziv(), getSifra(), getOpis(), getKolicina(), getRokTrajanja());
	}
	
	
	
}
