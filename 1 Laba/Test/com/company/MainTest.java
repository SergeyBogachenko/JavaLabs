package com.company;
        import org.junit.Test;

        import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void program() {
        Main main = new Main();
        assertEquals(31, main.Program(100));
    }

    @Test
    public void isPrime() {
        Main main = new Main();
        assertEquals(main.isPrime(11), true);
    }
}