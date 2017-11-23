package org.GMaster.server.Character.race;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(path = "/api/races")
public class RaceService {

    List<Race> Races = Race.getSampleList();

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Race> getRacesList(){
        return Races;
    }
}
