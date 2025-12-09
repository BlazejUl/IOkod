package Kontroler.kontroler;

import java.util.Scanner;

public class WydanieDokumentu implements IWyjścieStrategia {

	Scanner scanner = new Scanner(System.in);

	public WydanieDokumentu(){}

	public void wydajDokument() {
		String typDokumentu = wybranieRodzajuDokumentu();
		System.out.println("wydawanie " + typDokumentu);
	}

	private String wybranieRodzajuDokumentu() {
		System.out.println("Podaj rodzaj dokumentu");
		return scanner.nextLine();
	}

	public void wyjście() {
		// TODO - implement WydanieDokumentu.wyj�cie
		throw new UnsupportedOperationException();
	}

}