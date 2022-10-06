//Calculating Wages for a Month
//Assume 20 Working Day per Month

public class EmpWagesForMonthUC5 {
    public static void main(String[] args) {
        int isPartTime = 1;
        int isFullTime = 2;
        int empRatePerHr = 20;
        int numWorkingDays = 20;
        int empHrs, empWage = 0, totalEmpWage = 0;
        double empCheck = Math.floor(Math.random() * 10 % 3);
        for (int day = 1; day <= 20; day++) {
            if (empCheck == isPartTime) {
                empHrs = 8;
            } else if (empCheck == isFullTime) {
                empHrs = 16;
            } else {
                empHrs = 0;

            }
            empWage = empRatePerHr * empHrs;
            totalEmpWage = totalEmpWage + empWage;
        }
        System.out.println("Total Employee Wage for month =" + totalEmpWage);
    }
}