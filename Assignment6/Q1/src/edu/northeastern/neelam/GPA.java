package edu.northeastern.neelam;

import java.util.Comparator;

    public class GPA implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o2.getGpa(),o1.getGpa());
        }

}
