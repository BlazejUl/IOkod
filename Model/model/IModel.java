package Model.model;

public interface IModel {

	void zarejestrowanieZdarzenia(String zdarzenie);

	void wyszukanieObywatela(int PESEL);

	boolean wysłanieProśbyOPotwierdzenieDoKierownikaUrzędu(int PESEL, String zmienioneDane);

	void zmianaNumeruPESEL(int nowyNumerPESEL);

	void wyswietlenieDanychOsobowych(int PESEL);

}