package kontroler;


import model.Model;
import org.junit.jupiter.api.*;
import org.mockito.Mock;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;
import static org.mockito.MockitoAnnotations.openMocks;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("testy klasy zmianaStanuCywilnego")
public class TestZmianaStanuCywilnego {
    @Mock Model mockModel;
    @Test
    @Order(1)
    @Tag("kontroler")
    @Tag("inicjalizacja")
    @DisplayName("test inicjalizacji zmianaStanuCywilnego")
    public void TestInicjalizacji(){
        openMocks(this);
        //Jeśli
        int PESEL = 12345;
        doNothing().when(mockModel).zmianaStanuCywilnegoObywatela(PESEL,"");
        //Gdy
        ZmianaStanuCywilnego zmianaStanuCywilnego = new ZmianaStanuCywilnego(mockModel,PESEL,"");
        //Wtedy
        verify(mockModel,times(1)).zmianaStanuCywilnegoObywatela(PESEL,"");
    }
}
