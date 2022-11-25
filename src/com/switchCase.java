package com;

public class switchCase {

    public static final int part_time =1;
    public static final int full_time =2;
    public static final int emp_per_rate =20;

    public static void main(String[] args) {
        int empHr=0;
        int empWage=0;
        int empCheck = (int) Math.floor(Math.random()*10)%3;
        switch (empCheck){
            case part_time:
                empHr=4;
                break;
            case full_time:
                empHr=8;
                break;
            default:
                empHr=0;
        }

        empWage=empHr*emp_per_rate;
        System.out.println("Emp wage : " + empWage);
    }
}
