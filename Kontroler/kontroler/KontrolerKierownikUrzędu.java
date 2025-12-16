package Kontroler.kontroler;

import Model.model.*;

public class KontrolerKierownikUrzędu implements IKontrolerKierownikUrzędu {

	private IModel model;

	KontrolerKierownikUrzędu(IModel model){
		this.model = model;
	}

	public void zatwierdzenieZmianyDanych() {
		ZatwierdzenieZmianyDanych pu09 = new ZatwierdzenieZmianyDanych();
		pu09.zatwierdzenieZmianyDanych();
	}

	public void stworzenieSprawozdaniaStatystyk() {
		System.out.println("tworzenie sprawozdania");
	}

	public void zameldowanieObywatela() {
		// TODO - implement KontrolerKierownikUrzędu.zameldowanieObywatela
		throw new UnsupportedOperationException();
	}

	public void wydanieDokumentu() {
		// TODO - implement KontrolerKierownikUrzędu.wydanieDokumentu
		throw new UnsupportedOperationException();
	}

	public void wymeldowanieObywatela() {
		// TODO - implement KontrolerKierownikUrzędu.wymeldowanieObywatela
		throw new UnsupportedOperationException();
	}

	public void zmianaStanuCywilnego() {
		// TODO - implement KontrolerKierownikUrzędu.zmianaStanuCywilnego
		throw new UnsupportedOperationException();
	}

	public void zmianaDanychOsobowych() {
		// TODO - implement KontrolerKierownikUrzędu.zmianaDanychOsobowych
		throw new UnsupportedOperationException();
	}

	public void wydanieNumeruPESEL() {
		// TODO - implement KontrolerKierownikUrzędu.wydanieNumeruPESEL
		throw new UnsupportedOperationException();
	}

	public void zmianaDanychUrodzeniaPłci() {
		int PESEL = 123;
		ZmianaDanychUrodzeniaPłci pu05 = new ZmianaDanychUrodzeniaPłci(model,PESEL);

	}

	public void wydanieDowoduOsobistego() {
		// TODO - implement KontrolerKierownikUrzędu.wydanieDowoduOsobistego
		throw new UnsupportedOperationException();
	}

	public void unieważnienieDowoduOsobistego() {
		// TODO - implement KontrolerKierownikUrzędu.unieważnienieDowoduOsobistego
		throw new UnsupportedOperationException();
	}

}