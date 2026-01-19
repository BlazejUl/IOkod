package kontroler;

import model.IModel;

import java.util.ArrayList;

public class ZmianaDanychUrodzeniaPłci {

	private IModel model;
	private int PESEL;
	private ArrayList noweDane;

	public ZmianaDanychUrodzeniaPłci(IModel model, int PESEL) {
		System.out.println("ZmianaDanychUrodzeniaPłci");
		this.model = model;
		this.PESEL = PESEL;
		this.noweDane = new ArrayList<String>();
		this.wprowadzenieDanychUrodzeniaPłci();
		ZatwierdzenieZmianyDanych pu09 = new ZatwierdzenieZmianyDanych();
		if((this.zatwierdzenieDanych() && pu09.zatwierdzenieZmianyDanych()) == true ){
			this.model.zmianaDanychUrodzeniaPłciObywatela(this.PESEL, this.noweDane);
			WydanieNrPESEL pu06 = new WydanieNrPESEL(model, this.PESEL);
		}
	}

	private void wprowadzenieDanychUrodzeniaPłci() {
		System.out.println("wprowadzenieDanychUrodzeniaPłci");
		this.noweDane.add("21:12:2012");
		this.noweDane.add("M");
	}

	private boolean zatwierdzenieDanych() {
		System.out.println("zatwierdzenieDanych");
		return true;
	}

}