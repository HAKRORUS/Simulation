package org.example;

import java.util.Objects;

public class Coordinates {
    public final Integer xCord, yCord;

    public Coordinates(Integer xCord, Integer yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinates)) return false;
        Coordinates that = (Coordinates) o;
        return xCord == that.xCord && yCord == that.yCord;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCord, yCord);
    }

    @Override
    public String toString() {
        return "(" + xCord + ", " + yCord + ")";
    }

    public boolean canShift(CoordinatesShift shift) {
        int x = xCord + shift.xShift;
        int y = yCord + shift.yShift;

        if ((x < 1) || (x > 10)) return false;
        if ((y < 1) || (y > 15)) return false;

        return true;
    }

    public Coordinates shift(CoordinatesShift shift) {
        return new Coordinates(xCord + shift.xShift, yCord +shift.yShift);
    }
}
