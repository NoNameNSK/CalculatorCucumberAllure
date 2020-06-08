import cucumber.api.java.Before;
import cucumber.api.java.ru.*;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class CalculatorRunSteps {
    private int total;

    private Calculator calculator;


    @Когда("^я складываю (-?\\d+) и (-?\\d+)$")
        public void testAdd(int num1, int num2) throws Throwable {
            total = calculator.add(num1, num2);


    }
    @Тогда("^результат (-?\\d+)$")
    public void validateResult(int result) throws Throwable {
        Assert.assertThat(total, Matchers.equalTo(result));
    }
}
