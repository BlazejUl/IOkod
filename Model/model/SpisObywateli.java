package Model.model;

import java.util.ArrayList;

public class SpisObywateli {

	private IDAO dao;
	private ArrayList<IObywatel> obywatele;

	public SpisObywateli(IDAO dao) {
		this.dao = dao;
		this.obywatele = new ArrayList<>();
		this.obywatele.add(new Obywatel("",123,0,"","","","","","",""));
		this.obywatele.add(new Obywatel("",124,0,"","","","","","",""));
		this.obywatele.add(new Obywatel("",125,0,"","","","","","",""));
	}

	public IObywatel dajObywatela(int PESEL) {
		for(IObywatel obywatel : obywatele){
			if (obywatel.dajNumerPESEL()==PESEL){
				return obywatel;
			}
		}
        return null;
    }

	public ArrayList<IObywatel> dajObywateli(){
		return obywatele;
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

	public void zmianaDanychOsobowychObywatela(int PESEL, ArrayList Dane){
		for(IObywatel obywatel : obywatele){
			if (obywatel.dajNumerPESEL()==PESEL){
				if(!Dane.get(0).equals("")){obywatel.podajImię(String.valueOf(Dane.get(0)));}
				if(!Dane.get(1).equals("")){obywatel.podajNazwisko(String.valueOf(Dane.get(1)));}
				if(!Dane.get(2).equals("")){obywatel.podajKrajUrodzenia(String.valueOf(Dane.get(2)));}
				if(!Dane.get(3).equals("")){obywatel.podajMiejsceUrodzenia(String.valueOf(Dane.get(3)));}
				if(!Dane.get(4).equals("")){obywatel.podajWiek(Integer.valueOf(String.valueOf(Dane.get(4))));}
				if(!Dane.get(5).equals("")){obywatel.podajMiejsceZamieszkania(String.valueOf(Dane.get(5)));}
			}
		}
	}

	public void zmianaStanuCywilnegoObywatela(int PESEL, String nowyStan){
		for(IObywatel obywatel : obywatele){
			if (obywatel.dajNumerPESEL()==PESEL){
				if(nowyStan.equals("")){obywatel.podajStanCywilny(nowyStan);}
			}
		}
	}

}