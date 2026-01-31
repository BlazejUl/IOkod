package testyfitnesse;

import fit.Fixture;
import model.DAO;
import model.Model;
import model.SpisObywateli;

public class SetUp extends Fixture {
    static DAO dao;
    static Model model;
    static SpisObywateli spis;

    public SetUp(){
        dao = new DAO();
        spis = new SpisObywateli(dao);
        model = new Model(spis,dao);
    }
}
