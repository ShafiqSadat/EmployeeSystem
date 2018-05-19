
package com.ShafiqSadat.mavenwithgui;

import java.io.*;
import java.util.Objects;

public class Job implements Serializable{
    private double salary;
    private String nameOfJob;

    public Job(double salary, String nameOfJob) {
        this.salary = salary;
        this.nameOfJob = nameOfJob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNameOfJob() {
        return nameOfJob;
    }

    public void setNameOfJob(String nameOfJob) {
        this.nameOfJob = nameOfJob;
    }


    public boolean equals(Job job) {
        return (this.nameOfJob.equals(job.nameOfJob)&&this.salary==job.salary);
    }

    @Override
    public int hashCode() {

        return Objects.hash(salary, nameOfJob);
    }
}

