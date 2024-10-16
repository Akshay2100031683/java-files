public class Inheritence {
    public static void main(String args[])
    {
    int m = 20, n = 78;

    void display1() {
        System.out.println("the value of m and n are" + m + " " + n);
    }
}

    class B extends Inheritence {
        int c = 80;

        void display2() {
            System.out.println("the value of c is" + c);
        }

        void sum() {

            System.out.println("the sum of m+n+c is" + (n + n + c));

        }
    }
}
