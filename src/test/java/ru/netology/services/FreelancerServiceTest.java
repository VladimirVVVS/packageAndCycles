package ru.netology.services;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerServiceTest {
    @Test

    public void testCalculateRest1() {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate(10_000, expenses: 3_000, threshold: 20_000);
        int expected = 3;

        AssertionsEquals(expected, actual);
    }

    @Test

    public void testCalculateRest2() {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate(100_000, expenses: 60_000, threshold: 150_000);
        int expected = 2;

        AssertionsEquals(expected, actual);
        }
    }