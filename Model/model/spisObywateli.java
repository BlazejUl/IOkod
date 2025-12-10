package Model.model;

import java.util.ArrayList;

public class spisObywateli {

	private IDAO dao;
	private ArrayList<IObywatel> obywatele;

	public spisObywateli(IDAO dao) {
		this.dao = dao;
		this.obywatele = new ArrayList<>();
		this.obywatele.add(new Obywatel("",123,0,"","",""));
		this.obywatele.add(new Obywatel("",124,0,"","",""));
		this.obywatele.add(new Obywatel("",125,0,"","",""));
	}

	public IObywatel dajObywatela(int PESEL) {
		for(IObywatel obywatel : obywatele){
			if (obywatel.dajNumerPESEL()==PESEL){
				return obywatel;
			}
		}
        return null;
    }

	public void zmianaDanychUrodzeniaPłciObywatela(int PESEL, ArrayList Dane){
		for(IObywatel obywatel : obywatele){
			if (obywatel.dajNumerPESEL()==PESEL){
				if(!Dane.getFirst().equals("")){obywatel.podajDatęUrodzenia(String.valueOf(Dane.getFirst()));}
				if(!Dane.getLast().equals("")){obywatel.podajPłeć(String.valueOf(Dane.getFirst()));}
			}
		}
	}

	public void zmieńPESEL(int PESEL, int nowyPESEL){
		for(IObywatel obywatel : obywatele){
			if (obywatel.dajNumerPESEL()==PESEL){
				obywatel.podajNumerPESEL(nowyPESEL);
			}
		}
	}

}