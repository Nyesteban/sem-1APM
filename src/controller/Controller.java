package controller;

import exceptions.NegativeWeightExceptions;
import model.Entity;
import repository.IRepository;

import java.util.List;

public class Controller {

    IRepository repository;

    public Controller(IRepository repostory) {
        this.repository = repository;
    }

    public void add(Entity entity) {
        try {
            repository.add(entity);
        } catch (NegativeWeightExceptions e) {
            System.out.println("Negative weight error!!");
        }
    }

    public void remove(Entity entity) {
        repository.remove(entity);
    }

    public Entity[] getAll() {
        return repository.getAll();
    }

    public List<Entity> getAllWithWeightGreaterThan200() {
        return repository.getAllWithWeightGreaterThan200();
    }
}
