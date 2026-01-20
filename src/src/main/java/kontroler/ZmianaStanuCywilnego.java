package kontroler;

import model.IModel;

import java.util.ArrayList;

public class ZmianaStanuCywilnego {

	private IModel model;
	private int PESEL;
	private String stanCywilny;
	private IWyjścieStrategia exitStrategy;
	private ArrayList noweNazwisko;
	private String typDokumentu;

	public ZmianaStanuCywilnego(IModel model, int PESEL, String stanCywilny) {
		System.out.println("ZmianaStanuCywilnego");
		this.model = model;
		this.stanCywilny = stanCywilny;
		this.PESEL = PESEL;
		this.model.zmianaStanuCywilnegoObywatela(this.PESEL, this.stanCywilny);
		this.wybórOpcji();
		this.exitStrategy.wyjście();

	}

	private void wybórOpcji() {
		System.out.println("wybórOpcji");
		int wybór = 1;
		if (wybór==1){
			this.typDokumentu = "zmiana stanu cywilnego";
			this.exitStrategy = new WydanieDokumentu(typDokumentu);
		}
		if (wybór==2){
			this.noweNazwisko = new ArrayList<String>();
			this.noweNazwisko.add("");
			this.noweNazwisko.add("Kowalska");
			this.exitStrategy = new ZmianaDanychOsobowych(model, PESEL, noweNazwisko);
		}
	}

	private void wprowadzenieNrPESEL() {
		System.out.println("wprowadzenieNrPESEL");
		this.PESEL = 123;
	}

	private void wprowadzenieStanuCywilnego() {
		System.out.println("wprowadzenieStanuCywilnego");
		this.stanCywilny = "kawaler";

	}

}