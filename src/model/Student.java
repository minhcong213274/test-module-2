package model;

import java.io.Serializable;

public class Student implements Serializable {
    private int idStudent;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double averageScore;

    public Student(int idStudent, String name, int age, String gender, String address, double averageScore) {
        this.idStudent = idStudent;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.averageScore = averageScore;
    }

    public Student() {
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
