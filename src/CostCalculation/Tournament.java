package CostCalculation;

public class Tournament extends TrainingPlan {

    private int noOfCompetition = 0;
    private int chosenWeightClass;
    
    public String [] weightCategories = {"HeavyWeight - 66 kg","LightHeavyWeight - 73 kg","MiddleWeight - 81 kg","LightMiddleWeight - 90 kg","LightWeight - 100kg","FlyWeight - over 100kg"};

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

    public void askTournament() {
        if (approveTournament()) {
            System.out.println("You are eligible for weight competition, would you like to compete y/n");
            if (scanner.next().equals("y")) {
                System.out.println("Choose your weight class");

                // Print table header in yellow
                System.out.print("\033[0;43m"); // ANSI escape code for yellow background
                System.out.printf("%-10s %-20s\n", "Option", "Weight Class");
                System.out.print("\033[0m"); // Reset color

                for (int i = 0; i < weightCategories.length; i++) {
                    System.out.printf("%-10d %-20s\n", (i + 1), weightCategories[i].toString());
                }
                chosenWeightClass = getValidIndex(weightCategories.length);

                System.out.println("How many times would you like to compete $22 per competition");
                noOfCompetition = getValidIndex(2);
            }
        }
    }

}
