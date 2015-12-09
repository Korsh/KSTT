package stories;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import steps.CosmosSteps;

/**
 * Created by arzhanov on 04.12.15.
 */
public class LoginUser extends CosmosStory{

    @When("user fills login form with correct data ($username/$password)")
    @Alias("user fills login form with correct data (<username>/<password>)")
    public void fillLoginForm(String username, String password) {
        System.out.println("fillLoginForm");
        /*steps.switchToLoginWidget();
        steps.fillLoginFormInLoginWidget(username, password);*/
    }

    @When("clicks \"Login\" button")
    public void clickLoginButton() {
        System.out.println("clickLoginButton");
        /*steps.clickLoginButtonInLoginWidget();*/
    }

    @Then("user should be logged in")
    public void ensureLoginSucceed() {

        steps.ensureLoginWidgetNotExists();
    }

    @Then("User is logged in")
    public boolean isUserLoggedIn() {
        return true;
    }
}
