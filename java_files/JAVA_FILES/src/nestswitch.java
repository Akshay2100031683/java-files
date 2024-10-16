import java.util.Scanner;

public class nestswitch {
    public static void main(String args[]) {
        int floor;
        int room;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE FLOOR NUMBER: ");
        floor = scanner.nextInt();
        System.out.println("ENTER THE ROOM NO:");
        room = scanner.nextInt();

        switch (floor) {
            case 1:
                System.out.println("IT IS THE FLOOR AT THE TOP OF THE BUILDING");
                break;
            case 2:
                switch (room) {
                    case 1:
                        System.out.println("it is the first floor room no 1122A ");
                        break;
                    case 2:
                        System.out.println("it is the first floor room no 1122B");
                        break;
                }
                break;
            case 3:
                switch (room) {
                    case 1:
                        System.out.println("it is the second floor room no 1122A");
                        break;
                    case 2:
                        System.out.println("it is the second floor room no 1122B");
                        break;
                }
                break;
            case 4:
                switch (room) {
                    case 1:
                        System.out.println("it is the third floor room no 1122A");
                        break;
                    case 2:
                        System.out.println("it is the third floor room no 1122B");
                        break;
                }
                break;
            case 5:
                switch (room) {
                    case 1:
                        System.out.println("it is the fourth floor room no 1122A");
                        break;
                    case 2:
                        System.out.println("it is the fourth floor room no 1122B");
                        break;
                }
                break;
            case 6:
                switch (room) {
                    case 1:
                        System.out.println("it is the fifth floor room no 1122A");
                        break;
                    case 2:
                        System.out.println("it is the fifth floor room no 1122B");
                        break;
                }
                break;
            case 7:
                switch (room) {
                    case 1:
                        System.out.println("it is the sixth floor room no 1122A ");
                        break;
                    case 2:
                        System.out.println("it is the sixth floor room no 1122B");
                        break;

                }
                break;
            case 8:
                switch (room) {
                    case 1:
                        System.out.println("it is the seventh floor room no 1122A ");
                        break;
                    case 2:
                        System.out.println("it is the seventh floor room no 1122B");
                        break;
                }
                break;
            case 9:
                switch (room) {
                    case 1:
                        System.out.println("it is the eigth floor room no 1122A ");
                        break;
                    case 2:
                        System.out.println("it is the eigth floor room no 1122B");
                        break;
                }
                break;
            case 10:
                switch (room) {
                    case 1:
                        System.out.println("it is the ninth floor room no 1122A ");
                        break;
                    case 2:
                        System.out.println("it is the ninth floor room no 1122B");
                        break;
                }
                break;
            case 11:
                switch (room) {
                    case 1:
                        System.out.println("it is the tenth floor room no 1122A ");
                        break;
                    case 2:
                        System.out.println("it is the tenth floor room no 1122B");
                        break;
                }
                break;

        }
        scanner.close();
    }

}
