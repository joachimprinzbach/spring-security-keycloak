package com.joachimprinzbach.springsecuritykeycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserRestController {

    @GetMapping(path = "user")
    public String getUser(Principal principal) {
        return "Hello User " + principal.getName();
    }

    @GetMapping(path = "admin")
    public String getAdmin(Principal principal) {
        return "Hello Admin " + principal.getName();
    }

    @GetMapping(path = "public")
    public String getPublic() {
        return "Public";
    }

}
