package org.example;

import org.example.Entites.Herbivore;
import org.example.Entites.Predator;

public class Main {

    public static void main(String[] args) {
        Simulation renderer = new Simulation();
        GameMap gameMap = new GameMap();
        Coordinates coordinates = new Coordinates(1,1);
        Herbivore herbivore = new Herbivore(1,1,coordinates);
        Predator predator = new Predator(1,1,coordinates);
        renderer.render(gameMap,herbivore,predator);
    }
}