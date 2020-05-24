package com.company;
import java.util.*;

public class Registry {
    static ArrayList<Card> blocked = new ArrayList<>();
    static ArrayList<Card> cards = new ArrayList<Card>();
    static ArrayList<Card> initialized_not = new ArrayList<>();
    static ArrayList<Card> initialized = new ArrayList<>();

    public static void passTicket(passType passType, Privilage privilage, String Name, String Surname, GregorianCalendar date, int num){
        if(passType == passType.AmountSki){
            cards.add(CreatePeriodSkiPass(privilage, Name, Surname, date, num));
        } else{
            cards.add(CreateAmountSkiPass(privilage, Name, Surname, date, num));
        }
    }
    public static PeriodSkiPass CreateAmountSkiPass(Privilage privilage, String Name, String Surname, GregorianCalendar date, int num){
        String ID = "@" + (Name.hashCode() + Surname.hashCode());
        System.out.println(ID);
        GregorianCalendar calendar = date;
        calendar.add(Calendar.DAY_OF_MONTH, num);
        PeriodSkiPass pass = new PeriodSkiPass(ID, privilage, Name, Surname, date, calendar);
        return pass;

    }

    public static AmountSkiPass CreatePeriodSkiPass(Privilage privilage, String Name, String Surname, GregorianCalendar date, int num) {
        String ID = "@" + (Name.hashCode() + Surname.hashCode());
        AmountSkiPass pass = new AmountSkiPass(ID, privilage, Name, Surname, new GregorianCalendar(), num);
        return pass;
    }

    private Card CardInfo(String ID){
        for (Card c: cards) {
            if(ID == c.ID){
                return c;
            }
        }
        return null;
    }

    public void Block(String ID){
        for (Card c: cards) {
            if(ID == c.ID){
                blocked.add(c);
                cards.remove(c);
            }
        }
    }

    public String Registration(){
        String initializedIn = "";
        String initializedOut = "";
        for (Card c : initialized) {
            initializedIn += c.ID;
        }
        for (Card c : initialized_not) {
            initializedOut += c.ID;
        }
        return initializedIn + " " + initializedOut;
    }

    public String Registration(passType passType){
        String initializedIn = "";
        String initializedOut = "";
        for (Card c : initialized) {
            if(c.getClass() == AmountSkiPass.class && passType == passType.AmountSki) {
                initializedIn += c.ID;
            }else if(c.getClass() == PeriodSkiPass.class && passType == passType.PeriodSki)
                initializedIn += c.ID;
        }
        for (Card c : initialized_not) {
            if(c.getClass() == AmountSkiPass.class && passType == passType.AmountSki) {
                initializedOut += c.ID;
            }else if(c.getClass() == PeriodSkiPass.class && passType == passType.PeriodSki)
                initializedOut += c.ID;
        }
        return initializedIn + " " + initializedOut;
    }

    public String Registration(String ID){
        String initializedIn = "";
        String initializedOut = "";
        for (Card c : initialized) {
            if(ID.equals(c.ID))
                initializedIn += c.ID;
        }
        for (Card c : initialized_not) {
            if(ID.equals(c.ID))
                initializedOut += c.ID;
        }
        return initializedIn + " " + initializedOut;
    }
}
