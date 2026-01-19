package model;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class TestObywatel {

    @Test
    @Order(1)
    @DisplayName("test konstruktora obywatela")

    void testDodaniaDanych() {
        // given

        Obywatel obywatel = new Obywatel("1.1.2000",12345, 26,"kobieta","Wrocław","panna","Wrocław","Polska","Kowalska","Anna");
        // when
        int wynik = 12345;
        // then
        Assertions.assertEquals(wynik, obywatel.dajNumerPESEL());

    }
    @Test
    @Order(2)
    @DisplayName("test metody opisz")

    void testMetodyOpisz(){
        // given
        Obywatel obywatel = new Obywatel("1.1.2000",12345, 26,"kobieta","Wrocław","panna","Wrocław","Polska","Kowalska","Anna");
        // when

        // then
        Exception wyjątek = Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            obywatel.opisz();
        });
    }
}



