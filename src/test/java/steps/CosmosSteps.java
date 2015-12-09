package steps;

import core.CosmosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

/**
 * Created by arzhanov on 04.12.15.
 */
public class CosmosSteps extends ScenarioSteps{

    protected CosmosPage cosmosPage;

    public CosmosSteps(Pages pages) {
        super(pages);
        cosmosPage = getPages().get(CosmosPage.class);
    }

    @Step
    public void openPage() {
        cosmosPage.open();
    }

    @Step
    public void ensureBrowserIsSupport() {
        Assert.assertTrue("Browser should supported. Test failed", cosmosPage.isBrowserSupported());
    }

    @Step
    public void ensureLoginWidgetNotExists() {
        Assert.assertFalse("Login widget should not exist. Test failed", false);
    }

}
