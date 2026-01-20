package model;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.FieldSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Test klasy SpisObywateli")
public class TestSpisObywateli {
    private int i = -1;
    private static int[] numeryPESEL = {12345, 67890, 72843, 13791};
    private ArrayList<IObywatel> obywatele = new ArrayList<>();
    private IDAO dao;

    @BeforeEach
    public void PrzygotowanieDanych(){

        obywatele.add(new Obywatel("1.1.2000",12345, 26,"kobieta","Wrocław","panna","Wrocław","Polska","Kowalska","Anna"));
        obywatele.add(new Obywatel("2.3.2004",67890, 21,"kobieta","Warszawa","zamężna","Warszawa","Polska","Kot","Beata"));
        obywatele.add(new Obywatel("15.10.1997",72843, 28,"mężczyzna","Szczecin","rozwiedziony","Zakopane","Polska","Łyżwa","Tomasz"));
        obywatele.add(new Obywatel("28.2.1949",13791,76 ,"mężczyzna","Jelenia Góra","wdowiec","Jelenia Góra","Polska","Świerszcz","Bożydar"));
    }
    @Test
    @Order(1)
    @Tag("spisObywateli")
    @Tag("model")
    @Tag("inizjalizacja")
    @DisplayName("Test dodawania obywateli do spisu")
    public void TestInicjalizacji(){
        // jeśli
        SpisObywateli spisObywateli = new SpisObywateli(dao);
        int numerPESEL = 12345;
        // gdy
        for (IObywatel obywatel : obywatele){
            spisObywateli.dodajObywatela(obywatel);
        }
        // wtedy
        Assertions.assertSame(obywatele.get(0),spisObywateli.dajObywateli().get(3));
        // w spisie obywateli jest już 3 przykładowych więc nowi bedą od indeksu 3
    }

    @ParameterizedTest
    @Order(2)
    @Tag("spisObywateli")
    @Tag("model")
    @Tag("funkcja")
    @DisplayName("Test znajdywania obywatela po numerze PESEL")
    @FieldSource("numeryPESEL")
    void TestWyszukiwaniaObywatela(int numerPESEL){
        // jeśli
        i+=1;
        SpisObywateli spisObywateli = new SpisObywateli(dao);
        for (IObywatel obywatel : obywatele){
            spisObywateli.dodajObywatela(obywatel);
        }
        // gdy
        int znalezionyPESEL = spisObywateli.dajObywatela(numerPESEL).dajNumerPESEL();
        // wtedy
        Assertions.assertEquals(numerPESEL, znalezionyPESEL);
    }

    @ParameterizedTest
    @Order(3)
    @Tag("spisObywateli")
    @Tag("model")
    @Tag("inicjalizacja")
    @DisplayName("Test zmiany numeru PESEL obywatela")
    @ValueSource(ints = {11111, 22222, 33333})
    public void TestZmianyNumeruPESEL(int TestoweNumeryPESEL){
        // jeśli
        SpisObywateli spisObywateli = new SpisObywateli(dao);
        int numerPESEL = spisObywateli.dajObywateli().getFirst().dajNumerPESEL();
        // gdy
        spisObywateli.zmieńPESEL(numerPESEL, TestoweNumeryPESEL);
        // wtedy
        Assertions.assertEquals(TestoweNumeryPESEL, spisObywateli.dajObywateli().getFirst().dajNumerPESEL());
    }


    @AfterEach
    public void SprzątanieDanych(){
        obywatele.clear();
    }
}
