package com.sparta.week01;

public class Course {

    private String title;
    private String tutor;
    private int days;

    public Course(){}

    public Course(String title, String tutor, int days)
    {
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setTutor(String tutor){
        this.tutor = tutor;
    }

    public void setDays(int days){
        this.days = days;
    }

    public String getTitle(){
        return this.title;
    }

    public String getTutor(){
        return this.tutor;
    }

    public int getDays(){
        return this.days;
    }
}
