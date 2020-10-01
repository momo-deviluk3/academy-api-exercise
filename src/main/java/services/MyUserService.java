package services;

import api.model.MyUser;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class MyUserService extends MethodsService {


    public static Response get(String jsonName) {

        return get(jsonName, MyUser.class);
    }
}
