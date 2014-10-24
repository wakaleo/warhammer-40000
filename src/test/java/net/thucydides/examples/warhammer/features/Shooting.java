package net.thucydides.examples.warhammer.features;

import cucumber.api.CucumberOptions;
import net.thucydides.cucumber.CucumberWithThucydides;
import org.junit.runner.RunWith;

@RunWith(CucumberWithThucydides.class)
@CucumberOptions(features="src/test/resources/features/shooting/calculating_hits.feature")
public class Shooting {
}
