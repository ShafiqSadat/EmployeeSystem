
package com.ShafiqSadat.mavenwithgui;
import java.io.*;
public class Employee implements Serializable {
    private String name;
    private String surName;
    private Job job;
    private int staffNr;

    public Employee(String name, String surName, Job job, int staffNr) {
        this.name = name;
        this.surName = surName;
        this.job = job;
        this.staffNr = staffNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getStaffNr() {
        return staffNr;
    }

    public void setStaffNr(int staffNr) {
        this.staffNr = staffNr;
    }
}
