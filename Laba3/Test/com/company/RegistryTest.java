package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class RegistryTest {
    Registry registry = new Registry();
    @Test
    void testReg() {
    }

    @Test
    void testReg1() {
    }

    @BeforeEach
    void setUp() {
        registry.passTicket(passType.AmountSki, Privilage.VIP, "Sergey", "Bog", new GregorianCalendar(), 14);
        registry.passTicket(passType.PeriodSki, Privilage.Default, "Lol", "kek", new GregorianCalendar(), 32);
        registry.passTicket(passType.AmountSki, Privilage.Benefits, "AlIStex", "Lol", new GregorianCalendar(), 34);
        registry.passTicket(passType.PeriodSki, Privilage.VIP, "Boris", "Hell", new GregorianCalendar(), 14);

    }

    @Test
    void pass() {
    }

    @Test
    void createPPass() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.add(GregorianCalendar.DAY_OF_MONTH, 100);
        PeriodSkiPass pass = new PeriodSkiPass("@" + ("Lol".hashCode() + "kek".hashCode()), Privilage.Default, "Lol", "kek", new GregorianCalendar(), calendar);
        assertEquals(pass, Registry.CreateAmountSkiPass(Privilage.Default, "Lol", "kek", new GregorianCalendar(), 100));

    }

    @Test
    void createNPass() {
    }

    @Test
    void reg() {
        Registry.initialized.add(new AmountSkiPass("@" + ("Lol".hashCode() + "kek".hashCode()), Privilage.Default, "Lol", "kek", new GregorianCalendar(), 20));
        assertEquals("@" + ("DAS".hashCode() + "kek".hashCode()) + " ",registry.Registration());
    }

    @Test
    void testReg2() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DAY_OF_MONTH, 20);
        Registry.initialized.add(new AmountSkiPass("@" + ("Lol".hashCode() + "kek".hashCode()), Privilage.Default, "Lol", "kek", new GregorianCalendar(), 20));
        Registry.initialized_not.add(new AmountSkiPass("#" + ("Boris".hashCode() + "Jelita".hashCode()), Privilage.Default, "Lol", "kek", new GregorianCalendar(), 40));
        assertEquals("@" + ("DAS".hashCode() + "Sonne".hashCode()) + " " + "#" + ("Boris".hashCode() + "Jelita".hashCode()),registry.Registration(passType.AmountSki));
    }

    @Test
    void testReg3() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DAY_OF_MONTH, 20);
        Registry.initialized.add(new PeriodSkiPass("#" + ("Boris".hashCode() + "Jelita".hashCode()), Privilage.Default, "Boris", "Jelita", new GregorianCalendar(), calendar));
        Registry.initialized_not.add(new PeriodSkiPass("#" + ("Boris".hashCode() + "Jelita".hashCode()), Privilage.Default, "Boris", "Jelita", new GregorianCalendar(), calendar));
        assertEquals("#" + ("Boris".hashCode() + "Jelita".hashCode()) + " " + "#" + ("Boris".hashCode() + "Jelita".hashCode()),registry.Registration("#" + ("Boris".hashCode() + "Jelita".hashCode())) );
    }
}