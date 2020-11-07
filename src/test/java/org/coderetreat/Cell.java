package org.coderetreat;

public enum Cell {

    Alive, Dead;

    public Cell evolve(int aliveNeighbours) {
        if(aliveNeighbours>=2) {
            return Alive;
        }
        return Dead;
    }

}
