package Kontroler.kontroler;

import Model.model.*;

public class KontrolerUrzędnik implements IKontrolerUrzędnik {

	private IModel model;

	public void zameldowanieObywatela() {
		// TODO - implement KontrolerUrzędnik.zameldowanieObywatela
		throw new UnsupportedOperationException();
	}

	public void wydanieDokumentu() {
		WydanieDokumentu wydanieDokumentu = new WydanieDokumentu();
		wydanieDokumentu.wydajDokument();
	}

	public void wymeldowanieObywatela() {
		// TODO - implement KontrolerUrzędnik.wymeldowanieObywatela
		throw new UnsupportedOperationException();
	}

	public void zmianaStanuCywilnego() {
		
	}

	public void zmianaDanychOsobowych() {
		// TODO - implement KontrolerUrzednik.zmianaDanychOsobowych
		throw new UnsupportedOperationException();
	}

	public void wydanieNumeruPESEL() {

	}

	public void zmianaDanychUrodzeniaPłci() {
		// TODO - implement KontrolerUrzędnik.zmianaDanychUrodzeniaPłci
		throw new UnsupportedOperationException();
	}

	public void wydanieDowoduOsobistego() {
		// TODO - implement KontrolerUrzędnik.wydanieDowoduOsobistego
		throw new UnsupportedOperationException();
	}

	public void unieważnienieDowoduOsobistego() {
		// TODO - implement KontrolerUrzędnik.unieważnienieDowoduOsobistego
		throw new UnsupportedOperationException();
	}

}