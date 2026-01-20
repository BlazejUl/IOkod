package kontroler;

import model.Model;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.openMocks;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("testy klasy KontrolerUrzędnik")
public class TestKontrolerUrzędnik {
    @Mock
    Model mockModel;
    @InjectMocks
    KontrolerUrzędnik kontrolerUrzędnik;
    @Test
    @Order(1)
    @Tag("kontroler")
    @Tag("funkcja")
    @DisplayName("test funkcji ZmianaStanuCywilnego")
    public void TestZmianaStanuCywilnego(){
        openMocks(this);
        //Jeśli
        int PESEL = 123;
        String stanCywilny = "kawaler";
        doNothing().when(mockModel).zmianaStanuCywilnegoObywatela(PESEL,stanCywilny);
        //Gdy
        kontrolerUrzędnik.zmianaStanuCywilnego();
        //Wtedy
        verify(mockModel,times(1)).zmianaStanuCywilnegoObywatela(PESEL,stanCywilny);
    }
}
