import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empID=sc.nextInt();
        String department=sc.next();

        switch (empID){
            case 1:
                System.out.println("Ram");
                break;
            case 2:
                System.out.println("Hanuma");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");    
                        break;
                }
                break;
            default : 
            System.out.println("Enter correct EmpID");
        }

        // better way to write 
        switch (empID){
            case 1 -> System.out.println("Ram");
            case 2 -> System.out.println("Hanuma");
            case 3 ->{
                System.out.println("Emp Number 3");
                switch (department){
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
