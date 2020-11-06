package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import java.util.Date;

public class Application {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = {"bbbb", 
                "Estonia", 
                "Latvia", 
                "Lithuania", 
                "Armenia", 
                "Azerbaijan", 
                "Georgia", 
                "Republic of Abkhazia", 
                "Republic of Artsakh", 
                "South Ossetia", 
                "Belarus", 
                "Moldova", 
                "Russia", 
                "Ukraine", 
                "Transnistria", 
                "Austri", 
                "Croatia", 
                "Czech Republic", 
                "Poland", 
                "Romania", 
                "Slovakia",};

	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = {
                new Human("Jim", new Date(1971, 1, 1)),
                new Human("Pam", new Date(1982, 1, 1)),
                new Human("Dwight", new Date(2001, 1, 1)),
                new Human("Kelly", new Date(2020, 1, 1)),
                new Human("Phyllis", new Date(1995, 1, 1)),
                new Human("Michael", new Date(1986, 1, 1)),
                new Human("Jan", new Date(1970, 1, 1)),
                new Human("Mr California", new Date(1982, 1, 1)),
                new Human("Stanley", new Date(1990, 1, 1)),
                new Human("Kelly", new Date(2020, 1, 30)), //чуть выше другая Келли
                new Human("Oscar", new Date(1986, 1, 1)),
                new Human("Angela", new Date(1981, 1, 1)),
                new Human("Ryan", new Date(1977, 1, 1)),
                new Human("Creed", new Date(1991, 1, 1)),
                new Human("Meredith", new Date(1994, 1, 1)),
                new Human("Kevin", new Date(1973, 1, 1)),
                new Human("Roy", new Date(1993, 1, 1)),
                new Human("Andy", new Date(1988, 1, 1)),
                new Human("Darryl", new Date(1969, 1, 1)),
                new Human("Erin", new Date(1972, 1, 1))
            };

        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new Sorting();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new Compy();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);
        for(Person p : persons){
            System.out.println(p.getName()+" "+p.getBirthDate()+"; ");
        }
        System.out.println("END OF SORTING PERSONS");

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);
        for(String s : strings){
            System.out.println(s+"; ");
        }
        System.out.println("END OF SORTING STRINGS");

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
        for(String s : strings){
            System.out.println(s+"; ");
        }
        System.out.println("END OF SORTING STRINGS WITH COMPARATOR");
    }
}
