package com.choucair.formacion;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = {"src/test/resources/features/Automation/Forms/PopupValidation.feature"}, tags = {"@CasoExitoso"})


public class RunnerTags {

	
}
