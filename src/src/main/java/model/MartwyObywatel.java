package model;

public class MartwyObywatel extends DekoratorObywatela {

	private String dataZgonu;

	public MartwyObywatel(IObywatel obywatel, String dataZgonu) {
		// TODO - implement MartwyObywatel.MartwyObywatel
		throw new UnsupportedOperationException();
	}

	public String dajDatęZgonu() {
		// TODO - implement MartwyObywatel.dajDat�Zgonu
		throw new UnsupportedOperationException();
	}

	@Override
	public String dajKrajUrodzenia() {
		return "";
	}

	@Override
	public String dajMiejsceUrodzenia() {
		return "";
	}

	public String opisz() {
		// TODO - implement MartwyObywatel.opisz
		throw new UnsupportedOperationException();
	}

	@Override
	public void podajImię(String imię) {

	}

	@Override
	public void podajNazwisko(String nazwisko) {

	}

	@Override
	public void podajNumerPESEL(int nowyPESEL) {

	}

	@Override
	public void podajWiek(int wiek) {

	}

	@Override
	public void podajPłeć(String płeć) {

	}

	@Override
	public void podajMiejsceZamieszkania(String miejsce) {

	}

	@Override
	public void podajStanCywilny(String stan) {

	}

	@Override
	public void podajDatęUrodzenia(String data) {

	}

	@Override
	public void podajKrajUrodzenia(String kraj) {

	}

	@Override
	public void podajMiejsceUrodzenia(String miejsce) {

	}

}