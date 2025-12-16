package Model.model;

public interface IObywatel {

	String dajDatęUrodzenia();

	int dajNumerPESEL();

	int dajWiek();

	String dajPłeć();

	String dajMiejsceZamieszkania();

	String dajStanCywilny();

	String dajImię();

	String dajNazwisko();

	String dajKrajUrodzenia();

	String dajMiejsceUrodzenia();

	String opisz();

	void podajImię(String imię);

	void podajNazwisko(String nazwisko);

	void podajDatęUrodzenia(String data);

	void podajKrajUrodzenia(String kraj);

	void podajMiejsceUrodzenia(String miejsce);

	void podajNumerPESEL(int nowyPESEL);

	void podajWiek(int wiek);

	void podajPłeć(String płeć);

	void podajMiejsceZamieszkania(String miejsce);

	void podajStanCywilny(String stan);

}