package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    @When("user enter librarian username")
    public void user_enter_librarian_username() {
        System.out.println("a");

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("b");
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("c");
    }
    @When("user enters student username")
    public void user_enters_student_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters admin username")
    public void user_enters_admin_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters admin password")
    public void user_enters_admin_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
