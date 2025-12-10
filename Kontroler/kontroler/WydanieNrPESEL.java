package Kontroler.kontroler;

import Model.model.*;

import java.util.Scanner;

public class WydanieNrPESEL {

	private int staryPESEL;
	private int nowyPESEL;
	private IModel model;

	Scanner scanner = new Scanner(System.in);
	public WydanieNrPESEL(IModel model) {
		this.model = model;
		
	}

	private void wydanieNrPESEL() {
		System.out.println("wydawanie");
	}

	private void wprowadzenieNumeruPESEL(int PESEL) {
		this.staryPESEL = PESEL;
    }

	private void podanieNowegoNumeruPESEL(int nowyPESEL) {
		this.nowyPESEL = nowyPESEL;
	}

	private boolean zatwierdzenieNowegoNumeruPESEL() {
		return true;
	}

}