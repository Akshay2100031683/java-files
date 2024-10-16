public class Array {
    public static void main(String args[]) {
        int arr[];
        arr = new int[5];
        arr[0] = 25;
        arr[1] = 50;
        arr[2] = 75;
        arr[3] = 100;
        arr[4] = 125;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("element at the index of " + i + " = " + arr[i]);
        }
    }
}
