package hellocucumber;

import io.cucumber.java.en.*;
import io.calculator.StringCalculator;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class StepDefinitions {
    private String input;
    @Given("an example scenario")


    @When("adding calculating the string {string}")
    public void addingCalculatingTheString(String arg0) {
        input = arg0;
    }

    @Then("the calculator returns {string}")
    public void theCalculatorReturns(String arg0) {
        //io.calculator.StringCalculator sc = new io.calculator.StringCalculator();
        //assertEquals(arg0, io.calculator.StringCalculator.add(input));
    }

    @Then("the calculator returns {int}")
    public void theCalculatorReturns(int arg0) {
        StringCalculator sc = new StringCalculator();
        assertEquals(arg0, sc.add(input));
    }
}
