import java.util.Scanner;

public class nestedswitch {
    public static void main(String args[]) {
        char branch;
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter branch:");
        branch = scanner.next().charAt(0);
        System.out.println("Enter year:");
        year = scanner.nextInt();

        switch (year) {
            case 1:
                System.out.println("YOU ARE I FIRST YEAR");

                break;
            case 2:
                switch (branch) {
                    case 'C':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'M':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'E':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;

                }
                break;
            case 3:
                switch (branch) {
                    case 'C':
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'M':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'E':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch (branch) {
                    case 'C':
                        System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;

                }
                break;

        }
        scanner.close();

    }
}
