package com.smartschool.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

@Entity
@Table(name = "massages")
public class Pisma {
    @Id
    @GeneratedValue
    private int massage_id;

    private int teacher_id;

    private int parent_id;

    private int class_id;

    private String massage_text;

    private Date massage_date;

    private Time massage_time;


    private static SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy hh:mm");

    public int getMassage_id() {
        return massage_id;
    }

    public void setMassage_id(int massage_id) {
        this.massage_id = massage_id;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getMassage_text() {
        return massage_text;
    }

    public void setMassage_text(String massage_text) {
        this.massage_text = massage_text;
    }

    public Date getMassage_date() {
        return massage_date;
    }

    public void setMassage_date(Date massage_date) {
        this.massage_date = massage_date;
    }

    public Time getMassage_time() {
        return massage_time;
    }

    public void setMassage_time(Time massage_time) {
        this.massage_time = massage_time;
    }

    public static SimpleDateFormat getDf() {
        return df;
    }

    public static void setDf(SimpleDateFormat df) {
        Pisma.df = df;
    }
}
