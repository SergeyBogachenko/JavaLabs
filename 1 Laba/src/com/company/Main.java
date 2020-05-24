package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }


    public int Program(int m){
        int a = m;
        int res = 0;
        int amount = 0;
        for(int i = 0; i <= a; i++){
            if(isPrime(i))
            {
                int pres=i;
                int pamount = 0;
                int c = i;
                while(c!=0){
                    int b = c%2;
                    if(b==1)
                        pamount++;
                    c = c/2;
                }
                if(pamount > amount){
                    res = pres;
                    amount = pamount;
                }
            }

        }
        System.out.println("Число с найбольшим количеством единиц: " + res + " количество единиц: " + amount);
        return res;
    }

    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2== 0 || i %3 == 0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n == 0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }


    public boolean isPrime(int n)
    {

        if (n <= 1) return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
