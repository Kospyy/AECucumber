package steps;

import io.cucumber.java.en.*;
import po.*;

import java.util.List;

public class Steps {

    DriverManager driverManager;
    HomePage homePage;
    SignupLoginPage signupLoginPage;
    SignupPage signupPage;
    LoginPage loginPage;
    Common common;
    CheckoutPage checkoutPage;

    @Given("I open a browser")
    public void iOpenABrowser()
    {
        driverManager = new DriverManager();
        homePage = new HomePage();
        signupLoginPage = new SignupLoginPage();
        signupPage = new SignupPage();
        loginPage = new LoginPage();
        common = new Common();
        checkoutPage = new CheckoutPage();
    }

    @When("I navigate to {string}")
    public void iNavigateTo(String url)
    {
        driverManager.get(url);
    }

    @Then("Click consent")
    public void clickConsent()
    {
        homePage.consent();
    }

    @And("Enter name and random email address:")
    public void enterNameAndRandomEmailAddress(String signUp)
    {
        signupLoginPage.completeSignUpForm(signUp);
    }

    @And("Enter details")
    public void enterDetails(List<String> details)
    {
        signupPage.completeForm(details.get(signupPage.TITLE),
                                details.get(signupPage.PASSWORD),
                                details.get(signupPage.DOB));
    }

    @And("Fill address information:")
    public void fillAddressInformation(List<String> addressInfo)
    {
        signupPage.addressInformationForm(addressInfo);
    }

    @And("Enter random email address and password:")
    public void enterRandomEmailAddressAndPassword(String login)
    {
        loginPage.completeLoginForm(login);
    }

    @And("Verify that I am logged in as:")
    public void verifyThatIAmLoggedInAs(String person)
    {
        homePage.verifyLoggedIn(person);
    }

    @And("I select the following item:")
    public void iSelectTheFollowingItem(List<String> items)
    {
        homePage.selectItem(items.getFirst());
    }

    @And("I select the following product:")
    public void iSelectTheFollowingProduct(List<String> products)
    {
        homePage.selectProduct(products.getFirst());
    }

    @And("Select quantity and Add to cart")
    public void selectQuantityAndAddToCart(List<String> values)
    {
        homePage.selectQuantity(values.getFirst());
    }

    @And("Go to cart")
    public void goToCart()
    {
        homePage.clickCart();
    }

    @And("Fill payment information:")
    public void fillPaymentInformation(List<String> paymentInfo)
    {
        checkoutPage.paymentInformationForm(paymentInfo);
    }

    //Common Steps

    @And("Verify that title is {string}")
    public void verifyThatTitleIs(String title)
    {
        common.titleVisible(title);
    }

    @And("Click {string} button")
    public void clickButton(String text)
    {
            common.clickButton(text);
    }

    @And("Click {string} link")
    public void clickLink(String link)
    {
        common.clickLink(link);
    }

    @And("Select checkbox {string}")
    public void selectCheckbox(String label)
    {
        common.checkbox(label);
    }

    @And("Sleep")
    public void sleep()
    {
        common.sleep();
    }
}