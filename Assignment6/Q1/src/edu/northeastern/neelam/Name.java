package edu.northeastern.neelam;

import java.util.Comparator;

public class Name implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}