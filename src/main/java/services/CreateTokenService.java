package services;

import api.model.TokenCreated;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class CreateTokenService extends MethodsService {


    public static Response post(String jsonName) {
        return post(jsonName, TokenCreated.class);
    }
}
