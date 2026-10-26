package org.serch;

public class cuadrado {
    void main()
    {
        IO.println("Ingrese un número entero:");
        int x = Integer.parseInt(IO.readln());
        for (int row = 0; row < x; row++)
        {
            for (int col = 0; col < x; col++)
            {
                IO.print(" * ");
            }
            IO.println(' ');
        }
    }
}

