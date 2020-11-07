package org.coderetreat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class CellTest {
    @Test
    public void alive_cell_without_neighbour_should_die() {
        assertNextState(0, Cell.Dead);
    }

    @Test
    public void alive_cell_with_2_neighbours_should_stay_alive() {
        assertNextState(2, Cell.Alive);
    }

    @Test
    public void alive_cell_with_3_neighbours_should_stay_alive() {
        assertNextState(3, Cell.Alive);
    }

    @Test
    public void alive_cell_with_4_neighbours_should_stay_die() {
        assertNextState(4, Cell.Dead);
    }

    @Test
    public void dead_cell_with_3_alive_neighbours_should_become_alive() {
        int aliveNeighbours = 3;
        final Cell cell = Cell.Dead;
        Cell newCell = cell.evolve(aliveNeighbours);
        assertEquals(Cell.Alive, newCell);
    }

    @Test
    public void dead_cell_with_0_alive_neighbour_should_stay_die() {
        int aliveNeighbours = 0;
        final Cell cell = Cell.Dead;
        Cell newCell = cell.evolve(aliveNeighbours);
        assertEquals(Cell.Dead, newCell);
    }

    private void assertNextState(int aliveNeighbours, Cell expectedCell) {
        final Cell cell = Cell.Alive;
        Cell newCell = cell.evolve(aliveNeighbours);
        assertEquals(expectedCell, newCell);
    }
}
