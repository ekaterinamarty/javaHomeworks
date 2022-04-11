package fourthHW;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class fourthHW {
    //Создание игрового поля
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;

    //Ячейки поля
    public static final char DOT_X = 'X';
    public static final char DOT_O = '0';
    public static final char DOT_EMPTY = '.';

    public static void main (String[] args) {
        initMap();
        showMap();

        while (true) {
            humanTurn();
            showMap();
            if (isWinner(DOT_X)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            showMap();
            if (isWinner(DOT_O)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    //1. Инициализация игрового поля
    public static void initMap () {
        map = new char[SIZE][SIZE];                             //выделено место в памяти под игровое поле размером 3*3 (5*5)
        for (int row = 0; row < SIZE; row++) {                  //столбцы
            for (int column = 0; column < SIZE; column++) {     //строки
                map[row][column] = DOT_EMPTY;                   //двойным циклом заполняем ячейки поля точками
            }
        }
    }

    //2. Вывод игрового поля в консоль
    public static void showMap() {
        for (int i = 0; i <= SIZE; i++) {                        //шапка(верхняя строка)
            System.out.print(i + " ");
        }
        System.out.println();                                   //переходим на след строку, после того как нарисовали шапку
        for (int i = 0; i < SIZE; i ++) {                       //рисуем, что ниже шапки двойным уиклом
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {                    //ходим по колонкам и пропечатываем точки
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    //3. Ход человека
    public static void humanTurn() {
        Scanner scanner = new Scanner(System.in);   //считываем данные из консоли
        int x;                                      //в этих переменных они будут храниться
        int y;
        do {                                        //цикл будет выполняться до тех пока не будут введены корректные значения
            System.out.println("Введите координаты в формате X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));   // логическое отрицание

        map[y][x] = DOT_X;              //человек ходит крестиками
    }

    //5. Ход ИИ
    public static void aiTurn() {
        Random random= new Random();
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер сходил в координаты: X:" + (x + 1) + " Y:" + (y + 1));
        map[y][x] =DOT_O;
    }

    //4. Проверка ячейки
    public static boolean isCellValid(int x, int y) {
        if( x < 0 || x > SIZE || y < 0 || y > SIZE) {       //если х или y нарушают границы массива - возвращаем false
            return false;
        }
        return map[y][x] == DOT_EMPTY;                      //х - это горизонтальная ось (строка),
    }

    //6. Алгоритм проверки победы
    public static boolean isWinner(int offset_x, int offset_y, char symb) {
    // вариант с полинейной проверкой
    //        for (int i = 0; i < SIZE; i++) {
    //            if ((map[i][0] == symb && map[i][1] == symb && map[i][2] == symb) ||
    //                    (map[0][i] == symb && map[1][i] == symb && map[2][i] == symb))
    //                return true;
    //            if ((map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) ||
    //                    (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb))
    //                return true;
    //        }

    // проверка для любого игрового поля (ДЗ * 3)
        //с отступами по координатам
        int[] sy = new int[DOTS_TO_WIN];
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            int sx = 0;
            for (int j = 0; j < DOTS_TO_WIN; j++) {
                if (map[offset_x + i][offset_y + j] == symb) {
                    sx = sx + 1; //строка
                    sy[j] = sy[j] + 1; //столбец
                    if (i == j) d1++; //диагональ1
                    if (i == DOTS_TO_WIN - j - 1) d2++; //диагональ2
                }
            }
            if (sx == DOTS_TO_WIN) return true;
        }
        if (d1 == DOTS_TO_WIN || d2 == DOTS_TO_WIN) return true;
        for (int i = 0; i < DOTS_TO_WIN; i++)
            if (sy[i] == DOTS_TO_WIN) return true;
        return false;
    }

    public static boolean isWinner(char symb) {
        for (int r = 0; r <= SIZE - DOTS_TO_WIN; r++) {
            for (int c = 0; c <= SIZE - DOTS_TO_WIN; c++)
                if (isWinner(r, c, symb))
                    return true;
        }
        return false;
    }

    //7. Проверяем ничью
    public static boolean isMapFull() {
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                if (map[row][column] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}












