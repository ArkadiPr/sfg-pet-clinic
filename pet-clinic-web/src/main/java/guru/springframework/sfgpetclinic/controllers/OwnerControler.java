package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerControler {
    @RequestMapping({"","/","index","index.html"})
    public String listofOwners(){
        return "owner/index";
    }
}
