package Model.model;

public class Model implements IModel {

	private IDAO dao;
	private spisObywateli Spis;

	public Model(spisObywateli Spis, IDAO dao) {
		// TODO - implement Model.Model
		throw new UnsupportedOperationException();
	}

	public void zarejestrowanieZdarzenia(String zdarzenie) {
		// TODO - implement Model.zarejestrowanieZdarzenia
		throw new UnsupportedOperationException();
	}

	public void wyszukanieObywatela(int PESEL) {
		// TODO - implement Model.wyszukanieObywatela
		throw new UnsupportedOperationException();
	}

	public boolean wysłanieProśbyOPotwierdzenieDoKierownikaUrzędu(int PESEL, String zmienioneDane) {
		// TODO - implement Model.wys�aniePro�byOPotwierdzenieDoKierownikaUrz�du
		throw new UnsupportedOperationException();
	}

	public void zmianaNumeruPESEL(int nowyNumerPESEL) {
		// TODO - implement Model.zmianaNumeruPESEL
		throw new UnsupportedOperationException();
	}

	@Override
	public void wyswietlenieDanychOsobowych(int PESEL) {

	}

}