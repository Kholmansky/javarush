package com.javarush.test.level15.lesson12.home04;

/**
 * Created by maximkholmansky on 25/10/16.
 */
public class Sun implements Planet
{
    private static Sun instance;

    private Sun() {
    }
    public static Sun getInstance()
    {
        if (instance == null)
        {
            instance = new Sun();
        }
        return instance;
    }

}
