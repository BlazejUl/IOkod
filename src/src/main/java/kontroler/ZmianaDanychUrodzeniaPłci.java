package kontroler;

import model.IModel;

import java.util.ArrayList;

public class ZmianaDanychUrodzeniaPłci {

	private IModel model;
	private int PESEL;
	private ArrayList noweDane;

	public ZmianaDanychUrodzeniaPłci(IModel model,String dataUrodzenia,String plec, int PESEL) {
		System.out.println("ZmianaDanychUrodzeniaPłci");
		this.model = model;
		this.noweDane = new ArrayList<String>();
		this.wprowadzenieDanychUrodzeniaPłci(dataUrodzenia,plec,PESEL);
		ZatwierdzenieZmianyDanych pu09 = new ZatwierdzenieZmianyDanych();
		if((this.zatwierdzenieDanych() && pu09.zatwierdzenieZmianyDanych()) == true ){
			this.model.zmianaDanychUrodzeniaPłciObywatela(this.PESEL, this.noweDane);
			WydanieNrPESEL pu06 = new WydanieNrPESEL(model, this.PESEL);
		}
	}

	private void wprowadzenieDanychUrodzeniaPłci(String dataUrodzenia,String plec, int PESEL) {
		this.PESEL = PESEL;
		this.noweDane.add(dataUrodzenia);
		this.noweDane.add(plec);
	}

	private boolean zatwierdzenieDanych() {
		System.out.println("zatwierdzenieDanych");
		return true;
	}

}