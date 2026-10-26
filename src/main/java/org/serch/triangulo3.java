package org.serch;

public class triangulo3 {
    void main()
    {
        IO.println("Ingrese un número entero:");
        int rows = Integer.parseInt(IO.readln());
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= rows - i; j++)
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
