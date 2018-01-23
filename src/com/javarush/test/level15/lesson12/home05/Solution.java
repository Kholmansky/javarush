package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

import com.javarush.test.level06.lesson08.task05.StringHelper;

public class Solution {
    public Solution(Object p1)
    {

    }
    public Solution(String p2)
    {

    }
    public Solution(Integer p3)
    {

    }
    protected Solution (Character pro1)
    {

    }
    protected Solution (int pro2)
    {

    }protected Solution (double pro3)
    {

    }
    private Solution(Number priv1)
    {

    }
    private Solution(Double priv2)
    {

    }
    private Solution(Short priv3)
    {

    }

    Solution(boolean def1) {
    }

    Solution(Byte def2) {
    }

    Solution(long def3) {
    }

}

