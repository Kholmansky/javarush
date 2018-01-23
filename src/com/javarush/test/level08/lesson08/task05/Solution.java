package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String,String> map = createMap();
        removeTheFirstNameDuplicates(map);
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String, String>();
        int coount = 0;
        for(int i = 0; i<10; i++)
        {
            String name = "name" + Integer.toString(i);
            if(coount%2==0)
            {
                name = "name";
            }

            map.put("fam" + Integer.toString(i), name);
            coount++;

        }
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        ArrayList<String> keyList = new ArrayList<String>();

        for (Map.Entry<String,String> pair: map.entrySet())
        {
            String key = pair.getKey();
            keyList.add(key);
        }

        for(int i = 0; i < keyList.size(); i++)
        {
            for (int j = i + 1; j < keyList.size(); j++)
            {
                if (map.get(keyList.get(i))==(map.get(keyList.get(j))))
                {
                    removeItemFromMapByValue(map, map.get(keyList.get(i)));
                }
            }

        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
