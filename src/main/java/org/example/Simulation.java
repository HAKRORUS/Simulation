package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Simulation {

    public static final String deer = "\uD83E\uDD8C";
    public static final String tree = "\uD83C\uDF33";
    public static final String rock = "\uD83E\uDEA8";
    public static final String grass = "\uD83C\uDF31";



    public void render() {
        List<Predator> predators = new ArrayList<>();
        List<Coordinates> coordinates = new ArrayList<>();

        int num = (int) (Math.random() * (30 - 15 + 1)) + 15;
     //   Coordinates coordinates = new Coordinates(10,7);

        Predator tiger = new Predator(11,100,coordinates);

        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < 16; j++) {
                coordinates.add();
            }
        }


        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 16; j++) {
                if (i == tiger.coordinates.x && j == tiger.coordinates.y) {
                    System.out.print(" "+tiger.tiger + " ");
                } else {
                    System.out.print(" .. ");
                }
            }
            System.out.println();
        }
    }
}