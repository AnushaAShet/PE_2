package com.stackroute;
import java.lang.Math;

public class Powerof4 {
    int n=0;
    static int getDisplay(int n)
    {
        if(n == 0)
            return 0;
        while(n != 1)
        {
            if(n % 4 == 0)
                return 0;
            n = n / 4;
        }
        return 1;


    }

}

