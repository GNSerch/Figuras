package org.serch;

public class triangulo1 {
    void main()
    {
        IO.println("Ingrese un número entero:");
        int rows = Integer.parseInt(IO.readln());
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                IO.print('*');
            }
            IO.println(' ');
        }
    }
}
