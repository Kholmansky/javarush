package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] a=new int[10];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for(int i =0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(reader.readLine());
        }
        int temp=0;
        for(int i =0;i<a.length/2;i++)
        {
            temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        for(int i =0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
