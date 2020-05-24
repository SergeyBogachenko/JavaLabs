package com.company;
import java.util.GregorianCalendar;

enum Privilage {
    Default(1),
    Benefits(0.8f),
    VIP(2);
    private float changed;
    Privilage(float changed){
        this.changed = changed;
    }
    public float getChanged(){return changed;}
}
enum passType {
    AmountSki,
    PeriodSki
}
public class Card {
    String ID;
    String Name;
    String Surname;
    GregorianCalendar Begin;
    Privilage privilage;
    public Card(String id, Privilage privilage, String Name, String Surname, GregorianCalendar Begin){
        ID = id;
        this.privilage = privilage;
        this.Name = Name;
        this.Surname = Surname;
        this.Begin = Begin;
    }
}
class AmountSkiPass extends Card{
        int LiftsAmount;

public AmountSkiPass(String id, Privilage prior, String Name, String Surname, GregorianCalendar Begin, int number){
        super(id, prior, Name, Surname, Begin);
        LiftsAmount = number;
        }
}
class PeriodSkiPass extends Card{
    GregorianCalendar ExpirationDate;

    public PeriodSkiPass(String id, Privilage prior, String Name, String Surname, GregorianCalendar Begin, GregorianCalendar date){
        super(id, prior, Name, Surname, Begin);
        ExpirationDate = date;
    }
}
