package org.coderetreat;

public enum Cell {

    Alive, Dead;

    public Cell evolve(int aliveNeighbours) {

        return aliveNeighbours == 2 || aliveNeighbours == 3
                ? Alive
                : Dead;
    }

}
