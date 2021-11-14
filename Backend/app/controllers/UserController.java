package controllers;

import models.User;
import play.mvc.Result;


import static play.mvc.Results.ok;

/**
 * @description: user reg/login
 * @author: Grayson Wu
 * @create: 2019-11-16 15:15
 */

public class UserController {

    User user = new User();

    public Result authenticate(String username, String password) {
        try {

            if(username.equals(user.getUsername()) && password.equals(user.getPassword())){
                return ok("success");
            }else{
                return ok("failed");
            }
        }
        catch (Exception e) {
            return ok("Exception " +e);
        }

    }

    public Result register(String username, String password) {
        try {

            user.setUsername(username);
            user.setPassword(password);
        }
        catch (Exception e) {
            return ok("Exception " +e);
        }
        return ok("success");
    }

}
