package ru.mirea.prac9_10;

public class TopManager implements EmployeePosition {
    private int salary = (int) (Math.random() * 200000 + 300000);

    @Override
    public String getJobTitle() {
        return null;
    }

    @Override
    public double calcSalary() {
        return 0;
    }

    public int getSalary() {
        return salary;
    }
}