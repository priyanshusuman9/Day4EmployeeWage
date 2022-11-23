public class dailyWage {

    public static void main(String[] args) {
        int store= 1;
        int per_Hour= 20;
        int empHr =8;
        int empWage = 0;
        int count = empHr*per_Hour;

        double empValue = Math.floor(Math.random()*10)%2;
        if (store == empValue && store == 1  ){
            System.out.println("Wage is " + count );
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
