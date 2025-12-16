package Kontroler.kontroler;

import Model.model.*;

public class SystemZarządzaniaUrzędem {

	public static void main(String[] args) {
		System.out.println("Stworzenie dao");
		IDAO dao = new DAO();
		System.out.println("Stworzenie spisObywateli");
		SpisObywateli spisObywateli = new SpisObywateli(dao);
		System.out.println("Stworzenie modelu");
		IModel model = new Model(spisObywateli,dao);
		System.out.println("Stworzenie kontrolerUrzędnik");
		IKontrolerUrzędnik urzędnik = new KontrolerUrzędnik(model);
		System.out.println("Stworzenie kontrolerKierownikUrzędu");
		IKontrolerKierownikUrzędu kierownikUrzędu = new KontrolerKierownikUrzędu(model);
		System.out.println("Wywołanie kierownikUrzędu.zmianaDanychUrodzeniaPłci");
		kierownikUrzędu.zmianaDanychUrodzeniaPłci();
		System.out.println("Wywołanie urzędnik.zmianaStanuCywilnego");
		urzędnik.zmianaStanuCywilnego();

	}

}