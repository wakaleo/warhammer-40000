package net.thucydides.examples.warhammer.features.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.examples.warhammer.model.DiceRoll;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by john on 24/10/2014.
 */
public class ShootingStepDefinitions {

    int ballisticSkill;

    @Given("^I have a ballistic skill of (\\d+)$")
    public void i_have_a_ballistic_skill_of(int ballisticSkill) throws Throwable {
        this.ballisticSkill = ballisticSkill;
    }

    @When("I roll to hit")
    public void rollToHit() {

    }

    @Then("^I will need a minimum roll of (\\d+) to hit$")
    public void i_will_need_a_minimum_roll_of_to_hit(int expectedMinimumRoll) throws Throwable {
        int minimumRoll = DiceRoll.withBalisticSkillOf(ballisticSkill).getMinimumNeededToHit();
        assertThat(minimumRoll).isEqualTo(expectedMinimumRoll);
    }

}
