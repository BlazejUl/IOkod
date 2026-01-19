package model;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestObywatel {

    @Test
    @Order(1)
    @DisplayName("Test konstruktora obywatela")

    void TestInicjalizacji() {
        // jeśli
        int PESEL = 12345;
        // gdy
        Obywatel obywatel = new Obywatel("1.1.2000",PESEL, 26,"kobieta","Wrocław","panna","Wrocław","Polska","Kowalska","Anna");
        // wtedy
        Assertions.assertEquals(PESEL, obywatel.dajNumerPESEL());

    }
    @Test
    @Order(2)
    @DisplayName("Test metody opisz")

    void TestMetodyOpisz(){
        // jeśli
        // metoda opisz ma zwrócić wyjątek UnsupportedOperationException
        // gdy
        Obywatel obywatel = new Obywatel("1.1.2000",12345, 26,"kobieta","Wrocław","panna","Wrocław","Polska","Kowalska","Anna");
        // wtedy
        Exception wyjątek = Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            obywatel.opisz();
        });
    }
}



