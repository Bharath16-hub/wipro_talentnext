package oops_Inheritance;

import java.util.*;

public class Question_19 {

    public static void main(String[] args) {
        String names[] = new String[5];

        Optional<String> firstElement = Optional.ofNullable(names[0]);

        if (firstElement.isPresent()) {
            System.out.print(firstElement.get().length());
        } else {
            System.out.print("First element is null, cannot get length.");
        }
    }
}