package org.coderetreat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class CellTest {
    @Test
    public void cell_without_neighbour_should_die() {
        final Cell cell = Cell.Alive;
        int aliveNeighbours = 0;
        Cell newCell = cell.evolve(aliveNeighbours);
        assertEquals(Cell.Dead, newCell);
    }
}
