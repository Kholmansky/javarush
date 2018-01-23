package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("Alex","Strom");
        map.put("Max","Holms");
        map.put("Andrey","Sukin");
        map.put("Vlad","Topoev");
        map.put("Artem","Livin");
        map.put("Pavel","Braga");
        map.put("Frik","Rose");
        map.put("Aiphone","Super");
        map.put("Mila","Iovovich");
        map.put("Alisa", "Sexy");
        return (HashMap<String,String>)map;



    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;
        for (String tmp : map.values())
        {
            if(name.equals(tmp))
            {
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //напишите тут ваш код
        return map.containsKey(familiya) ? 1 : 0;
    }
}
