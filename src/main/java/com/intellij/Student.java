package com.intellij;

import java.util.Objects;

public class Student {
    private String name;
    private int studentYear;


    public Student(String name, int studentYear) {
        this.name = name;
        this.studentYear = studentYear;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int studentYear) {
        this.studentYear = studentYear;
    }

    public String getName() {
        return name;
    }

    public int getStudentYear() {
        return studentYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentYear == student.studentYear && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentYear);
    }
}
