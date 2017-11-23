package org.GMaster.server.Character.Base;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/character")
public class CharacterService {

    @RequestMapping(method = RequestMethod.GET, value ="/1")
    public Character getMockCharacter(){
        return new Character("mock",1,"mock","mock","mock","mock","mock","mock","mock","mock",1,1,"mock","mock");
    }

}
