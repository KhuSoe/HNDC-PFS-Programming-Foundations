public class Reciept {
    private static int packageCost = 0;
    private static int coachFee = 0;
    private static int tournamentFee = 0;
    private static int totalCost = 0;
    
    static void showReceipt (Athlete athlete){
        calculateCost(athlete);
        System.out.println("Name: " + athlete.getName());
        System.out.println("Age: " + athlete.getAge());
        System.out.println("Package: " + athlete.trainingPlans[athlete.getChosenPlan()-1] + " - $" + packageCost);
        if (coachFee > 0) {
            System.out.println("Coaching Fee: " + athlete.getCoachingHours() + " hour" + " x $9 - $" + coachFee);
        }
        if (tournamentFee > 0) {
            System.out.println("Tournamet Fee: " + athlete.getNoOfCompetition() + " competition x $22 - " + tournamentFee);
            System.out.println("Current weight compare to tournament weight: \n\t current weight: " + athlete.getWeight() + " kg\n\t competition weight: " + athlete.weightCategories[athlete.getChosenWeightClass()-1]);
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    static void calculateCost(Athlete athlete){
        switch (athlete.getChosenPlan()) {
            case 1:
                packageCost = 25*4;
                break;
            
            case 2:
                packageCost = 30*4;
                break;

            case 3:
                packageCost = 35*4;
                break;

            default:

                break;
        }

        if (athlete.getCoachingHours() > 0) {
            coachFee = athlete.getCoachingHours()*9;
        }

        if (athlete.getNoOfCompetition() > 0){
            tournamentFee = athlete.getNoOfCompetition()*22;
        }

        totalCost = packageCost + coachFee + tournamentFee;
    }
}
