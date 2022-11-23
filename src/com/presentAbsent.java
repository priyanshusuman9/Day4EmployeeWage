public class presentAbsent {


    public static void main(String[] args) {
        int days = 0;
        double store = Math.floor(Math.random()*10)%2;
        if (store == days && store == 1  ){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
