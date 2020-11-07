package org.coderetreat;

public enum Cell {

    Alive {
        @Override
        public Cell evolve(int aliveNeighbours) {
            return aliveNeighbours == 2 || aliveNeighbours == 3
                    ? Alive
                    : Dead;
        }
    },
    Dead {
        @Override
        public Cell evolve(int aliveNeighbours) {
            return Alive;
        }
    };

    public abstract Cell evolve(int aliveNeighbours);



}
