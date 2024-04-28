import java.util.Scanner;

public class TrainingPlan {
    private int coachingHours;
    private int chosenPlan;

    public Scanner scanner = new Scanner(System.in);
    String [] trainingPlans = {"Beginner","Intermediate","Elite",};

    
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

    void displayPlan(){
        System.out.println("Choose your plan");
        for(int i = 0; i < trainingPlans.length; i++){
            System.out.println(i+1 + " " + trainingPlans[i].toString());
        }
    }

    void takePersonalCoach(){
        System.out.println("Would you like to take personal coach $9 per hour 0 to 20 hours");
        coachingHours = getValidIndex(5);
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
