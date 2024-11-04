package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");

        System.out.println("Suma de los primeros 5 números: " + sumNum(5));

        System.out.println("Suma de los primeros 20 números pares: " + sumEvenNum(20));

        System.out.println("Obtén el factorial del número 7 → (7!): " + factorial(7));
        System.out.println("Obtén el factorial del número 7 → (7!): " + recursiveFactorial(7));
    }

    public static int sumNum(int num) {
        int total = 0; //almacena la suma total

        /* Hay que hacer un bucle que sume nº consecutivos
           Se puede hacer con for y con while */
        for (int i = 1; i <= num; i++) { // De 1 a 5 incluído
            total = total + i; //   total += i
        }
        return total;
    }


    public static int sumEvenNum(int num) {
        int total2 = 0;

        for (int i = 2; i <= num * 2; i++) {
            if (i % 2 == 0) {
                total2 = total2 + i; // total2 += i
            }
        }
        return total2;
    }

    public static int factorial(int num) {
        int total3 = 1;

        for (int i = 1; i <= num; i++) {
            total3 = total3 * i;
        }
        return total3;
    }


    public static int recursiveFactorial(int num) {

        if (num == 0) {
            return 1;
        } else {
            return num * recursiveFactorial(num - 1);
        }
    }
}
