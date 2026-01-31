package testyfitnesse;

import fit.ColumnFixture;
import kontroler.ZmianaDanychUrodzeniaPłci;
import model.IObywatel;

public class testZmianaDanychUrodzeniaPłci extends ColumnFixture {

    String data;
    String plec;

        public boolean zmienDaneUrodzeniaPłciObywatela(){
            int PESEL = 123;
            try {
                ZmianaDanychUrodzeniaPłci zmianaDanychUrodzeniaPłci = new ZmianaDanychUrodzeniaPłci(SetUp.model,data,plec,PESEL);
            }
            catch (Exception e){
                return false;
            }

            IObywatel obywatel = SetUp.model.wyszukanieObywatela(PESEL);

            return obywatel.dajDatęUrodzenia().equals(data)&&obywatel.dajPłeć().equals(plec);
        }

}
