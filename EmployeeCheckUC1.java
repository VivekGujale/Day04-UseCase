//Check Employee is Present or Absent
//Use ((RANDOM)) for Attendance check

public class EmployeeCheckUC1 {
    public static void main(String[] args) {
        int isEmpPresent = 1;
        double empCheck = Math.floor(Math.random() * 10 % 2);
        if (isEmpPresent == empCheck) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}