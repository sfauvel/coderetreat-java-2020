package org.coderetreat;

public enum Cell {

    Alive, Dead;

    public Cell evolve(int aliveNeighbours) {
        return Dead;
    }

}
