package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import po.*;
import utils.*;
import java.util.List;

public class Steps {

    DriverManager driverManager;
    HomePage homePage;
    SignupLoginPage signupLoginPage;
    SignupPage signupPage;
    Common common;
    String search = "";

    @Given("I open a browser")
    public void iOpenABrowser()
    {
        driverManager = new DriverManager();
        homePage = new HomePage(driverManager.getWebDriver());
        signupLoginPage = new SignupLoginPage(driverManager.getWebDriver());
        signupPage = new SignupPage(driverManager.getWebDriver());
        common = new Common(driverManager.getWebDriver());
    }

    @When("I navigate to {string}")
    public void iNavigateTo(String url)
    {
        driverManager.get(url);
        homePage.consent();
    }



    @And("Enter name and email address")
    public void enterNameAndEmailAddress(List<String> person)
    {
        signupLoginPage.completeForm(person.get(signupLoginPage.NAME),
                                     person.get(signupLoginPage.EMAIL));
    }

    @And("Enter details")
    public void enterDetails(List<String> details)
    {
        signupPage.completeForm(details.get(signupPage.TITLE),
                                details.get(signupPage.PASSWORD),
                                details.get(signupPage.DOB));
    }


    @And("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber()
    {

    }

    //Common Steps

    @And("Verify that title is {string}")
    public void verifyThatTitleIsAutomationExercise(String title)
    {
        common.titleVisible(title);
    }

    @And("Click {string} button")
    public void clickSignupLoginButton(String text)
    {
        common.clickButton(text);
    }

    @And("Click {string} link")
    public void clickSignupLoginLink(String link)
    {
        common.clickLink(link);
    }

    @And("Select checkbox {string}")
    public void selectCheckbox(String label)
    {
        common.checkbox(label);
    }
}