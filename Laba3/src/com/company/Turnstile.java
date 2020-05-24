package com.company;
import java.util.GregorianCalendar;

public class Turnstile {
    Registry registration = new Registry();
    public static void main(String[] args) {

    }

    public boolean Entry(String ID){
        for (Card RegCard : registration.cards) {
            if(ID.equals(RegCard.ID) && RegCard.getClass() == AmountSkiPass.class){
                --((AmountSkiPass) RegCard).LiftsAmount;
                Check(RegCard);
                registration.initialized.add(RegCard);
                return true;
            }else if(ID.equals(RegCard.ID) && RegCard.getClass() == PeriodSkiPass.class && ((PeriodSkiPass) RegCard).ExpirationDate.after(new GregorianCalendar())){
                Check(RegCard);
                return true;
            }else{
                registration.initialized_not.add(RegCard);
                return false;
            }
        }
        return false;
    }

    public boolean Check(Card card){
        if(card.privilage == Privilage.Benefits){
            attantion();
            return true;
        }
        return false;
    }

    private void attantion(){
        System.out.println("Check your  card info!!!!!!!");
    }
}
