import java.util.Scanner;

public class Tournament extends TrainingPlan{

    private int noOfCompetition = 0;
    private int chosenWeightClass;
    
    String [] weightCategories = {"HeavyWeight","LightHeavyWeight","MiddleWeight","LightMiddleWeight","LightWeight","FlyWeight"};

    public int getNoOfCompetition() {
        return noOfCompetition;
    }

    public void setNoOfCompetition(int noOfCompetition) {
        this.noOfCompetition = noOfCompetition;
    }

    public int getChosenWeightClass() {
        return chosenWeightClass;
    }

    public void setChosenWeightClass(int chosenWeightClass) {
        this.chosenWeightClass = chosenWeightClass;
    }

    boolean approveTournament(){
        if (getChosenPlan() > 1) {
            return true;
        }
        return false;
    }

    void askTournement(){
        if (approveTournament()) {
            System.out.println("You are eligible for weight competition, would you like to compete y/n");
            if (scanner.next().equals("y")) {
                System.out.println("Choose your weight class");
                for(int i = 0; i < weightCategories.length; i ++){
                    System.out.println((i+1) + " " + weightCategories[i].toString());
                }
                chosenWeightClass = getValidIndex(weightCategories.length);

                System.out.println("How many times would you like to compete $22 per competition");
                noOfCompetition = getValidIndex(2);
            }
        }
    }
}
