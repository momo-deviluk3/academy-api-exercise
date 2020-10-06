package services;

import api.model.MyUser;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class MyUserService extends MethodsService {
    public static final ThreadLocal<String> TOKEN= new ThreadLocal<String>();

    public static Response get(String jsonName) {
        Map<String,String> parameters= new HashMap<String,String>();
        parameters.put("token", TOKEN.get());
        return get(jsonName, MyUser.class, parameters);
    }
}
