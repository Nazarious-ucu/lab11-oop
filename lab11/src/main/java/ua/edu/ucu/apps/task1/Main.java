package ua.edu.ucu.apps.task1;

import java.util.Arrays;

public class Main {
 public static void main(String[] args) {
        User user = Student.builder().name("Nazar")
                                .age(18)
                                .gender("m")
                                .point(100)
                                .point(85)
                                .grades(Arrays.asList(60, 100))
                                .build();
        System.out.println(user);
    }
}
