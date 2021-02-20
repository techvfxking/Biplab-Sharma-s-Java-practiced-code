package com.bs.patterns;
import java.util.*;

public class program
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        //your code goes here
        int months = 6;
        for (months = 0; months< 6; months++)
        {
            amount *= 0.9;
        }
        System.out.println(amount);
    }
}