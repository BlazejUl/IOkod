import model.TestModel;
import model.TestObywatel;
import model.TestSpisObywateli;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectClasses({TestModel.class, TestObywatel.class, TestSpisObywateli.class})
@SuiteDisplayName("Zestaw testów warstwy modelu")
public class TestModelu {
}
