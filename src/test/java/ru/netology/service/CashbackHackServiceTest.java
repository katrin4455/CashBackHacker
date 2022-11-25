package ru.netology.service;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void boundary() {
        int amount = 1000;
        int expected = 0;
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

