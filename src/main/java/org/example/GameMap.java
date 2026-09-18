package org.example;

import org.example.Entites.Entity;

import java.util.HashMap;

public class GameMap {
    public HashMap<Coordinates, Entity> entities = new HashMap<>();
    public HashMap<Coordinates, Entity> predators = new HashMap<>();
    public HashMap<Coordinates, Entity> herbivores = new HashMap<>();



    public void setEntities(Coordinates coordinates, Entity entity) {
        entity.coordinates = coordinates;
        entities.put(coordinates, entity);
    }

    public Entity getEntity(Coordinates coordinates) {
        return entities.get(coordinates);
    }

    public boolean isCellEmpty(Coordinates coordinates) {
        return !entities.containsKey(coordinates);
    }

}
