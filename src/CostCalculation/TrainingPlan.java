package CostCalculation;

import java.util.Scanner;

public class TrainingPlan {
    private int coachingHours = 0;
    private int chosenPlan;

    public Scanner scanner = new Scanner(System.in);
    public String [] trainingPlans = {"Beginner","Intermediate","Elite",};

    
    public String[] getTrainingPlans() {
        return trainingPlans;
    }

    public void setTrainingPlans(String[] trainingPlans) {
        this.trainingPlans = trainingPlans;
    }

    public int getChosenPlan() {
        return chosenPlan;
    }

    public void setChosenPlan(int chosenPlan) {
        this.chosenPlan = chosenPlan;
    }

    public int getCoachingHours() {
        return coachingHours;
    }

    public void setCoachingHours(int coachingHours) {
        this.coachingHours = coachingHours;
    }

    public void displayPlan() {
        System.out.println("Choose your plan");

        // Print table header in yellow
        System.out.print("\033[0;43m"); // ANSI escape code for yellow background
        System.out.printf("%-10s %-20s\n", "Option", "Training Plan");
        System.out.print("\033[0m"); // Reset color

        for (int i = 0; i < trainingPlans.length; i++) {
            System.out.printf("%-10d %-20s\n", (i + 1), trainingPlans[i].toString());
        }
    }


    public void takePersonalCoach(){
        System.out.println("Would you like to take personal Coach y/n");
        String yes = scanner.next();
        if (yes.trim().toLowerCase().charAt(0) == 'y'){
            System.out.println("Would you like to take personal coach $9 per hour 0 to 20 hours");
            coachingHours = getValidIndex(5);
        }
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
}
