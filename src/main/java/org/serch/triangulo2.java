package org.serch;

public class triangulo2 {
    void main()
    {
        IO.println("Ingrese un número entero:");
        int rows = Integer.parseInt(IO.readln());
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                IO.print('*');
            }
            IO.println(' ');
        }
    }
}
