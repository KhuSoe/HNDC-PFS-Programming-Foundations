import java.util.Scanner;

public class TrainingPlan {

    private int coachingHours;
    private static int chosenPlan;

    Scanner scanner = new Scanner(System.in);
    String [] trainingPlans = {"Beginner","Intermediate","Elite",};

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
        coachingHours = scanner.nextInt();
    }
}
