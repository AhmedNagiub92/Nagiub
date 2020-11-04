package testRunner;

import cucumber.api.CucumberOptions;


@CucumberOptions(features="src/test/java/features",glue= {"steps"}
,plugin= {"pretty","html:target/test"})
public class TestRunner1
{
	

}
