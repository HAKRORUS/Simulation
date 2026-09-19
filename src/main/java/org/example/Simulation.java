package org.example;

import org.example.Entites.*;

import java.util.List;

public class Simulation {


    public void render(GameMap gameMap, Herbivore herbivore, Predator predator) {


        if (gameMap.entities.isEmpty()) {
            startingCountOfEntities(gameMap);
        }

 //       for (int i = 0; i < 2; i++) {

        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 16; y++) {

                Coordinates coordinates = new Coordinates(x, y);


                if (gameMap.isCellEmpty(coordinates)) {
                    System.out.print(" .. ");
                } else {
                    System.out.print(" " + getEntitySprite(gameMap.getEntity(coordinates)) + " ");
                }
            }
                System.out.println();
            }
        herbivore.makeMove();
        predator.makeMove();
 //       }
    }

    public void startingCountOfEntities(GameMap gameMap) {
        int numberOfPredators = (int) (Math.random() * (15 - 10 + 1)) + 10;
        int numberOfHerbivore = (int) (Math.random() * (15 - 10 + 1)) + 10;
        int numberOfGrass = (int) (Math.random() * (15 - 10 + 1)) + 10;
        int numberOfRock = (int) (Math.random() * (5 - 1 + 1)) + 1;
        int numberOfTree = (int) (Math.random() * (5 - 1 + 1)) + 1;


        for (int i = 0; i < numberOfPredators; i++) {

            Coordinates coordinates = new Coordinates((int) (Math.random() * (10)) + 1,(int) (Math.random() * (15)) + 1);

            if (!gameMap.isCellEmpty(coordinates)) {
                i--;
            } else {;
                gameMap.entities.put(coordinates, new Predator(1,1,coordinates));
                gameMap.predators.put(coordinates, new Predator(1,1,coordinates));
            }
        }

        for (int i = 0; i < numberOfHerbivore; i++) {

            Coordinates coordinates = new Coordinates((int) (Math.random() * (10)) + 1,(int) (Math.random() * (15)) + 1);

            if (!gameMap.isCellEmpty(coordinates)) {
                i--;
            } else {
                gameMap.entities.put(coordinates,new Herbivore(1,1,coordinates));
                gameMap.herbivores.put(coordinates,new Herbivore(1,1,coordinates));
            }
        }
        for (int i = 0; i < numberOfGrass; i++) {

            Coordinates coordinates = new Coordinates((int) (Math.random() * (10)) + 1,(int) (Math.random() * (15)) + 1);

            if (!gameMap.isCellEmpty(coordinates)) {
                i--;
            } else {
                gameMap.entities.put(coordinates,new Grass(coordinates));
            }
        }
        for (int i = 0; i < numberOfTree; i++) {

            Coordinates coordinates = new Coordinates((int) (Math.random() * (10)) + 1,(int) (Math.random() * (15)) + 1);

            if (!gameMap.isCellEmpty(coordinates)) {
                i--;
            } else {
                gameMap.entities.put(coordinates,new Tree(coordinates));
            }
        }
        for (int i = 0; i < numberOfRock; i++) {

            Coordinates coordinates = new Coordinates((int) (Math.random() * (10)) + 1,(int) (Math.random() * (15)) + 1);

            if (!gameMap.isCellEmpty(coordinates)) {
                i--;
            } else {
                gameMap.entities.put(coordinates,new Rock(coordinates));
            }
        }
    }



    public String getEntitySprite(Entity entity) {
        return switch (entity.getClass().getSimpleName()) {
            case "Predator" -> "\uD83D\uDC05";
            case "Grass" -> "\uD83C\uDF31";
            case "Herbivore" -> "\uD83E\uDD8C";
            case "Rock" -> "\uD83D\uDDFB";
            case "Tree" -> "\uD83C\uDF33";
            default -> "";
        };
    }
}