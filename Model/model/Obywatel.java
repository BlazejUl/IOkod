package Model.model;

public class Obywatel implements IObywatel {

	private String imię;
	private String nazwisko;
	private String dataUrodzenia;
	private String krajUrodzenia;
	private String miejsceUrodzenia;
	private int numerPESEL;
	private int wiek;
	private String płeć;
	private String miejsceZamieszkania;
	private String stanCywilny;

	public Obywatel(String dataUrodzenia, int numerPESEL, int wiek, String płeć, String miejsceZamieszkania, String stanCywilny) {
		// TODO - implement Obywatel.Obywatel
		throw new UnsupportedOperationException();
	}

	public String dajKrajUrodzenia() {
		// TODO - implement Obywatel.dajKrajUrodzenia
		throw new UnsupportedOperationException();
	}

	public String dajMiejsceUrodzenia() {
		// TODO - implement Obywatel.dajMiejsceUrodzenia
		throw new UnsupportedOperationException();
	}

	@Override
	public String dajDatęUrodzenia() {
		return "";
	}

	@Override
	public int dajNumerPESEL() {
		return 0;
	}

	@Override
	public int dajWiek() {
		return 0;
	}

	@Override
	public String dajPłeć() {
		return "";
	}

	@Override
	public String dajMiejsceZamieszkania() {
		return "";
	}

	@Override
	public String dajStanCywilny() {
		return "";
	}

	@Override
	public String dajImię() {
		return "";
	}

	@Override
	public String dajNazwisko() {
		return "";
	}

	public String opisz() {
		// TODO - implement Obywatel.opisz
		throw new UnsupportedOperationException();
	}

}