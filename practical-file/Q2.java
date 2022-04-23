import java.util.Scanner;
class Q2{
    public static void main(String[]args){
    Scanner myObj = new Scanner(System.in);      
    System.out.println("Enter name, age and Salary:");
    String name = myObj.nextLine();
    int age = myObj.nextInt();
    double Salary = myObj.nextDouble();

    System.out.println("Name:" + name);
    System.out.println("Age:" + age);
    System.out.println("Salary:" + Salary);
    }
}