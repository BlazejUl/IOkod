package kontroler;

import model.Model;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

@DisplayName("testy klasy wydanieNrPESEL")
public class TestWydanieNrPESEL {

    @Test
    @Order(1)
    @Tag("kontroler")
    @Tag("inicjalizacja")
    @DisplayName("test inicjalizacji wydanieNrPESEL")
    public void TestInicjalizacji(){
        //Jeśli
        int PESEL = 12345;
        Model mockModel = mock(Model.class);
        doNothing().when(mockModel).zmianaNumeruPESEL(PESEL,155);
        //Gdy
        WydanieNrPESEL wydanieNrPESEL = new WydanieNrPESEL(mockModel,PESEL);
        //Wtedy
        verify(mockModel,times(1)).zmianaNumeruPESEL(PESEL,155);
    }
}
