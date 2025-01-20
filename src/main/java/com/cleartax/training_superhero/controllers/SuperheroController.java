package com.cleartax.training_superhero.controllers;

import com.cleartax.training_superhero.dto.Superhero;
import com.cleartax.training_superhero.dto.SuperheroRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import com.cleartax.training_superhero.services.SuperheroServices;

@RestController
@Component
public class SuperheroController {
    private static final String GREETING_FORMAT = "Hello, %s!";
    private static final String DEFAULT_GREETING_USERNAME = "World";
    private static final String DEFAULT_SUPERHERO_UNIVERSE = "Marvel";

    private final SuperheroServices superheroService;
    @Autowired
    public SuperheroController(SuperheroServices superheroService) {
        this.superheroService = superheroService;
    }


    @GetMapping("/hello")
    public String getGreeting(@RequestParam(value = "username", defaultValue = DEFAULT_GREETING_USERNAME) String username) {
        return formatMessage(GREETING_FORMAT, username);
    }

    @GetMapping("/superhero")
    public Superhero getSuperhero(@RequestParam(value = "name", defaultValue = "Batman") String name,
                                  @RequestParam(value = "universe", defaultValue = "DC") String universe){
        return superheroService.getSuperhero(name, universe);
    }

    @PostMapping("/superhero")
    public Superhero persistSuperhero(@RequestBody SuperheroRequestBody superhero){
        return superheroService.persistSuperhero(superhero);
    }

    @PutMapping("/superhero/{id}")
    public Superhero updateSuperhero(@PathVariable("id") String id, @RequestBody SuperheroRequestBody superhero) {
        return superheroService.updateSuperhero(id, superhero);
    }

    @DeleteMapping("/superhero/{id}")
    public void deleteSuperhero(@PathVariable("id") String id) {
        superheroService.deleteSuperhero(id);
    }

    private String formatMessage(String format, String value)
    {
        return String.format(format, value);
    }
}
