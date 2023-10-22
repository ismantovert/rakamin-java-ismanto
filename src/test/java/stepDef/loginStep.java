package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;


public class loginStep {
    @Given("user is on login page")
    public void open_browser()
    {
        WebDriver driver;
        String baseurl = "https://saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);
        String title = driver.getTitle();
        System.out.println(title);

        driver.close();
    }
    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        By driver;
        driver.findElement(By.id("User-name")). sendKeys("standard_user");
        driver.findElement(By.id("Password")). sendKeys("secret_sauce");
    }

    @And("Clicks on Login Button")
    public void clicks_on_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("User is navigated to Home Page")
    public void user_is_navigated_to_home_page() {
        Assert.assertTrue(driver.finfElement(By.xpath("//div[@class= 'app_logo']")).size()>0,"User is navigated to Home Page");
    }

    @An("Close the Browser")
        public void close_the_browser() {
            driver.close();
    }

}
