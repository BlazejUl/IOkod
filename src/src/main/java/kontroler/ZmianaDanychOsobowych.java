package kontroler;

import model.IModel;
import java.util.ArrayList;

public class ZmianaDanychOsobowych extends IWyjścieStrategia {

	private IModel model;
	private int PESEL;
	private ArrayList noweDane;


	public ZmianaDanychOsobowych(IModel model, int PESEL, ArrayList noweDane) {
		this.model = model;
		this.PESEL = PESEL;
		this.noweDane = noweDane;
		if(this.zatwierdzenieZmianyDanychOsobowych() && noweDane.size() == 6){
			model.zmianaDanychOsobowychObywatela(PESEL, noweDane);
		}

	}

	public void wprowadzenieDanychOsobowych(int PESEL,ArrayList noweDane) {

		model.zmianaDanychOsobowychObywatela(PESEL, noweDane);

	}

	private boolean zatwierdzenieZmianyDanychOsobowych(){return true;}

	public void wyjście() {
		if (this.zatwierdzenieZmianyDanychOsobowych()){
			model.zmianaDanychOsobowychObywatela(PESEL, noweDane);
		}
	}

}