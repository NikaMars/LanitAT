package hw7; /**
 * Класс для запуска тестов
 * Автор Васильев И.Н. atcc@mail.ru
 * 02.12.2018
 */

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        tags = {"@Lanit"},
        glue = {"ru/lanit/atschool/steps"}
)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
