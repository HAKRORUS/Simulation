package org.example.Entites;

import org.example.Coordinates;
import org.example.CoordinatesShift;
import org.example.GameMap;

import java.util.ArrayList;
import java.util.List;

public class Herbivore extends Creature {
    public Herbivore(int speed, int hp, Coordinates coordinates) {
        super(speed,hp, coordinates);
    }

    @Override
    public Coordinates makeMove(GameMap gameMap) {
        List<CoordinatesShift> result = new ArrayList<>();

        for (int xShift = -1; xShift <= 1; xShift++) {
            for (int yShift = -1; yShift <= 1; yShift++) {
                if (yShift == 0 && xShift == 0) {
                    continue;
                }
                result.add(new CoordinatesShift(xShift,yShift));
            }
        }
        int randomMove = (int) (Math.random() * result.size());
        while (coordinates.canShift(result.get(randomMove)) && gameMap.isCellEmptyForMove(result.get(randomMove))) {
        }
            return new Coordinates(x);
    }
}
