package kontroler;


import model.Model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@DisplayName("test klasy ZmianaDanychOsobowych")
public class TestZmianaDanychOsobowych {



    @Test
    @DisplayName("Test inicjalizacji")
    @Tag("kontroler")
    @Tag("inicjalizacja")
    @Order(1)
    public void TestInicjalizacij(){
        //Jeśli
        ArrayList noweDane = new ArrayList<String>();
        noweDane.add("Adam");
        noweDane.add("Kowalski");
        noweDane.add("Polska");
        noweDane.add("Warszawa");
        noweDane.add("23");
        noweDane.add("Warszawa  ul. Jana Pawła II 29/7 ");

        Model mockModel = mock(Model.class);
        doNothing().when(mockModel).zmianaDanychOsobowychObywatela(111,noweDane);
        //Gdy
        ZmianaDanychOsobowych zmianaDanychOsobowych = new ZmianaDanychOsobowych(mockModel,111,noweDane);
        //Wtedy
        verify(mockModel, times(1)).zmianaDanychOsobowychObywatela(111,noweDane);
    }


    @Test
    @DisplayName("Test funkcji wprowadzania danych")
    @Tag("kontroler")
    @Tag("funkcja")
    @Order(2)
    public void TestWprowadzenieDanychOsobowych(){
        //Jeśli
        ArrayList noweDane = new ArrayList<String>();
        noweDane.add("Adam");
        noweDane.add("Kowalski");
        noweDane.add("Polska");
        noweDane.add("Warszawa");
        noweDane.add("23");
        noweDane.add("Warszawa  ul. Jana Pawła II 29/7 ");

        ArrayList Dane = new ArrayList<String>();
        Dane.add("Adam");
        Dane.add("Kowalski");
        Dane.add("Polska");
        Dane.add("Warszawa");
        Dane.add("23");
        Dane.add("Warszawa  ul. Jana Pawła II 29/7 ");

        Model mockModel = mock(Model.class);
        doNothing().when(mockModel).zmianaDanychOsobowychObywatela(111,noweDane);
        doNothing().when(mockModel).zmianaDanychOsobowychObywatela(111,Dane);

        //Gdy
        ZmianaDanychOsobowych zmianaDanychOsobowych = new ZmianaDanychOsobowych(mockModel,111,noweDane);
        zmianaDanychOsobowych.wprowadzenieDanychOsobowych(111,Dane);

        //Wtedy
        verify(mockModel, times(2)).zmianaDanychOsobowychObywatela(111,noweDane);
    }
}
