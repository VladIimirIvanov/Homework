package lesson2;

public class HW2 {

    public static void main (String[] args) {

        from10to20(10,10);
        positiveOrNegative(0);
        negativeCheckout(0);
        printText("Слава роботам!",5 );
    }

    public static boolean from10to20(int a, int b) {

        int result = a + b;

        if (result >= 10 && result <=20) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void positiveOrNegative(int a) {

        if (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean negativeCheckout(int a) {

        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void printText(String text, int a) {

        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }
}
