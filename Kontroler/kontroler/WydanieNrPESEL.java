package Kontroler.kontroler;

import Model.model.*;

import java.util.Scanner;

public class WydanieNrPESEL {

	private int staryPESEL;
	private IModel model;

	Scanner scanner = new Scanner(System.in);
	public WydanieNrPESEL(IModel model) {
		this.model = model;
	}

	public void wydanieNrPESEL() {
		wprowadzenieNumeruPESEL();
		System.out.println("wydawanie");
	}

	private void wprowadzenieNumeruPESEL() {
		System.out.println("Podaj stary numer PESEL");
		try {
			staryPESEL = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

	private int podanieNowegoNumeruPESEL() {
		// TODO - implement WydanieNrPESEL.podanieNowegoNumeruPESEL
		throw new UnsupportedOperationException();
	}

	private boolean zatwierdzenieNowegoNumeruPESEL() {
		// TODO - implement WydanieNrPESEL.zatwierdzenieNowegoNumeruPESEL
		throw new UnsupportedOperationException();
	}

}