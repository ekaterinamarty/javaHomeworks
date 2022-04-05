package thirdHomework;

public class thirdHW<b> {
    public static void main(String[] args) {
        invertArray(); //1
        fillArray(); //2
        changeArray(); //3
        fillDiagonal(); //4
        lenInitialValue(6, 563); //5
        minMaxValue(); //6
        int[] a = { 2, 2, 2, 1, 2, 2, 10, 1 };
        System.out.println(leftRightSumComparison(a)); //7
//        int[] b = { 1, 2, 3, 4, 5, 6, 7 };
//        System.out.println(moovingElements(b, 2)); //8
    }


    //1
    public static void invertArray() {
        int[] a = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int j : a) System.out.print(j);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] == 0 ? 1 : 0;
            System.out.print(a[i]);
        }
        System.out.println();
    }

    //2
    public static void fillArray() {
        int[] fillArray = new int[100];
        for (int i = 0; i < fillArray.length; i++) {
            fillArray[i] = i + 1;
        }
        for (int j : fillArray)
            System.out.print(j + " ");
        System.out.println();
    }

    //3
    public static void changeArray() {
        int[] c = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int j : c) System.out.print(j + " ");
        System.out.println();
        for (int i = 0; i < c.length; i++) {
            c[i] = c[i] < 6 ? c[i] * 2 : c[i];
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }

    //4
    public static void fillDiagonal() {
        int[][] d = new int[5][5];
        for (int i = 0; i < d.length; i++) {
            d[i][i] = 1;
            d[4 - i][i] = 1;
        }
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++)
                System.out.print(d[i][j]);
            System.out.println();
        }
    }

    //5
    public static int[] lenInitialValue(int len, int initialValue) {
        int[] c = new int[len];
        for (int i = 0; i < c.length; i++) {
            c[i] = initialValue;
            System.out.print(c[i] + " ");
        }
        System.out.println();
        return c;
    }

    //6
    public static void minMaxValue() {
        int[] a = { 15, 19, 10, 12, 14, 61, 81, 18, 13 };
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        } System.out.println(min);
          System.out.println(max);
    }

    //7
    public static boolean leftRightSumComparison(int[] a) {
        for (int k = 0; k < a.length; k++) {
            int ls = 0;
            for (int i = 0; i < k; i++) {
                ls = ls + a[i];
            }
            int rs = 0;
            for (int i = k; i < a.length; i++) {
                rs = rs + a[i];
            }
            if (ls == rs) {
                return true;
            }
        }
        return false;
    }

    //8. *** Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
// Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
// Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
// [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
// При каком n в какую сторону сдвиг можете выбирать сами.

//    public static int[] moovingElements(int[] b, int n) {
//        for (int i = 0; i > 0; i++) {
//            b[i + n] = b[i];
//            int[] c = new int[b.length];
//            b[(i + n) % b.length] = b[i];
//        }
//        System.out.println();
//        return ;
//    }



}

