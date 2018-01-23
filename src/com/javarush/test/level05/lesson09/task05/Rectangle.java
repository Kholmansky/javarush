package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    int top=0;
    int left=0;
    int width=0;
    int height=0;

    public Rectangle (int top, int left, int width, int height)
    {
        this.top=top;
        this.left=left;
        this.height=height;
        this.width=width;
    }
    public Rectangle (int top, int left)
    {
        this.top=top;
        this.left=left;

    }
    public Rectangle (int top, int left, int width)
    {
        this.top=top;
        this.left=left;
        this.height=width;
        this.width=width;
    }
    public Rectangle(Rectangle rec)
    {
        rec=this;
    }

}
