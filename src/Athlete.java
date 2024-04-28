import java.util.Scanner;

public class Athlete extends Person{
        Scanner scanner = new Scanner(System.in);
    public Athlete () {
        //get user name
        System.out.println("Enter Name");
        setName(scanner.nextLine());

        //get user age
        System.out.println("Enter Age");
        setAge(getIntInput());

        //get user weight
        System.out.println("Enter weight in kg");
        setWeight(getIntInput());

        //get user plan
        displayPlan();
        setChosenPlan(getValidIndex(getTrainingPlans().length));

        //ask tournament
        askTournement();

        //ask for personal coach
        takePersonalCoach();
    }

    public int getIntInput() {
        int input;

        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
            }
        }
        return input;
    }

    public int getValidIndex(int maxLength) {
        int index;
        while (true) {
            System.out.print("Enter index (not more than " + maxLength + "): ");
            if (scanner.hasNextInt()) {
                index = scanner.nextInt();
                if (index >= 1 && index <= maxLength) {
                    break; // Exit the loop if the index is valid
                } else {
                    System.out.println("Invalid index. Please enter a valid index.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
        }
        return index;
    }
} 

