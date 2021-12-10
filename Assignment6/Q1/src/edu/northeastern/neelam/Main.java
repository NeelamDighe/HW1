package edu.northeastern.neelam;

import java.text.ParseException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws ParseException {
        List<Student>studentsList = new ArrayList<Student>();

        Date birthDAte =new SimpleDateFormat("yyyy-MM-dd").parse("1991-03-14");
        studentsList.add(new Student (1, "Neelam",3.8,birthDAte));

        Date birthDate1 = new SimpleDateFormat("yyyy-MM-dd").parse("1993-07-01");
        studentsList.add(new Student(2,"Sujay",4.0,birthDate1));

        Date birthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("1991-06-09");
        studentsList.add(new Student(3,"Akhil",3.9,birthDate2));

        Date birthDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("1992-12-31");
        studentsList.add(new Student(4,"Sanjana", 3.8, birthDate3));

        Date birthDate4 = new SimpleDateFormat("yyyy-MM-dd").parse("1991-08-31");
        studentsList.add(new Student(5, "Nick", 3.7, birthDate4));

        Collections.sort(studentsList, new Name());
        for(Student sd1: studentsList){
            System.out.println(sd1.getName());
        }

        Collections.sort(studentsList, new GPA());
        for(Student sd1: studentsList){
            System.out.println(sd1.getGpa());
        }

        Collections.sort(studentsList, new DateOfBirth());
        for(Student sd1 : studentsList){
            System.out.println(sd1.getDateofBirth());
        }

    }
}