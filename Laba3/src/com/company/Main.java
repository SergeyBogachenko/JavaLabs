package com.company;

import java.util.GregorianCalendar;


public class Main {

    public static void main(String[] args) {
        Card c = new Card("10000", Privilage.VIP, "Sergey", "Bog", new GregorianCalendar());
        AmountSkiPass b = new AmountSkiPass("10000", Privilage.VIP, "Sergey", "Bog", new GregorianCalendar(), 6);
        System.out.println(PeriodSkiPass.class == c.getClass());
    }
}

