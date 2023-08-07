package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    CashbackHackService cashback = new CashbackHackService();

    @Test
    void shouldAmountEqual1000() {
        int amount = 1000;

        int expected =0;
git status        int actual = cashback.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    void shouldAmountAbove1000() {
        int amount = 1200;

        int expected =800;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAmountBelow1000() {
        int amount = 800;

        int expected =200;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }
}