package kontroler;

import model.IModel;

public class WydanieNrPESEL {

	private int staryPESEL;
	private int nowyPESEL;
	private IModel model;

	public WydanieNrPESEL(IModel model,int PESEL) {
		System.out.println("WydanieNrPESEL");
		this.model = model;
		this.staryPESEL = PESEL;
		nowyPESEL = podanieNowegoNumeruPESEL();
		if(zatwierdzenieNowegoNumeruPESEL()){
			model.zmianaNumeruPESEL(staryPESEL,nowyPESEL);
			wydanieNrPESEL();
		}
	}

	private int podanieNowegoNumeruPESEL() {
		System.out.println("podanieNowegoNumeruPESEL");
		return 155;
	}

	private boolean zatwierdzenieNowegoNumeruPESEL() {
		System.out.println("zatwierdzenieNowegoNumeruPESEL");
		return true;
	}

	private int wprowadzenieNumeruPESEL() {
		return 123;
	}

	private void wydanieNrPESEL() {
		System.out.println("wydanie pesel");
	}
}