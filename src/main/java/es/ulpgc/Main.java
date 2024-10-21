package es.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person jeronimo = new Person("Jerónimo", LocalDate.of(2002, 10, 22));
        System.out.println(jeronimo);
    }
}
