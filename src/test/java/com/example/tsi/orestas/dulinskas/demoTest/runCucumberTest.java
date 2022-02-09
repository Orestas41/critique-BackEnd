package com.example.tsi.orestas.dulinskas.demoTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
features = "src/test/resources/cucumber",
glue = "com.example.tsi.orestas.dulinskas.demoTest")
public class runCucumberTest {
}
