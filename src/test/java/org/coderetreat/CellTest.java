package org.coderetreat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class CellTest {
    @Test
    public void cell_without_neighbour_should_die() {
        assertNextState(0, Cell.Dead);
    }

    @Test
    public void cell_with_2_neighbours_should_stay_alive() {
        assertNextState(2, Cell.Alive);
    }

    @Test
    public void cell_with_3_neighbours_should_stay_alive() {
        assertNextState(3, Cell.Alive);
    }

    private void assertNextState(int aliveNeighbours, Cell expectedCell) {
        final Cell cell = Cell.Alive;
        Cell newCell = cell.evolve(aliveNeighbours);
        assertEquals(expectedCell, newCell);
    }
}
