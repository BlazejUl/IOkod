package Model.model;

public abstract class DekoratorObywatela implements IObywatel {

	protected IObywatel obywatel;

	public DekoratorObywatela(){}
	public DekoratorObywatela(IObywatel obywatel) {
		// TODO - implement DekoratorObywatela.DekoratorObywatela
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
		return -1;
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
        return null;
    }
}