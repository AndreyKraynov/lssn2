package AKGB;

public class ScndLsn {

    public static void main(String[] args) {


        //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
        //0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        System.out.println("Задание 1");
        int[] arr = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
        System.out.print("\n");
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.print("\n");

        //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
        //значениями 0 3 6 9 12 15 18 21;
        System.out.println("Задание 2");

        int[] arr2 = new int[8];
        for (int i = 0, j = 0; i < arr2.length; i++, j += 3) {
            arr2[i] = j;
            System.out.print(arr2[i] + " ");
        }


        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
        //умножить на 2;
        System.out.print("\n");
        System.out.println("Задание 3");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};


        for (int i : arr3) {
            System.out.print(i + " ");

        }
        System.out.print("\n");
        for (int i = 0; i < arr3.length; i++) {

            if (arr3[i] < 6) arr3[i] *= 2;

            System.out.print(arr3[i] + " ");
        }

        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов
        //одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        System.out.print("\n");
        System.out.println("Задание 4");


        int a = 4;
        int[][] arr4 = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == j) || (i == a - 1 - j)) {
                    arr4[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\n");
        }

//Задать одномерный массив и найти в нем минимальный и максимальный элементы

        System.out.print("\n");
        System.out.println("Задание 5");

        int[] arr5 = {3, 9, 4, -88, 17, 9, 3, 4, 7, 8, 9, 10};
        int min = arr5[0];
        int max = arr5[0];
        for (int i : arr5) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr5.length; i++) {
            min = Math.min(min, arr5[i]);
            max = Math.max(max, arr5[i]);
        }
        System.out.print("\n");
        System.out.println("Минимальное число: " + min + ", Макисмальное число: " + max);

        //Написать метод, в который передается не пустой одномерный целочисленный массив,
        //метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
        //массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, ||
        //2, 1]) → true, граница показана символами ||, эти символы в массив не входят

      /*  System.out.print("\n");
        System.out.println("Задание 6");
        int[] arr6 = new int[]{1, 1, 1, 2, 1};
        boolean trueOrfalse = true;
        public static boolean checkBalance checkBalance( int[] arr6[ a]);
        System.out.println(trueOrfalse);
        //System.out.println(checkBalanceMet());

        ( int[] arr6[ a]){
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < arr6.length; i++) {
                leftSum = 0;
                rightSum = 0;
                for (int j = 0; j < i; j++) {
                    leftSum += arr6[j];
                }
                for (int j = i; j < arr6.length; j++) {
                    rightSum += arr6[j];
                }
                if (leftSum == rightSum) return true;
            }
            return false;
        }


//Написать метод, которому на вход подается одномерный массив и число n (может быть
//положительным, или отрицательным), при этом метод должен сместить все элементы массива
//на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
//вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5,
//6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете
//выбирать сами.

       /* System.out.print("\n");
        System.out.println("Задание 7");
        int[] arr7 = {1, 5, 7};
        int n = 2;
        System.out.println(offset(int[] arr7, n));


        public static void offset(int[] arr7, n) {
            for (int i = 0, i < arr7.length; i++) {
                int[] arr7 = new int[arr7.length - 1 + n];
            }


        }
*/
    }





}
