package model;

import java.util.ArrayList;

public class Model implements IModel {

	private IDAO dao;
	private SpisObywateli spis;

	public Model(SpisObywateli spis, IDAO dao) {
		this.spis = spis;
		this.dao = dao;
	}

	public void zarejestrowanieZdarzenia(String zdarzenie) {
		// TODO - implement Model.zarejestrowanieZdarzenia
		throw new UnsupportedOperationException();
	}

	public IObywatel wyszukanieObywatela(int PESEL) {
		return spis.dajObywatela(PESEL);
	}

	public boolean wysłanieProśbyOPotwierdzenieDoKierownikaUrzędu(int PESEL, String zmienioneDane) {
		// TODO - implement Model.wys�aniePro�byOPotwierdzenieDoKierownikaUrz�du
		throw new UnsupportedOperationException();
	}

	public void zmianaNumeruPESEL(int PESEL, int nowyNumerPESEL) {
		spis.zmieńPESEL(PESEL, nowyNumerPESEL);
	}

	@Override
	public void wyswietlenieDanychOsobowych(int PESEL) {

	}

	@Override
	public void zmianaDanychUrodzeniaPłciObywatela(int PESEL, ArrayList Dane) {
		spis.zmianaDanychUrodzeniaPłciObywatela(PESEL,Dane);
	}

	@Override
	public void zmianaStanuCywilnegoObywatela(int PESEL, String nowyStan){
		spis.zmianaStanuCywilnegoObywatela(PESEL, nowyStan);
	}

	@Override
	public void zmianaDanychOsobowychObywatela(int PESEL, ArrayList Dane){
		spis.zmianaDanychOsobowychObywatela(PESEL, Dane);
	}


}