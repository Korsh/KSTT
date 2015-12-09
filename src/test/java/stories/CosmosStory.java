package stories;

import net.thucydides.core.annotations.Steps;
import net.thucydides.jbehave.ThucydidesJUnitStory;
import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import steps.CosmosSteps;

/**
 * Created by arzhanov on 04.12.15.
 */
public class CosmosStory extends ThucydidesJUnitStory {
    @Steps
    CosmosSteps steps;

    @Given("Cosmos main page has been opened")
    @Aliases(values = {"COSMOS platform is launched", "COSMOS main page is opened"})
    public void openPage() {
        steps.openPage();
        System.out.println("hi");
        steps.ensureBrowserIsSupport();
    }


}
