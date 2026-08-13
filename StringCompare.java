import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second employee name: ");
        String name2 = sc.nextLine();

        // Compare names
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Both employees have the same name.");
        } else {
            System.out.println("Employee names are different.");
        }

        System.out.println("Length of first name: " + name1.length());
        System.out.println("Length of second name: " + name2.length());

        sc.close();
    }
}