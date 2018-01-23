package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandFather1 = new Human("Ded1", true, 80, null, null);
        Human grandFather2 = new Human("Ded2", true, 80, null, null);
        Human grandMother1 = new Human("Baba", false, 70, null, null);
        Human grandMother2 = new Human("Baba2", false, 70, null, null);
        Human father = new Human("Papa", true, 45, grandFather1, grandMother1);
        Human mother = new Human("Mama", false, 35, grandFather2, grandMother2);
        Human child1 = new Human("Detka1", false, 20, father, mother);
        Human child2 = new Human("Detka2", true, 18, father, mother);
        Human child3 = new Human("Detka2", false, 10, father, mother);

        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human
    {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public Human mother;
        public Human father;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.mother=mother;
            this.father=father;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
