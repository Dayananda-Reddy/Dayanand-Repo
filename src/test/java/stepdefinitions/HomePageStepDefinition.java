package stepdefinitions;
    import io.cucumber.java.en.*;
    import workflows.SeleniumWorkFlow;
    import org.junit.Assert;
    import common.Assertion;
    import common.WebBrowserUtil;
    public class HomePageStepDefinition
	{
        SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
        

             @Given("^I have access to Click up application$")			
            public void GivenIHaveAccessToClickUpApplication()
            {
                workFlow.accessToPage();
                
            }
    }