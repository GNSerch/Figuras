package org.serch;

public class triangulo4 {
    void main()
    {
        IO.println("Ingrese un número entero:");
        int rows = Integer.parseInt(IO.readln());
        for (int i = rows; i >= 1; i--)
        {
            for (int j = rows; j > i; j--)
            {
                IO.print(' ');
            }
            for (int k = 1; k <= i; k++)
            {
                IO.print('*');
            }
            IO.println(' ');
        }
    }
}
