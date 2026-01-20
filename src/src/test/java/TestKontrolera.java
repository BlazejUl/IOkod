import kontroler.TestWydanieNrPESEL;
import kontroler.TestZmianaDanychOsobowych;

import org.junit.jupiter.api.DisplayName;
import org.junit.platform.suite.api.SelectClasses;

import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({TestWydanieNrPESEL.class, TestZmianaDanychOsobowych.class})
@DisplayName("Zestaw testów kontrolera")
public class TestKontrolera {
}
