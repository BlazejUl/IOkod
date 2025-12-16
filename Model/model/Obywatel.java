package Model.model;

public class Obywatel implements IObywatel {

	private String imię;
	private String nazwisko;
	private String krajUrodzenia;
	private String miejsceUrodzenia;
	private int wiek;
	private String miejsceZamieszkania;
	private String płeć;
	private String stanCywilny;
	private String dataUrodzenia;
	private int numerPESEL;

	public Obywatel(String dataUrodzenia, int numerPESEL, int wiek, String płeć, String miejsceZamieszkania, String stanCywilny, String miejsceUrodzenia,String krajUrodzenia, String nazwisko, String imię) {
		this.dataUrodzenia = dataUrodzenia;
		this.numerPESEL = numerPESEL;
		this.wiek = wiek;
		this.płeć = płeć;
		this.miejsceZamieszkania = miejsceZamieszkania;
		this.stanCywilny = stanCywilny;
	}

	@Override
	public String dajDatęUrodzenia() {
		return this.dataUrodzenia;
	}

	@Override
	public int dajNumerPESEL() {
		return this.numerPESEL;
	}

	@Override
	public int dajWiek() { return this.wiek; }

	@Override
	public String dajPłeć() {
		return this.płeć;
	}

	@Override
	public String dajMiejsceZamieszkania() {
		return this.miejsceZamieszkania;
	}

	@Override
	public String dajStanCywilny() {
		return this.stanCywilny;
	}

	@Override
	public String dajImię() {
		return this.imię;
	}

	@Override
	public String dajNazwisko() {
		return this.nazwisko;
	}

	@Override
	public String dajKrajUrodzenia() { return this.krajUrodzenia; }

	@Override
	public String dajMiejsceUrodzenia() { return this.miejsceUrodzenia; }

	public String opisz() {
		// TODO - implement Obywatel.opisz
		throw new UnsupportedOperationException();
	}

	@Override
	public void podajImię(String imię) {this.imię = imię;}

	@Override
	public void podajNazwisko(String nazwisko) { this.nazwisko = nazwisko;}

	@Override
	public void podajDatęUrodzenia(String dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}

	@Override
	public void podajKrajUrodzenia(String krajUrodzenia) {this.krajUrodzenia = krajUrodzenia;}

	@Override
	public void podajMiejsceUrodzenia(String miejsceUrodzenia) {
		this.miejsceUrodzenia = miejsceUrodzenia;
	}

	@Override
	public void podajNumerPESEL(int nowyPESEL) {
		this.numerPESEL = nowyPESEL;
	}

	@Override
	public void podajWiek(int wiek) {
		this.wiek = wiek;
	}

	@Override
	public void podajPłeć(String płeć) {
		this.płeć = płeć;
    }

	@Override
	public void podajMiejsceZamieszkania(String miejsceZamieszkania) {
		this.miejsceZamieszkania = miejsceZamieszkania;
	}

	@Override
	public void podajStanCywilny(String stanCywilny) {
		this.stanCywilny = stanCywilny;
	}


}