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
} 

