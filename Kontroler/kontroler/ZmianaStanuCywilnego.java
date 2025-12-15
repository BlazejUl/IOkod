package Kontroler.kontroler;

import Model.model.*;

import java.util.ArrayList;

public class ZmianaStanuCywilnego {

	private IModel model;
	private int PESEL;
	private String stanCywilny;
	private IWyjścieStrategia exitStrategy;
	private ArrayList noweNazwisko;
	private String typDokumentu;

	public void zmianaStanuCywilnego(IModel model, int PESEL, String stanCywilny) {
		this.model = model;
		this.wprowadzenieNrPESEL();
		this.wprowadzenieStanuCywilnego();
		model.zmianaStanuCywilnegoObywatela(this.PESEL, this.stanCywilny);
		this.wybórOpcji();
		this.exitStrategy.wyjście();

	}

	private void wybórOpcji() {
		int wybór = 1;
		if (wybór==1){
			this.exitStrategy = new WydanieDokumentu();
		}
		if (wybór==2){
			this.noweNazwisko = new ArrayList<String>();
			this.noweNazwisko.add("");
			this.noweNazwisko.add("Kowalska");
			this.exitStrategy = new ZmianaDanychOsobowych(model, PESEL, noweNazwisko);
		}
	}

	private void wprowadzenieNrPESEL() {
		this.PESEL = 123;
	}

	private void wprowadzenieStanuCywilnego() {
		this.stanCywilny = "kawaler";

	}

}