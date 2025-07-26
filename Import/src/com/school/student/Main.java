package com.school.student;

import static com.school.student.Sample.schoolInfo;
// import static members
import static com.school.student.Sample.schoolName;

public class Main {
    public static void main(String[] args) {
    	Sample s = new Sample();
        s.showInfo();

        // Using static import
        System.out.println("School: " + schoolName);
        schoolInfo();
    }
}
