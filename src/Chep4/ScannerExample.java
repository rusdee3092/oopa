package Chep4;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name :");
        String name = sc.nextLine();

        System.out.print("Please enter your age :");
        int age;
        age = sc.nextInt();

        System.out.print("enter saraly :");
        double salary;
        salary = sc.nextDouble();

        System.out.println("Employee name :" + name);
        System.out.println(",age :" + age + ", saraly :" + salary);

        if (age < 1 || age > 65) {
            System.out.println("Error!! age must be 1 - 65");

        } else if (age >= 60) {//มากกว่าหรือเท่ากับ60+
            System.out.println("ผู้ใหญ่");
        } else if (age >= 30) {//มากกว่าหรือเท่ากับ30-59  
            System.out.println("กลางคน");
        } else if (age >= 20) {//มากกว่าหรือเท่ากับ20-29   
            System.out.println("วัยรุ่น");
        } else if (age >= 10) {//มากกว่าหรือเท่ากับ10-19
            System.out.println("เยาวชน");
        } else if (age >= 1) {//มากกว่าหรือเท่ากับ1-9
            System.out.println("เด็ก");
        } else {
            System.out.println("ไม่ระบุวัย");
        }
        
        System.out.print("Enter degree :");
        int degree = sc.nextInt();
        
        switch (degree){
            case 1:
                System.out.println("Bechelor");
                break;
            case 2:
                System.out.println("Master's degree");
                break;
            case 3:
                System.out.println("Phd");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}// end program