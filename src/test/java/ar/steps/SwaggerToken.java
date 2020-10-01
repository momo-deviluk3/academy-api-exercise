package ar.steps;

import api.config.EntityConfiguration;
import api.model.TokenCreated;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import services.CreateTokenService;

import java.lang.reflect.InvocationTargetException;

public class SwaggerToken extends PageSteps {
    @When("Realizo una peticion (.*) al (.*) con la siguiente (.*)")
    public void realizoUnaPeticionEndpointAlEntityConLaSiguienteRequest(String endpoint,String entity,String request) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(endpoint.toLowerCase(), String.class).invoke("", request);
    }

    @Then("obtengo el '(.*)'")
    public void obtengoElTokenStatusCode(int statusCode) {
        int actualStatusCode= APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(statusCode,actualStatusCode);
    }

    @And("guardo el token generado")
    public void guardoElTokenGenerado() {
        TokenCreated response= (TokenCreated) APIManager.getLastResponse().getResponse();
        CreateTokenService.TOKEN.set(response.getJwt());
    }
}
