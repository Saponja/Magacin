package logika;

import domen.Artikal;

public interface IMagacin {
	
	public void dodajArtikal(Artikal artikal);
	public void izbaciArtikal(Artikal artikal);
	public Artikal pronadjiArtikal(int sifra);

}
