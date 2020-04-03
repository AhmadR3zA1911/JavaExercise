package com.JavaPractice.Session2;

import java.sql.Time;

public class Practice05Course {

    private String name ;
    private String teacherName;
    private String StartDate;
    private String EndDate;
    private String Time;

    public Practice05Course (String n)
    {
        this(n,"",null,null,null);
    }

    public Practice05Course(String name, String teacherName, String startDate, String endDate, String time) {
        this.name = name;
        this.teacherName = teacherName;
        StartDate = startDate;
        EndDate = endDate;
        Time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getName() {
        return name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getStartDate() {
        return StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public String getTime() {
        return Time;
    }
    public boolean equals (Object obj)
    {
        Practice05Course course = (Practice05Course) obj;
        if (course.StartDate==this.StartDate && course.EndDate==this.EndDate && course.Time == this.Time)
            return true;
        else  return  false;

    }


    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", StartDate='" + StartDate + '\'' +
                ", EndDate='" + EndDate + '\'' +
                ", Time='" + Time + '\'' +
                '}';
    }
}
