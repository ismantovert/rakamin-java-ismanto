package testRunner;

import io.cucumber.junit.CucumberOptions;
import org.junit.platform.engine.support.descriptor.AbstractTestDescriptor;

@CucumberOptions(tags = "", features = {"src/test/java/cucumber/resources/features"},
glue = {"src/test/java/stepDef"},
plugin = {"pretty", "html:target/htmlreport.html"})

public class cucumbertestRunner extends AbstractTestDescriptor{

}
