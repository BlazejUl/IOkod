package Model.model;

import java.util.ArrayList;

public class Model implements IModel {

	private IDAO dao;
	private spisObywateli Spis;

	public Model(spisObywateli Spis, IDAO dao) {
		this.Spis = Spis;
		this.dao = dao;
	}

	public void zarejestrowanieZdarzenia(String zdarzenie) {
		// TODO - implement Model.zarejestrowanieZdarzenia
		throw new UnsupportedOperationException();
	}

	public IObywatel wyszukanieObywatela(int PESEL) {
		return Spis.dajObywatela(PESEL);
	}

	public boolean wysłanieProśbyOPotwierdzenieDoKierownikaUrzędu(int PESEL, String zmienioneDane) {
		// TODO - implement Model.wys�aniePro�byOPotwierdzenieDoKierownikaUrz�du
		throw new UnsupportedOperationException();
	}

	public void zmianaNumeruPESEL(int PESEL, int nowyNumerPESEL) {
		Spis.zmieńPESEL(PESEL, nowyNumerPESEL);
	}

	@Override
	public void wyswietlenieDanychOsobowych(int PESEL) {

	}

	@Override
	public void zmianaDanychUrodzeniaPłciObywatela(int PESEL, ArrayList Dane) {
		Spis.zmianaDanychUrodzeniaPłciObywatela(PESEL,Dane);
	}



}