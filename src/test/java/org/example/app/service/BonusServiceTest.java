package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    private BonusService service;

    @BeforeEach
    void setUp() {service = new BonusService();
    }
    @Test
    void test_Bonus_Service_With_Expected_Result(){

        assertEquals(1.5,service.calcBonus(15), 0.1);
    }

    @Test
    @DisplayName("Test unexpected result")
    void test_Bonus_Service_With_Incorrect_Price_Value(){

        assertNotEquals(2,service.calcBonus(15),0.1);

    }

    @AfterEach
    void tearDown() {
        service = null;
    }
}