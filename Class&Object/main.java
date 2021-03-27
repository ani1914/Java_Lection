package com.citb408;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        /* final keyword */
        final int primitiveFinal = 100;
//         primitiveFinal = 100;
        /* Create class Author, that has id (cannot be changed after creating author),
        name and birthday */
        final Author maria = new Author(1, "Maria", LocalDate.of(2000, 8, 15));
        System.out.println("Maria's birthday: " + maria.getBirthday());

//         maria = new Author(2, "Pesho", LocalDate.of(2000, 9, 5));
        // maria.setId(primitiveFinal);

        Author sasho = new Author(7, "Sasho", LocalDate.of(2000, 2, 6));
        System.out.println("Sasho's birthday: " + sasho.getBirthday());
        sasho = maria;
        sasho.setBirthday(LocalDate.of(2000, 1, 20));
        System.out.println("Sasho's birthday: " + sasho.getBirthday());
        System.out.println("Maria's birthday: " + maria.getBirthday());

        sasho = null;
        // System.out.println("Sasho's birthday: " + sasho.getBirthday());
        sasho = new Author(3, "Sasho", LocalDate.of(2000, 10, 1));
        sasho.setBirthday(LocalDate.of(2000, 7, 2));
        System.out.println("Sasho's birthday: " + sasho.getBirthday());
        System.out.println("Maria's birthday: " + maria.getBirthday());

        /*
         * Create method in class Author that returns author's age
         * */
        Author ivan = new Author(5, "Ivan", LocalDate.of(2000, 3, 8));
        System.out.println("Author is " + ivan.age() + " years old!");

        /*
         * Find the day of the week when the author was born
         *
         * */

        System.out.println("Day of the week when " + ivan.getName() + " was born was " +
                ivan.getBirthday().getDayOfWeek());

        LocalDate springSemesterStart = LocalDate.of(2021,3,1);
        System.out.println("Spring semester starts on " + springSemesterStart);
        System.out.println("Spring semester starts on day of month " + springSemesterStart.getDayOfMonth());
        System.out.println("Spring semester starts on " + springSemesterStart.getMonth());


        // double/float problem with precision
        double accountValue = 100.74;
        System.out.println(accountValue + accountValue + accountValue);
        String accountValueString = Double.toString(accountValue);
        BigDecimal accountValueBigDecimal = BigDecimal.valueOf(100.74);
        accountValueBigDecimal = accountValueBigDecimal.add(accountValueBigDecimal).add(accountValueBigDecimal);
        System.out.println(accountValueBigDecimal);

        BigDecimal duration = BigDecimal.valueOf(100.74);
        System.out.println("Duration = " + duration);
        System.out.println("Duration + 50 = " + duration.add(BigDecimal.valueOf(50)));
        System.out.println("Duration - 100 = " + duration.subtract(BigDecimal.valueOf(100)));
        System.out.println("Duration * 3 = " + duration.multiply(BigDecimal.valueOf(3)));
        System.out.println("Duration / 2 = " + duration.divide(BigDecimal.valueOf(2)));



    }
}
