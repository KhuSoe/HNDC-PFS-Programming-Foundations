public class Reciept {
    private static Client client = new Client();
    private static Tournament plan = new Tournament();
    private static int packageCost = 0;
    private static int coachFee = 0;
    private static int tournamentFee = 0;
    private static int totalCost = 0;
    
    static void showReceipt (Client client, Tournament plan){
        calculateCost(plan);
        System.out.println("Name: " + client.getName());
        System.out.println("Package: " + plan.trainingPlans[plan.getChosenPlan()-1] + " - $" + packageCost);
        if (coachFee > 0) {
            System.out.println("Coaching Fee: " + plan.getCoachingHours() + " hour" + " x $9 - $" + coachFee);
        }
        if (tournamentFee > 0) {
            System.out.println("Tournamet Fee: " + plan.getNoOfCompetition() + " competition x $22 - " + tournamentFee);
            System.out.println("Current weight compare to tournament weight: \n\t current weight: " + client.getWeight() + " kg\n\t competition weight: " + plan.weightCategories[plan.getChosenWeightClass()]);
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    static void calculateCost(Tournament plan){
        switch (plan.getChosenPlan()) {
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

        if (plan.getCoachingHours() > 0) {
            coachFee = plan.getCoachingHours()*9;
        }

        if (plan.getNoOfCompetition() > 0){
            tournamentFee = plan.getNoOfCompetition()*22;
        }

        totalCost = packageCost + coachFee + tournamentFee;
    }
}
