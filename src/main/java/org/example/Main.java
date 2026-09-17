package org.example;

public class Main {

    public static void main(String[] args) {
        Simulation renderer = new Simulation();
        GameMap gameMap = new GameMap();
        renderer.render(gameMap);
    }
}