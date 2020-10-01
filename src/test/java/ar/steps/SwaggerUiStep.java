package ar.steps;

import api.config.EntityConfiguration;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import org.testng.Assert;

import java.lang.reflect.InvocationTargetException;

public class SwaggerUiStep extends PageSteps {

    @When("Hago una peticion (.*) al (.*) con la siguiente (.*)")
    public void doRequest(String endpoint,String entity, String request) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(endpoint.toLowerCase(), String.class).invoke("", request);

    }

    @Then("obtengo el status code (.*)")
    public void obtengoElStatusCodeStatusCode(int expectedStatusCode) {
        int actualStatusCode= APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(expectedStatusCode,actualStatusCode,"Los status code no son iguales");
    }

}
