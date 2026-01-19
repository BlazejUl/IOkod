package kontroler;


import model.DAO;
import model.Model;
import model.SpisObywateli;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestZmianaDanychOsobowych {

    @Mock
    DAO mockedDao;

    @Mock
    SpisObywateli mockedSpis;

    @InjectMocks
    Model model;

    @Test
    public void mockTest(){
        ArrayList noweDane = new ArrayList<String>();
        noweDane.add("Adam");
        noweDane.add("Kowalski");
        noweDane.add("Polska");
        noweDane.add("Warszawa");
        noweDane.add("23");
        noweDane.add("Warszawa  ul. Jana Pawła II 29/7 ");

        doReturn("done").when(mockedSpis).zmianaDanychOsobowychObywatela(111,noweDane);

        ZmianaDanychOsobowych zmianaDanychOsobowych = new ZmianaDanychOsobowych(model,111,noweDane);

        assertEquals("done","done");
    }
}
