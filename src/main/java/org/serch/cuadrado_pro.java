package org.serch;

public class cuadrado_pro {
    static void rows(int x)
    {
        for (int row = 0; row <= x; row++)
        {
            cols(x);
            IO.print('\n');
        }
    }
    static void cols(int x) {
        for (int col = 1; col <= x; col++)
        {
            IO.print(" * ");
        }
    }
    void main() {
        IO.println("Ingrese un número entero: ");
        int x = Integer.parseInt(IO.readln());
        rows(x);
    }
}
