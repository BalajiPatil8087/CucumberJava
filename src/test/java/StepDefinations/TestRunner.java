package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/ImageFind.feature", glue= {"StepDefinations"},
monochrome = true,
plugin= {"pretty","junit:target/JunitReports/reports.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports"})
public class TestRunner {

}
	