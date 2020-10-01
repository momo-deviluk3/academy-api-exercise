package services;

import api.model.TokenCreated;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class CreateTokenService extends MethodsService {
    public static final ThreadLocal<String> TOKEN= new ThreadLocal<String>();

    public static Response post(String jsonName) {
        Map<String,String> parameters= new HashMap<String,String>();
        parameters.put("token", TOKEN.get());
        return get(jsonName, TokenCreated.class, parameters);
    }
}
