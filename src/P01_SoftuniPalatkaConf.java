import java.util.Scanner;

public class P01_SoftuniPalatkaConf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPeople = sc.nextInt();
        int linesInput = sc.nextInt();
        sc.nextLine();

        int totalBeds = 0;
        int totalFood = 0;

        for (int i = 0; i < linesInput; i++) {
            String[] info = sc.nextLine().split("\\s+");
            String something = info[0];
            int count = Integer.parseInt(info[1]);
            String type = info[2];

            if (something.equals("tents")) {
                if (type.equals("normal")){
                    totalBeds += 2 * count;
                } else { //firstClass
                    totalBeds += 3 * count;
                }
            } else if (something.equals("rooms")) {
                if (type.equals("single")){
                    totalBeds += count;
                } else if (type.equals("double")) {
                    totalBeds += 2 * count;
                } else { //triple
                    totalBeds += 3 * count;
                }
            } else { //food
                if (type.equals("musaka")){
                    totalFood += 2 * count;
                }
            }
        }
        if (totalPeople > totalBeds) {
            System.out.printf("Some people are freezing cold. Beds needed: %d%n", totalPeople - totalBeds);
        } else {
            System.out.printf("Everyone is happy and sleeping well. Beds left: %d%n",totalBeds - totalPeople);
        }
        if ( totalPeople > totalFood) {
            System.out.printf("People are starving. Meals needed: %d%n", totalPeople - totalFood);
        } else {
            System.out.printf("Nobody left hungry. Meals left: %d%n", totalFood - totalPeople);
        }
    }
}
