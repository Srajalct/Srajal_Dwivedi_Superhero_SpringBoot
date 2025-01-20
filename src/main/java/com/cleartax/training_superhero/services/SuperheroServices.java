package com.cleartax.training_superhero.services;

import com.cleartax.training_superhero.dto.Superhero;
import com.cleartax.training_superhero.dto.SuperheroRequestBody;
import com.cleartax.training_superhero.repository.SuperheroRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class SuperheroServices
{

    private final SuperheroRepository superheroRepository;

    public SuperheroServices(SuperheroRepository superheroRepository)
    {
        this.superheroRepository = superheroRepository;
    }

    public Superhero getSuperheroName(String name, String universe)
    {
        if (name != null)
        {
            return getByName(name);
        }
        else if (universe != null)
        {
            return getByUniverse(universe);
        }
        else
        {
            throw new IllegalArgumentException("Invalid input");
        }
    }

    private Superhero getByUniverse(String universe)
    {
        Superhero superhero = new Superhero();
        superhero.setUniverse("super universe");
        return superhero;
    }

    private Superhero getByName(String name)
    {
        return getDummyData(name);
    }

    private Superhero getDummyData(String name)
    {
        Superhero superhero = new Superhero();
        superhero.setName(name);
        return superhero;
    }

    public Superhero persistSuperhero(SuperheroRequestBody requestBody)
    {
        Superhero superhero = new Superhero();
        superhero.setName(requestBody.getName());
        superhero.setPower(requestBody.getPower());
        superhero.setUniverse(requestBody.getUniverse());

        return superheroRepository.save(superhero);
    }

    public Superhero updateSuperhero(String id, SuperheroRequestBody requestBody)
    {
        Optional<Superhero> existingSuperheroOpt = superheroRepository.findById(id);

        if (existingSuperheroOpt.isPresent())
        {
            Superhero existingSuperhero = existingSuperheroOpt.get();

            existingSuperhero.setName(requestBody.getName());
            existingSuperhero.setPower(requestBody.getPower());
            existingSuperhero.setUniverse(requestBody.getUniverse());

            return superheroRepository.save(existingSuperhero);
        }
        else
        {
            throw new IllegalArgumentException("Superhero with ID " + id + " not found.");
        }
    }

    public void deleteSuperhero(String id)
    {
        Optional<Superhero> superheroOpt = superheroRepository.findById(id);

        if (superheroOpt.isPresent())
        {
            superheroRepository.deleteById(id);
        }
        else
        {
            throw new IllegalArgumentException("Superhero with ID " + id + " not found.");
        }
    }

    public Superhero getSuperhero(String name, String universe) {
        Superhero superhero = new Superhero();
        superhero.setName(name);
        superhero.setUniverse(universe);
        return superhero;
    }
}

