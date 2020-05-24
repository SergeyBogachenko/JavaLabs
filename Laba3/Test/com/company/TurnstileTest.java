package com.company;

import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class TurnstileTest {

    @Test
    void main() {
    }

    @Test
    void entry() {
        Turnstile tur = new Turnstile();
        Registry.passTicket(passType.PeriodSki, Privilage.Benefits, "Sergey", "Bog", new GregorianCalendar(), 20);
        assertEquals(true, tur.Entry("@" + ("Sergey".hashCode() + "Bog".hashCode())));
    }

    @Test
    void check() {
        Turnstile tur = new Turnstile();
        String ID = "@" + ("Alex".hashCode() + "Sel".hashCode());
        AmountSkiPass c = new AmountSkiPass(ID, Privilage.Benefits, "Sergey", "Bog", new GregorianCalendar(), 30);
        assertEquals(true, tur.Check(c));
    }
}