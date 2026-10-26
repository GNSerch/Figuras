package org.serch;

public class triangulo4_pro {
    static void espacios(int x, int i) {
        for (int j = x; j > i; j--)
        {
            IO.print(' ');
        }
    }
    static void asteriscos(int i) {
        for (int k = 1; k <= i; k++)
        {
            IO.print('*');
        }
    }
    static void rows (int rows) {
        for (int i = rows; i >= 1; i--)
        {
            espacios(rows, i);
            asteriscos(i);
            IO.println(' ');
        }
    }
    void main() {
        IO.println("Ingrese un número entero: ");
        int triag = Integer.parseInt(IO.readln());
        rows(triag);
    }
}
