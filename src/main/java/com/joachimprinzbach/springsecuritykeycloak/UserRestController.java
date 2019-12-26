package com.joachimprinzbach.springsecuritykeycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping(path = "user")
    public String getUser() {
        return "User";
    }

    @GetMapping(path = "admin")
    public String getAdmin() {
        return "Admin";
    }

    @GetMapping(path = "public")
    public String getPublic() {
        return "Public";
    }

}
