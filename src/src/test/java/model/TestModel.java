package model;


import kontroler.WydanieNrPESEL;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.openMocks;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("testy klasy model")
public class TestModel {
    @Test
    @Order(1)
    @Tag("model")
    @Tag("funkcja")

    public void TestZmianaDanychUrodzeniaPłciObywatela(){
        //Jeśli
        int PESEL = 1234;
        ArrayList noweDane = new ArrayList<String>();
        noweDane.add("Adam");
        noweDane.add("Kowalski");
        noweDane.add("Polska");
        noweDane.add("Warszawa");
        noweDane.add("23");
        noweDane.add("Warszawa  ul. Jana Pawła II 29/7 ");
        DAO mockDAO = mock(DAO.class);
        SpisObywateli mockSpis = mock(SpisObywateli.class);

        Model model = new Model(mockSpis,mockDAO);
        //Gdy
        model.zmianaDanychOsobowychObywatela(PESEL,noweDane);
        //Wtedy
        verify(mockSpis,times(1)).zmianaDanychOsobowychObywatela(PESEL,noweDane);
    }

    @Test
    @Order(2)
    @Tag("model")
    @Tag("funkcja")
    public void TestWyszukanieObywatela(){
        //Jeśli
        int PESEL = 1234;
        IObywatel obywatel = new Obywatel("",PESEL,1,"","","","","","","");
        DAO mockDAO = mock(DAO.class);
        SpisObywateli mockSpis = mock(SpisObywateli.class);
        when(mockSpis.dajObywatela(PESEL)).thenReturn(obywatel);
        Model model = new Model(mockSpis,mockDAO);
        //Gdy
        IObywatel oddanyObywatel = model.wyszukanieObywatela(PESEL);
        //Wtedy
        verify(mockSpis,times(1)).dajObywatela(PESEL);
        Assertions.assertEquals(obywatel,oddanyObywatel);
    }
}
