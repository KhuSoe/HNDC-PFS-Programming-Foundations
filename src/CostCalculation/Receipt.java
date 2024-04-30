package CostCalculation;

import AtheleteInformation.Athlete;

import java.util.ArrayList;

public class Receipt implements FeeCalculator {
    private static int packageCost = 0;
    private static int coachFee = 0;
    private static int tournamentFee = 0;
    private static int totalCost = 0;


    public void showReceipt(ArrayList<Athlete> athletes) {
        // Print table header in yellow
        System.out.print("\033[0;43m"); // ANSI escape code for yellow background
        System.out.printf("%-20s %-10s %-20s %-15s %-15s %-15s\n", "Name", "Age", "Package", "Coaching Fee", "Tournament Fee", "Total Cost");
        System.out.print("\033[0m"); // Reset color

        for (Athlete athlete : athletes) {
            calculateCost(athlete);
            System.out.printf("%-20s %-10d %-20s ", athlete.getName(), athlete.getAge(), athlete.trainingPlans[athlete.getChosenPlan() - 1]);

            // Check if coaching fee is applicable
            if (coachFee > 0) {
                System.out.printf("$%-14d ", coachFee);
            } else {
                System.out.printf("%-15s ", "N/A");
            }

            // Check if tournament fee is applicable
            if (tournamentFee > 0) {
                System.out.printf("$%-14d ", tournamentFee);
            } else {
                System.out.printf("%-15s ", "N/A");
            }

            System.out.printf("$%d\n", totalCost);
        }
    }

    @Override
    public void calculateCost(Athlete athlete) {
        switch (athlete.getChosenPlan()) {
            case 1:
                packageCost = 25 * 4;
                break;

            case 2:
                packageCost = 30 * 4;
                break;

            case 3:
                packageCost = 35 * 4;
                break;

            default:
                break;
        }

        if (athlete.getCoachingHours() > 0) {
            coachFee = athlete.getCoachingHours() * 9;
        }

        if (athlete.getNoOfCompetition() > 0) {
            tournamentFee = athlete.getNoOfCompetition() * 22;
        }

        totalCost = packageCost + coachFee + tournamentFee;
    }
}
