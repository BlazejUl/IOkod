package Kontroler.kontroler;

import Model.model.*;

import java.awt.*;
import java.util.ArrayList;

public class ZmianaDanychUrodzeniaPłci {

	private IModel model;
	private int PESEL;
	private ArrayList noweDane;

	public ZmianaDanychUrodzeniaPłci(IModel model, int PESEL) {
		this.model = model;
		this.PESEL = PESEL;
		this.noweDane = new ArrayList<String>();
		this.wprowadzenieDanychUrodzeniaPłci();
		this.zatwierdzenieDanych();
		ZatwierdzenieZmianyDanych pu09 = new ZatwierdzenieZmianyDanych();
		if((this.zatwierdzenieDanych() && pu09.zatwierdzenieZmianyDanych()) == true ){
			model.zmianaDanychUrodzeniaPłciObywatela(this.PESEL, this.noweDane);
			WydanieNrPESEL pu06 = new WydanieNrPESEL(model);
		}
	}

	private void wprowadzenieDanychUrodzeniaPłci() {
		this.noweDane.add("21:12:2012");
		this.noweDane.add("M");
	}

	private boolean zatwierdzenieDanych() {
		return true;
	}

}