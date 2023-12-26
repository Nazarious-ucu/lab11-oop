package ua.edu.ucu.apps.task1;

import java.util.List;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString(callSuper = true)
@SuperBuilder
public class Student extends User {
    @Singular("point")
    private List<Integer> grades;
}
