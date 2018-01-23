package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        Random rand = new Random();
        Set<Integer> set=new HashSet<Integer>();
        for(int i =0;i<20;i++)
        {
            set.add(rand.nextInt());
        }
        return (HashSet<Integer>) set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        Set<Integer> newset=new HashSet<Integer>();
        for (int i:set)
        {
            if(i<10)
            {
                newset.add(i);
            }

        }
        return (HashSet<Integer>)newset;

    }
}
