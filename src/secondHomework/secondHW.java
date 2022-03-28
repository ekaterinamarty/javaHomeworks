package secondHomework;

public class secondHW {
    public static void main(String[] args) {
        System.out.println(sumMethod(10, 13));
        positiveOrNegative(-8);
        System.out.println(isItNegative(-8));
        printString(4, "It is snowing today");
        System.out.println(leapYear(1700));
    }

   //1
    public static boolean sumMethod(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

   //2
    public static void positiveOrNegative(int x) {
        if(x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

   //3
    public static boolean isItNegative(int y) {
        return y <= 0;
    }

    //4
    public static void printString(int n, String message){
        for (int i = 0; i < n; i++) {
           System.out.println(message);
        }
    }

    //5*
    public static boolean leapYear(int i) {
        return i % 400 == 0 || i % 4 == 0 && i % 100 != 0;
    }
}




