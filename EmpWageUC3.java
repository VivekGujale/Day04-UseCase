//Add Part time Employee & Wage
//Assume Part time Hour is 8

public class EmpWageUC3 {
    public static void main(String[] args) {
        int isPartTime = 1;
        int isFullTime = 2;
        int empRatePerHr = 20;
        int empHrs, empWage = 0;
        double empCheck = Math.floor(Math.random() * 10 % 3);
        if (empCheck == isPartTime) {
            empHrs = 8;
        } else if (empCheck == isFullTime) {
            empHrs = 16;
        } else {
            empHrs = 0;
        }
        empWage = empRatePerHr * empHrs;
        System.out.println("Employee Wage =" + empWage);
    }
}
