//Calculate Daily Employee Wage
//Assume wage per hour is 20
//Assume full Day is 8.

public class EmpWageUC2 {
    public static void main(String[] args) {
        int isFullTime = 1;
        int empRatePerHr = 20;
        int empHrs, empWage = 0;
        double empCheck = Math.floor(Math.random() * 10 % 2);
        if (empCheck == isFullTime) {
            empHrs = 8;
        } else {
            empHrs = 0;
        }
        empWage = empRatePerHr * empHrs;
        System.out.println("Employee Wage=" + empWage);
    }
}
