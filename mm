package com.company;

import com.sun.org.apache.xml.internal.security.keys.storage.StorageResolver;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	for(int i=0;i<1000;i++)
	{
        Thread1 Thread = new Thread1();
        Thread.start();
        try{ Thread.join();}
        catch(Exception Error228){
            System.out.println("Mistake");
        }

    }
        System.out.println(Thread1.Privat24.Storage());
    }
}
class Bank {
    ArrayList<Account>AllAccounts = new ArrayList<Account>();
    public Bank(){
        CreateNewRandomAccount();
       System.out.println(Storage());
    }
    public void CreateNewRandomAccount()
    {
        int ID=0;
        for(int i=0;i<1000;i++)
        {
            int moneyammount;
            moneyammount=(int)(Math.random()*20000);
            Account account228 = new Account(ID,moneyammount,false);
            AllAccounts.add(account228);
            ID++;
        }
    }
    public void transfer(Account Account1,Account Account2,int amount)
    {
        if(Account1.AccountIsBlocked==false&&Account2.AccountIsBlocked==false) {
            Account1.AccountIsBlocked = true;
            Account2.AccountIsBlocked = true;
            Account1.Balance = Account1.Balance - amount;
            Account2.Balance = Account2.Balance + amount;
            Account1.AccountIsBlocked = false;
            Account2.AccountIsBlocked = false;
        }

    }
    public Account PickedRandomlyAccount()
    {
        AllAccounts.size();
      int randompickedaccount;
      randompickedaccount=(int)(Math.random()*AllAccounts.size());
      return AllAccounts.get(randompickedaccount);
    }
    public int Storage()
    { int sum=0;int amount=0;
        for (Account AccountTest:AllAccounts)
        {
           amount = AccountTest.Balance ;
           sum=sum+amount;
        }
        return sum;
    }
}
class Account {
    int ID;
    int Balance;
    boolean AccountIsBlocked;
    public Account(int ID,int Balance,boolean AccountIsBlocked)
    {
     this.ID=ID;
     this.Balance=Balance;
     this.AccountIsBlocked=AccountIsBlocked;
    }
}
class Thread1 extends Thread {
    static Bank Privat24 = new Bank();
    ArrayList<Account>AllAccounts = new ArrayList<Account>();
    public void run(){
       Account AccountFirst = Privat24.PickedRandomlyAccount();
       Account AccountSecond = Privat24.PickedRandomlyAccount();
       int moneyammount=(int)(Math.random()*20000);
       Privat24.transfer(AccountFirst, AccountSecond,moneyammount);
    }

}
