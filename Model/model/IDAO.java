package Model.model;

public interface IDAO {

	void zarejestrowanieZdarzenia(String zdarzenie);

	void znajdźObywatela(int PESEL);

	void edytujObywatela(int PESEL);

	int dodajObywatela(String imię, String nazwisko);

}