package org.serch;

public class triangulo2_pro {
    static void asteriscos(int rows) {
        for (int j = 1; j <= rows; j++)
        {
            IO.print('*');
        }
    }
    static void rows(int rows) {
        for (int i = rows; i >= 1; i--)
        {
            asteriscos(i);
            IO.println(' ');
        }
    }
    static void main() {
        IO.println("Ingrese un número entero: ");
        int triag = Integer.parseInt(IO.readln());
        rows(triag);
    }
}
