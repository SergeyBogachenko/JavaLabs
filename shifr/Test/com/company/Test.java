package com.company;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ShifrProgrammeTest {

    @Test
    void encrypt() {
        String expected = "bcd";
        String Shifered = ShifrProgramme.shifr("abc", (char) 1);
        Assertions.assertEquals(expected, Shifered);

    }

    @Test
    void decrypt() {
        String expected = "aby";
        String Unshifered = ShifrProgramme.unshifr("bcz", (char) 1);
        Assertions.assertEquals(expected, Unshifered);

    }

} 