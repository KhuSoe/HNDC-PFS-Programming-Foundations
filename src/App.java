import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        Client client = new Client();
        Tournament plan = new Tournament();

        //get user name
        System.out.println("Enter Name");
        client.setName(scanner.nextLine());

        //get user age
        System.out.println("Enter Age");
        client.setAge(scanner.nextInt());

        //get user weight
        System.out.println("Enter weight in kg");
        client.setWeight(scanner.nextInt());

        //get user plan
        plan.displayPlan();
        plan.setChosenPlan(scanner.nextInt());

        //ask tournament
        plan.askTournement();

        //ask for personal coach
        plan.takePersonalCoach();

        //show receipt  
        Reciept.showReceipt(client, plan);
    }
}
