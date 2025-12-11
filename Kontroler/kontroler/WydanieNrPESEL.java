package Kontroler.kontroler;

import Model.model.*;

import java.util.Scanner;

public class WydanieNrPESEL {

	private int staryPESEL;
	private int nowyPESEL;
	private IModel model;

	public WydanieNrPESEL(IModel model,int PESEL) {
		this.model = model;
		this.staryPESEL = PESEL;
		nowyPESEL = podanieNowegoNumeruPESEL();
		if(zatwierdzenieNowegoNumeruPESEL()){
			model.zmianaNumeruPESEL(staryPESEL,nowyPESEL);
			wydanieNrPESEL();
		}
	}

	private int podanieNowegoNumeruPESEL() {
		return 155;
	}

	private boolean zatwierdzenieNowegoNumeruPESEL() {
		return true;
	}

	private int wprowadzenieNumeruPESEL() {
		return 123;
	}

	private void wydanieNrPESEL() {
		System.out.println("wydanie pesel");
	}
}