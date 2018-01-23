package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        Set<String> set = new HashSet<String>();
        set.add("Ла");
        set.add("Лац");
        set.add("Лацвй");
        set.add("Лавмы");
        set.add("Лаывмч");
        set.add("Лаячсмя");
        set.add("Лафячф");
        set.add("Ламвмртнонгл");
        set.add("Лашгшдлдо");
        set.add("Лабобол");
        set.add("Лбббброьа");
        set.add("Лвненоа");
        set.add("Лора");
        set.add("Лрерка");
        set.add("Лщюща");
        set.add("Лщющгшга");
        set.add("Люлдюа");
        set.add("Ллдюга");
        set.add("Люггща");
        set.add("Лгщгеа");

        return (HashSet<String>) set;
    }
}
