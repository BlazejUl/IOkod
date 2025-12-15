package Kontroler.kontroler;

import Model.model.IModel;

import java.util.ArrayList;

public class ZmianaDanychOsobowych extends IWyjścieStrategia {

	private IModel model;
	private int PESEL;
	private ArrayList noweDane;


	public ZmianaDanychOsobowych(Model.model.IModel model, int PESEL, ArrayList noweDane) {
		this.model = model;
		this.PESEL = PESEL;
		this.noweDane = noweDane;
		if(this.zatwierdzenieZmianyDanychOsobowych() && noweDane.size() == 6){
			model.zmianaDanychOsobowychObywatela(PESEL, noweDane);
		}

	}

	private void wprowadzenieDanychOsobowych() {
		this.noweDane = new ArrayList<String>();
		noweDane.add("Adam");
		noweDane.add("Kowalski");
		noweDane.add("Polska");
		noweDane.add("Warszawa");
		noweDane.add("23");
		noweDane.add("Warszawa  ul. Jana Pawła II 29/7 ");

	}

	private boolean zatwierdzenieZmianyDanychOsobowych(){return true;}

	public void wyjście() {
		if (this.zatwierdzenieZmianyDanychOsobowych()){
			model.zmianaDanychOsobowychObywatela(PESEL, noweDane);
		}
	}

}