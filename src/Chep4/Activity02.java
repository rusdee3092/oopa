package Chep4;
import java.util.Scanner;

public class Activity02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int register = 13;
        int menu;
        do {
            System.out.println("1.เข้าสู่ระบบ\n2.จบการทำงาน");
            System.out.print("โปรดเลือก : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("เข้าสู่ระบบเรียบร้อยแล้ว");
                    System.out.print("น้ำหนักของจดหมาย(กรัม) : ");
                    int weight = sc.nextInt();
                    System.out.print("ประเถทของจดหมาย\n 1.ส่งแบบธรมดา\n 2.ส่งแบบธรรมดา+ลงทะเบียน\n 3.ส่งแบบEMS");
                    System.out.print("\nเลือก : ");
                    int category = sc.nextInt();
                    switch (category) {
                        case 1:
                            System.out.println("ส่งแบบธรมดา");
                            if (weight <= 0) {
                                System.out.println("โปรดกรอก 1 กรัม ขึ้นไป");
                            } else if (weight <= 20) {
                                System.out.println("ราคา 3 บาท");
                            } else if (weight > 20 && weight <= 100) {
                                System.out.println("ราคา 5 บาท");
                            } else if (weight > 100 && weight <= 250) {
                                System.out.println("ราคา 9 บาท");
                            } else if (weight > 250 && weight <= 500) {
                                System.out.println("ราคา 15 บาท");
                            } else if (weight > 500 && weight <= 1000) {
                                System.out.println("ราคา 25 บาท");
                            } else if (weight > 1000 && weight <= 2000) {
                                System.out.println("ราคา 45 บาท");
                            } else if (weight > 2000) {
                                System.out.println("น้ำหนักเกินไม่สามารถส่งได้");
                            }
                            break;
                        case 2:
                            System.out.println("ส่งแบบธรมดา+ลงทะเบียน");
                            if (weight <= 0) {
                                System.out.println("โปรดกรอก 1 กรัม ขึ้นไป");
                            } else if (weight <= 20) {
                                System.out.println("ราคา" + (3 + register) + " บาท");
                            } else if (weight > 20 && weight <= 100) {
                                System.out.println("ราคา" + (5 + register) + " บาท");
                            } else if (weight > 100 && weight <= 250) {
                                System.out.println("ราคา" + (9 + register) + " บาท");
                            } else if (weight > 250 && weight <= 500) {
                                System.out.println("ราคา" + (15 + register) + " บาท");
                            } else if (weight > 500 && weight <= 1000) {
                                System.out.println("ราคา" + (25 + register) + " บาท");
                            } else if (weight > 1000 && weight <= 2000) {
                                System.out.println("ราคา" + (45 + register) + " บาท");
                            } else if (weight > 2000) {
                                System.out.println("น้ำหนักเกินไม่สามารถส่งได้");
                            }
                            break;
                        case 3:
                            System.out.println("ส่งแบบEMS");
                            if (weight <= 0) {
                                System.out.println("โปรดกรอก 1 กรัม ขึ้นไป");
                            } else if (weight <= 20) {
                                System.out.println("ราคา 27 บาท");
                            } else if (weight > 20 && weight <= 100) {
                                System.out.println("ราคา 32 บาท");
                            } else if (weight > 100 && weight <= 250) {
                                System.out.println("ราคา 37 บาท");
                            } else if (weight > 250 && weight <= 500) {
                                System.out.println("ราคา 47 บาท");
                            } else if (weight > 500 && weight <= 1000) {
                                System.out.println("ราคา 62 บาท");
                            } else if (weight > 1000 && weight <= 2000) {
                                System.out.println("ราคา 77 บาท");
                            } else if (weight > 2000) {
                                System.out.println("น้ำหนักเกินไม่สามารถส่งได้");
                            }
                            break;
                        default:
                            System.out.println("โปรดเลือก 1-3 เท่านั้น");
                            break;
                    }   break;
                case 2:
                    System.out.println("ออกจากระบบ");
                    break;
                default:
                    System.out.println("โปรดเลือก 0 กับ 1 เท่านั้น");
                    break;
            }
        } while (menu != 2);
    }
}//end program
