package starter.runnes;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

public class RunnerTags {

    @Suite
    @IncludeEngines("cucumber")
    @SelectClasspathResource("features/")
    @ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@CasoExitoso")
    @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty,timeline:build/test-results/timeline")
    public static class CucumberTestSuite {
    }
}
