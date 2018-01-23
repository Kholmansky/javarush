package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Cat cat1=new Cat("Cat1");
        Cat cat2=new Cat("Cat2");
        Cat cat3=new Cat("Cat3");
        Cat cat4=new Cat("Cat4");
        Cat cat5=new Cat("Cat5");
        Cat cat6=new Cat("Cat6");
        Cat cat7=new Cat("Cat7");
        Cat cat8=new Cat("Cat8");
        Cat cat9=new Cat("Cat9");
        Cat cat10=new Cat("Cat10");

        Map<String,Cat> catmap = new HashMap<String, Cat>();
        catmap.put(cat1.name.toString(),cat1);
        catmap.put(cat2.name.toString(),cat2);
        catmap.put(cat3.name.toString(),cat3);
        catmap.put(cat4.name.toString(),cat4);
        catmap.put(cat5.name.toString(),cat5);
        catmap.put(cat6.name.toString(),cat6);
        catmap.put(cat7.name.toString(),cat7);
        catmap.put(cat8.name.toString(),cat8);
        catmap.put(cat9.name.toString(),cat9);
        catmap.put(cat10.name.toString(),cat10);

        return catmap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<Cat>();
        for(Map.Entry<String,Cat> pair: map.entrySet())
        {
            Cat c =pair.getValue();
            cats.add(c);
        }

        return cats;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
