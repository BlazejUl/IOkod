import model.TestModel;
import model.TestObywatel;
import model.TestSpisObywateli;
import org.junit.platform.suite.api.*;

@Suite
@SelectClasses({TestModel.class, TestObywatel.class, TestSpisObywateli.class})
@IncludeTags("funkcja")
@ExcludeTags("inicjalizacja")
@SuiteDisplayName("Zestaw testów funkcji modelu")
public class TestFunkcjiModelu {
}
