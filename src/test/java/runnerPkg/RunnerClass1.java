package runnerPkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features ="/Users/pkamerakodi/eclipse-workspace/WinterProjectQAWizard/src/test/java/feature",
                  glue = "stepDefinition",
                  monochrome = true,
                  plugin = {"pretty","html:target/Cucumber_Report.html"}
                  
              )
public class RunnerClass1 { 

}
