package org.example;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Simulation {

    public static final String tiger = "\uD83D\uDC05";
    public static final String deer = "\uD83E\uDD8C";
    public static final String tree = "\uD83C\uDF33";
    public static final String rock = "\uD83E\uDEA8";
    public static final String grass = "\uD83C\uDF31";



    public void render() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("..  ");
                Coordinates coordinates = new Coordinates(i,j);

            }
            System.out.println();
        }
    }
}