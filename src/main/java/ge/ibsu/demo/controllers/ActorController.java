package ge.ibsu.demo.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ge.ibsu.demo.dto.Actor;
import ge.ibsu.demo.repositories.ActorRepository;

public class ActorController {

    
 @Autowired
    private ActorRepository actorRepository;

    @GetMapping("/names")
    public List<ActorController> getAllActorNames() {
        List<Actor> actors = actorRepository.findAll();
        return actors.stream()
                .map(actor -> new ActorDTO(actor.getFirstName(), actor.getLastName()))
                .collect(Collectors.toList());
    }

}
