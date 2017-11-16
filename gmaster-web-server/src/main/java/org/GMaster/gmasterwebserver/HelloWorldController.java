package org.GMaster.gmasterwebserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/helloworld")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello, World!";
    }
}
