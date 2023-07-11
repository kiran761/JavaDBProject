package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("1. ADD into DB");
            System.out.println("2.Update DB");
            System.out.println("3. Delete from DB");
            System.out.println("4. Select from DB");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter id");
                    int id1 = sc.nextInt();
                    System.out.println("Enter Name");
                    String name1 = sc.next();
                    System.out.println("Enter Age");
                    int age1 = sc.nextInt();
                    System.out.println("Enter Addresss");
                    String address1 = sc.next();

                    Student s1 = new Student();
                    s1.setId(id1);
                    s1.setName(name1);
                    s1.setAge(age1);
                    s1.setAddress(address1);
                    int count1 = dao.addDetails(s1);
                    System.out.println(count1 + "  Added Successfully");

                    break;
                case 2:
                    System.out.println("Enter id");
                    int id2 = sc.nextInt();
                    System.out.println("Enter Name");
                    String name2 = sc.next();
                    System.out.println("Enter Age");
                    int age2 = sc.nextInt();
                    System.out.println("Enter address");
                    String address2 = sc.next();

                    Student s2 = new Student();
                    s2.setId(id2);
                    s2.setName(name2);
                    s2.setAge(age2);
                    s2.setAddress(address2);

                    int count2 = dao.updateDetails(s2);
                    System.out.println(count2 + " Updated Successfully");

                    break;
                case 3:
                    System.out.println("Enter Id");
                    int id3 = sc.nextInt();
                    int count3 = dao.deleteDetails(id3);
                    System.out.println(count3 + " Deleted Successfully");
                    break;
                case 4:
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }

}
