package Model.model;

import java.util.ArrayList;

public interface IModel {

	void zarejestrowanieZdarzenia(String zdarzenie);

	IObywatel wyszukanieObywatela(int PESEL);

	boolean wysłanieProśbyOPotwierdzenieDoKierownikaUrzędu(int PESEL, String zmienioneDane);

	void zmianaNumeruPESEL(int PESEL, int nowyNumerPESEL);

	void wyswietlenieDanychOsobowych(int PESEL);

	void zmianaDanychUrodzeniaPłciObywatela(int PESEL, ArrayList Dane);
}