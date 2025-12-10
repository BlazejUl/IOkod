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

	String opisz();

	void podajNumerPESEL(int nowyPESEL);

	void podajPłeć(String płeć);

	void podajDatęUrodzenia(String data);

}