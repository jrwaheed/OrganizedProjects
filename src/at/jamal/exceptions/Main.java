package at.jamal.exceptions;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = null;
            String myUserInput = scanner.nextLine();
        } catch (Exception ex){

        }
        try{
        int[] myLottoNumbers ={1, 2, 17, 24, 35, 41, 48};
        int mySelectedNumber = myLottoNumbers[7];
        } catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("This number does not work");
        }
        System.out.println("Hello World");

        Department head = new Department("Vorstand", 2);
        Department purchasing = new Department("Purchasing", 0);
        Department sales = new Department("Sales", 0);
        Department purchasingEU = new Department("Purchasing (EU)",0);

        try {
            head.addSubDepartment(purchasing);
            head.addSubDepartment(sales);
            purchasing.addSubDepartment(purchasingEU);

        } catch(SameDepartmentException ex) {
            System.out.println(ex.getMessage());
        } catch(TooManyDepartmentsException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
