package ru.netology.service;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    public void boundary() {
        int amount = 1000;
        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(expected,actual);

    }

    @Test
    public void boundaryUnder() {
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }
    @Test
    public void boundaryOver() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }
}

}