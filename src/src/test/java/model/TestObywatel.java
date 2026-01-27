package model;


import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

@DisplayName("Test klasy Obywatel")
public class TestObywatel {

    @Test
    @Order(1)
    @Tag("obywatel")
    @Tag("model")
    @Tag("inicjalizacja")
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
    @Tag("obywatel")
    @Tag("model")
    @Tag("funkcja")
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



