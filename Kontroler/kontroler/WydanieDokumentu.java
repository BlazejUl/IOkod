package Kontroler.kontroler;

import java.util.Scanner;

public class WydanieDokumentu extends IWyjścieStrategia {
	private String typDokumentu;


	public WydanieDokumentu(String typDokumentu){
		this.typDokumentu=typDokumentu;
	}

	public void wydajDokument() {
		System.out.println("wydawanie " + typDokumentu);
	}


	public void wyjście() {
		System.out.println("wydanie " + typDokumentu);
	}


}