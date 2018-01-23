package com.javarush.test.level15.lesson12.home05;

/**
 * Created by maximkholmansky on 25/10/16.
 */
public class SubSolution extends Solution
{
    public SubSolution(Object p1)
    {
        super(p1);
    }

    public SubSolution(String p2)
    {
        super(p2);
    }

    public SubSolution(Integer p3)
    {
        super(p3);
    }

    protected SubSolution(Character pro1)
    {
        super(pro1);
    }

    protected SubSolution(int pro2)
    {
        super(pro2);
    }

    protected SubSolution(double pro3)
    {
        super(pro3);
    }

    private SubSolution(Number priv1)
    {
        super(priv1);

    }
    private SubSolution(Double priv2)
    {
        super(priv2);
    }
    private SubSolution(Short priv3)
    {
        super(priv3);
    }

    SubSolution(boolean def1)
    {
        super(def1);
    }

    SubSolution(Byte def2)
    {
        super(def2);
    }

    SubSolution(long def3)
    {
        super(def3);
    }
}
