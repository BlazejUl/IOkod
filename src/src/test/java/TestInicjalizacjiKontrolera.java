import kontroler.TestWydanieNrPESEL;
import kontroler.TestZmianaDanychOsobowych;
import kontroler.TestZmianaStanuCywilnego;
import org.junit.platform.suite.api.*;

@Suite
@SelectClasses({TestKontrolera.class, TestWydanieNrPESEL.class, TestZmianaDanychOsobowych.class, TestZmianaStanuCywilnego.class})
@IncludeTags("inicjalizacja")
@ExcludeTags("funkcja")
@SuiteDisplayName("Test inicjalizacji klas kontrolera")
public class TestInicjalizacjiKontrolera {
}
