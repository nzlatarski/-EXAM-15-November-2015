import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_SoftuniDefenseSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pattern pattern = Pattern.compile("([A-Z][a-z]+).*?([A-Z][a-z]*[A-Z]).*?(\\d+)L");
        long totalPiene = 0;
        while(true) {
            String input = sc.nextLine();
            if (input.equals("OK KoftiShans")) {
                break;
            }
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String name = matcher.group(1);
                String alchohol = matcher.group(2).toLowerCase();
                int liters = Integer.parseInt(matcher.group(3));

                System.out.printf("%s brought %d liters of %s!%n", name, liters , alchohol);
                totalPiene += liters;
            }
        }
        double softuniLiters = totalPiene * 0.001d;
        System.out.printf("%.3f softuni liters", softuniLiters);
    }
}

