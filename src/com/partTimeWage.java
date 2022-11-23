public class partTimeWage {

    public static void main(String[] args) {
        int store= 0;
        int per_Hour_Wage= 20;
        int part_Time_per_Hour_Wage= 20;
        int part_Time = 2;
        int empHr =8;
        int empWage = 0;
        int count = empHr*per_Hour_Wage;
        int part_time_Wage= empHr*part_Time_per_Hour_Wage;

        double empValue = Math.floor(Math.random()*10)%2;
        if (store == empValue && store == 1  ){
            System.out.println("Wage is " + count );
        }
        else if(store == empValue && part_Time==2){
            System.out.println("Wage is " + part_Time_per_Hour_Wage);
        }
        else {
            System.out.println("Employee is Absent");
        }
    }}
