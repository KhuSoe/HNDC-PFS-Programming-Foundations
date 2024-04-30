package AtheleteInformation;

import CostCalculation.Person;

import java.util.Scanner;

public class Athlete extends Person {
        Scanner scanner = new Scanner(System.in);
    public Athlete() {
        //get user name
        System.out.println("Enter User Name");
        setName(scanner.nextLine().trim());
        while (getName().isEmpty()) {
            System.out.println("You need to set the user name");
            setName(scanner.nextLine().trim());
        }

        //get user age
        System.out.println("Enter Age");
        setAge(getIntInput());

        //get user plan
        displayPlan();
        setChosenPlan(getValidIndex(getTrainingPlans().length));

        //get user weight
        System.out.println("Enter weight in kg");
        setWeight(getIntInput());
        
        //ask tournament
        askTournament();

        //ask for personal coach
        takePersonalCoach();
    }
} 

